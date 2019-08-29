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

package de.uhh.l2g.plugins.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Lectureseries_Institution service. Represents a row in the &quot;LG_Lectureseries_Institution&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.uhh.l2g.plugins.model.impl.Lectureseries_InstitutionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.uhh.l2g.plugins.model.impl.Lectureseries_InstitutionImpl</code>.
 * </p>
 *
 * @author Iavor Sturm
 * @see Lectureseries_Institution
 * @generated
 */
@ProviderType
public interface Lectureseries_InstitutionModel
	extends BaseModel<Lectureseries_Institution> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lectureseries_ institution model instance should use the {@link Lectureseries_Institution} interface instead.
	 */

	/**
	 * Returns the primary key of this lectureseries_ institution.
	 *
	 * @return the primary key of this lectureseries_ institution
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lectureseries_ institution.
	 *
	 * @param primaryKey the primary key of this lectureseries_ institution
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lectureseries institution ID of this lectureseries_ institution.
	 *
	 * @return the lectureseries institution ID of this lectureseries_ institution
	 */
	public long getLectureseriesInstitutionId();

	/**
	 * Sets the lectureseries institution ID of this lectureseries_ institution.
	 *
	 * @param lectureseriesInstitutionId the lectureseries institution ID of this lectureseries_ institution
	 */
	public void setLectureseriesInstitutionId(long lectureseriesInstitutionId);

	/**
	 * Returns the lectureseries ID of this lectureseries_ institution.
	 *
	 * @return the lectureseries ID of this lectureseries_ institution
	 */
	public long getLectureseriesId();

	/**
	 * Sets the lectureseries ID of this lectureseries_ institution.
	 *
	 * @param lectureseriesId the lectureseries ID of this lectureseries_ institution
	 */
	public void setLectureseriesId(long lectureseriesId);

	/**
	 * Returns the institution ID of this lectureseries_ institution.
	 *
	 * @return the institution ID of this lectureseries_ institution
	 */
	public long getInstitutionId();

	/**
	 * Sets the institution ID of this lectureseries_ institution.
	 *
	 * @param institutionId the institution ID of this lectureseries_ institution
	 */
	public void setInstitutionId(long institutionId);

	/**
	 * Returns the institution parent ID of this lectureseries_ institution.
	 *
	 * @return the institution parent ID of this lectureseries_ institution
	 */
	public long getInstitutionParentId();

	/**
	 * Sets the institution parent ID of this lectureseries_ institution.
	 *
	 * @param institutionParentId the institution parent ID of this lectureseries_ institution
	 */
	public void setInstitutionParentId(long institutionParentId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		de.uhh.l2g.plugins.model.Lectureseries_Institution
			lectureseries_Institution);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Lectureseries_Institution>
		toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries_Institution toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries_Institution
		toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}