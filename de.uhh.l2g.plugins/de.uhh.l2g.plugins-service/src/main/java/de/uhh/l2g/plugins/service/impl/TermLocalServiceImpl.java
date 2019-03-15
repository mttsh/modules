/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.uhh.l2g.plugins.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.uhh.l2g.plugins.model.Term;
import de.uhh.l2g.plugins.service.TermLocalServiceUtil;
import de.uhh.l2g.plugins.service.base.TermLocalServiceBaseImpl;

/**
 * The implementation of the term local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.uhh.l2g.plugins.service.TermLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.base.TermLocalServiceBaseImpl
 * @see de.uhh.l2g.plugins.service.TermLocalServiceUtil
 */
public class TermLocalServiceImpl extends TermLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link de.uhh.l2g.plugins.service.TermLocalServiceUtil} to access the term local service.
	 */
	private static final Log _log = LogFactoryUtil.getLog(TermLocalServiceImpl.class);
	
	public Term geTerm(long termId){
		Term t = TermLocalServiceUtil.createTerm(0);
		try {
			t = termLocalService.getTerm(termId);
		} catch (Exception e) {
			_log.error("can't fetch term for id " + termId);
		}
		return t;
	}
	
	public List<Term> getAllSemesters() throws SystemException {
		List<Term> sl = new ArrayList<Term>();
		sl = termPersistence.findAll();
		return sl;
	}
	
	public List<Term> getByCompanyId(Long companyId) {
		List<Term> sl = new ArrayList<Term>();
		sl = termPersistence.findByCompany(companyId);
		return sl;
	}
	
	public List<Term> getByGroupId(Long groupId) {
		List<Term> sl = new ArrayList<Term>();
		sl = termPersistence.findByGroup(groupId);
		return sl;
	}
	
	public Term getById(Long termId) throws NoSuchModelException, SystemException{
		return termPersistence.findByPrimaryKey(termId);
	}
	
	
	public List<Term> getTermsFromLectureseriesIdsAndVideoIds(ArrayList<Long> lectureseriesIds, ArrayList<Long> videoIds) {
		return termFinder.findTermsByLectureseriesIdsAndVideoIds(lectureseriesIds, videoIds);
	}
	
	public void deleteById(Long id) throws NoSuchModelException, SystemException{
		termPersistence.remove(id);
	}
}