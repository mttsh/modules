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

package de.uhh.l2g.plugins.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import de.uhh.l2g.plugins.model.Video_Lectureseries;
import de.uhh.l2g.plugins.service.Video_LectureseriesLocalService;
import de.uhh.l2g.plugins.service.persistence.CategoryFinder;
import de.uhh.l2g.plugins.service.persistence.CategoryPersistence;
import de.uhh.l2g.plugins.service.persistence.CoordinatorPersistence;
import de.uhh.l2g.plugins.service.persistence.CreatorFinder;
import de.uhh.l2g.plugins.service.persistence.CreatorPersistence;
import de.uhh.l2g.plugins.service.persistence.HostPersistence;
import de.uhh.l2g.plugins.service.persistence.InstitutionFinder;
import de.uhh.l2g.plugins.service.persistence.InstitutionPersistence;
import de.uhh.l2g.plugins.service.persistence.Institution_HostPersistence;
import de.uhh.l2g.plugins.service.persistence.LastvideolistPersistence;
import de.uhh.l2g.plugins.service.persistence.LectureseriesFinder;
import de.uhh.l2g.plugins.service.persistence.LectureseriesPersistence;
import de.uhh.l2g.plugins.service.persistence.Lectureseries_CategoryPersistence;
import de.uhh.l2g.plugins.service.persistence.Lectureseries_CreatorPersistence;
import de.uhh.l2g.plugins.service.persistence.Lectureseries_InstitutionPersistence;
import de.uhh.l2g.plugins.service.persistence.LicensePersistence;
import de.uhh.l2g.plugins.service.persistence.MetadataPersistence;
import de.uhh.l2g.plugins.service.persistence.OfficePersistence;
import de.uhh.l2g.plugins.service.persistence.ProducerFinder;
import de.uhh.l2g.plugins.service.persistence.ProducerPersistence;
import de.uhh.l2g.plugins.service.persistence.Producer_LectureseriesPersistence;
import de.uhh.l2g.plugins.service.persistence.ScheduledThreadPersistence;
import de.uhh.l2g.plugins.service.persistence.SegmentPersistence;
import de.uhh.l2g.plugins.service.persistence.StatisticFinder;
import de.uhh.l2g.plugins.service.persistence.StatisticPersistence;
import de.uhh.l2g.plugins.service.persistence.SysPersistence;
import de.uhh.l2g.plugins.service.persistence.TagcloudPersistence;
import de.uhh.l2g.plugins.service.persistence.TermFinder;
import de.uhh.l2g.plugins.service.persistence.TermPersistence;
import de.uhh.l2g.plugins.service.persistence.VideoFinder;
import de.uhh.l2g.plugins.service.persistence.VideoPersistence;
import de.uhh.l2g.plugins.service.persistence.VideoStatisticFinder;
import de.uhh.l2g.plugins.service.persistence.VideoStatisticPersistence;
import de.uhh.l2g.plugins.service.persistence.Video_CategoryPersistence;
import de.uhh.l2g.plugins.service.persistence.Video_CreatorPersistence;
import de.uhh.l2g.plugins.service.persistence.Video_InstitutionPersistence;
import de.uhh.l2g.plugins.service.persistence.Video_LectureseriesPersistence;
import de.uhh.l2g.plugins.service.persistence.VideohitlistPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the video_ lectureseries local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.uhh.l2g.plugins.service.impl.Video_LectureseriesLocalServiceImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.impl.Video_LectureseriesLocalServiceImpl
 * @see de.uhh.l2g.plugins.service.Video_LectureseriesLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class Video_LectureseriesLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements Video_LectureseriesLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link de.uhh.l2g.plugins.service.Video_LectureseriesLocalServiceUtil} to access the video_ lectureseries local service.
	 */

	/**
	 * Adds the video_ lectureseries to the database. Also notifies the appropriate model listeners.
	 *
	 * @param video_Lectureseries the video_ lectureseries
	 * @return the video_ lectureseries that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Video_Lectureseries addVideo_Lectureseries(
		Video_Lectureseries video_Lectureseries) {
		video_Lectureseries.setNew(true);

		return video_LectureseriesPersistence.update(video_Lectureseries);
	}

	/**
	 * Creates a new video_ lectureseries with the primary key. Does not add the video_ lectureseries to the database.
	 *
	 * @param videoLectureseriesId the primary key for the new video_ lectureseries
	 * @return the new video_ lectureseries
	 */
	@Override
	public Video_Lectureseries createVideo_Lectureseries(
		long videoLectureseriesId) {
		return video_LectureseriesPersistence.create(videoLectureseriesId);
	}

	/**
	 * Deletes the video_ lectureseries with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param videoLectureseriesId the primary key of the video_ lectureseries
	 * @return the video_ lectureseries that was removed
	 * @throws PortalException if a video_ lectureseries with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Video_Lectureseries deleteVideo_Lectureseries(
		long videoLectureseriesId) throws PortalException {
		return video_LectureseriesPersistence.remove(videoLectureseriesId);
	}

	/**
	 * Deletes the video_ lectureseries from the database. Also notifies the appropriate model listeners.
	 *
	 * @param video_Lectureseries the video_ lectureseries
	 * @return the video_ lectureseries that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Video_Lectureseries deleteVideo_Lectureseries(
		Video_Lectureseries video_Lectureseries) {
		return video_LectureseriesPersistence.remove(video_Lectureseries);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Video_Lectureseries.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return video_LectureseriesPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return video_LectureseriesPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return video_LectureseriesPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return video_LectureseriesPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return video_LectureseriesPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Video_Lectureseries fetchVideo_Lectureseries(
		long videoLectureseriesId) {
		return video_LectureseriesPersistence.fetchByPrimaryKey(videoLectureseriesId);
	}

	/**
	 * Returns the video_ lectureseries with the primary key.
	 *
	 * @param videoLectureseriesId the primary key of the video_ lectureseries
	 * @return the video_ lectureseries
	 * @throws PortalException if a video_ lectureseries with the primary key could not be found
	 */
	@Override
	public Video_Lectureseries getVideo_Lectureseries(long videoLectureseriesId)
		throws PortalException {
		return video_LectureseriesPersistence.findByPrimaryKey(videoLectureseriesId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(video_LectureseriesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Video_Lectureseries.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("videoLectureseriesId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(video_LectureseriesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Video_Lectureseries.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"videoLectureseriesId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(video_LectureseriesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Video_Lectureseries.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("videoLectureseriesId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return video_LectureseriesLocalService.deleteVideo_Lectureseries((Video_Lectureseries)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return video_LectureseriesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the video_ lectureserieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of video_ lectureserieses
	 * @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	 * @return the range of video_ lectureserieses
	 */
	@Override
	public List<Video_Lectureseries> getVideo_Lectureserieses(int start, int end) {
		return video_LectureseriesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of video_ lectureserieses.
	 *
	 * @return the number of video_ lectureserieses
	 */
	@Override
	public int getVideo_LectureseriesesCount() {
		return video_LectureseriesPersistence.countAll();
	}

	/**
	 * Updates the video_ lectureseries in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param video_Lectureseries the video_ lectureseries
	 * @return the video_ lectureseries that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Video_Lectureseries updateVideo_Lectureseries(
		Video_Lectureseries video_Lectureseries) {
		return video_LectureseriesPersistence.update(video_Lectureseries);
	}

	/**
	 * Returns the category local service.
	 *
	 * @return the category local service
	 */
	public de.uhh.l2g.plugins.service.CategoryLocalService getCategoryLocalService() {
		return categoryLocalService;
	}

	/**
	 * Sets the category local service.
	 *
	 * @param categoryLocalService the category local service
	 */
	public void setCategoryLocalService(
		de.uhh.l2g.plugins.service.CategoryLocalService categoryLocalService) {
		this.categoryLocalService = categoryLocalService;
	}

	/**
	 * Returns the category persistence.
	 *
	 * @return the category persistence
	 */
	public CategoryPersistence getCategoryPersistence() {
		return categoryPersistence;
	}

	/**
	 * Sets the category persistence.
	 *
	 * @param categoryPersistence the category persistence
	 */
	public void setCategoryPersistence(CategoryPersistence categoryPersistence) {
		this.categoryPersistence = categoryPersistence;
	}

	/**
	 * Returns the category finder.
	 *
	 * @return the category finder
	 */
	public CategoryFinder getCategoryFinder() {
		return categoryFinder;
	}

	/**
	 * Sets the category finder.
	 *
	 * @param categoryFinder the category finder
	 */
	public void setCategoryFinder(CategoryFinder categoryFinder) {
		this.categoryFinder = categoryFinder;
	}

	/**
	 * Returns the coordinator local service.
	 *
	 * @return the coordinator local service
	 */
	public de.uhh.l2g.plugins.service.CoordinatorLocalService getCoordinatorLocalService() {
		return coordinatorLocalService;
	}

	/**
	 * Sets the coordinator local service.
	 *
	 * @param coordinatorLocalService the coordinator local service
	 */
	public void setCoordinatorLocalService(
		de.uhh.l2g.plugins.service.CoordinatorLocalService coordinatorLocalService) {
		this.coordinatorLocalService = coordinatorLocalService;
	}

	/**
	 * Returns the coordinator persistence.
	 *
	 * @return the coordinator persistence
	 */
	public CoordinatorPersistence getCoordinatorPersistence() {
		return coordinatorPersistence;
	}

	/**
	 * Sets the coordinator persistence.
	 *
	 * @param coordinatorPersistence the coordinator persistence
	 */
	public void setCoordinatorPersistence(
		CoordinatorPersistence coordinatorPersistence) {
		this.coordinatorPersistence = coordinatorPersistence;
	}

	/**
	 * Returns the creator local service.
	 *
	 * @return the creator local service
	 */
	public de.uhh.l2g.plugins.service.CreatorLocalService getCreatorLocalService() {
		return creatorLocalService;
	}

	/**
	 * Sets the creator local service.
	 *
	 * @param creatorLocalService the creator local service
	 */
	public void setCreatorLocalService(
		de.uhh.l2g.plugins.service.CreatorLocalService creatorLocalService) {
		this.creatorLocalService = creatorLocalService;
	}

	/**
	 * Returns the creator persistence.
	 *
	 * @return the creator persistence
	 */
	public CreatorPersistence getCreatorPersistence() {
		return creatorPersistence;
	}

	/**
	 * Sets the creator persistence.
	 *
	 * @param creatorPersistence the creator persistence
	 */
	public void setCreatorPersistence(CreatorPersistence creatorPersistence) {
		this.creatorPersistence = creatorPersistence;
	}

	/**
	 * Returns the creator finder.
	 *
	 * @return the creator finder
	 */
	public CreatorFinder getCreatorFinder() {
		return creatorFinder;
	}

	/**
	 * Sets the creator finder.
	 *
	 * @param creatorFinder the creator finder
	 */
	public void setCreatorFinder(CreatorFinder creatorFinder) {
		this.creatorFinder = creatorFinder;
	}

	/**
	 * Returns the host local service.
	 *
	 * @return the host local service
	 */
	public de.uhh.l2g.plugins.service.HostLocalService getHostLocalService() {
		return hostLocalService;
	}

	/**
	 * Sets the host local service.
	 *
	 * @param hostLocalService the host local service
	 */
	public void setHostLocalService(
		de.uhh.l2g.plugins.service.HostLocalService hostLocalService) {
		this.hostLocalService = hostLocalService;
	}

	/**
	 * Returns the host persistence.
	 *
	 * @return the host persistence
	 */
	public HostPersistence getHostPersistence() {
		return hostPersistence;
	}

	/**
	 * Sets the host persistence.
	 *
	 * @param hostPersistence the host persistence
	 */
	public void setHostPersistence(HostPersistence hostPersistence) {
		this.hostPersistence = hostPersistence;
	}

	/**
	 * Returns the institution local service.
	 *
	 * @return the institution local service
	 */
	public de.uhh.l2g.plugins.service.InstitutionLocalService getInstitutionLocalService() {
		return institutionLocalService;
	}

	/**
	 * Sets the institution local service.
	 *
	 * @param institutionLocalService the institution local service
	 */
	public void setInstitutionLocalService(
		de.uhh.l2g.plugins.service.InstitutionLocalService institutionLocalService) {
		this.institutionLocalService = institutionLocalService;
	}

	/**
	 * Returns the institution persistence.
	 *
	 * @return the institution persistence
	 */
	public InstitutionPersistence getInstitutionPersistence() {
		return institutionPersistence;
	}

	/**
	 * Sets the institution persistence.
	 *
	 * @param institutionPersistence the institution persistence
	 */
	public void setInstitutionPersistence(
		InstitutionPersistence institutionPersistence) {
		this.institutionPersistence = institutionPersistence;
	}

	/**
	 * Returns the institution finder.
	 *
	 * @return the institution finder
	 */
	public InstitutionFinder getInstitutionFinder() {
		return institutionFinder;
	}

	/**
	 * Sets the institution finder.
	 *
	 * @param institutionFinder the institution finder
	 */
	public void setInstitutionFinder(InstitutionFinder institutionFinder) {
		this.institutionFinder = institutionFinder;
	}

	/**
	 * Returns the institution_ host local service.
	 *
	 * @return the institution_ host local service
	 */
	public de.uhh.l2g.plugins.service.Institution_HostLocalService getInstitution_HostLocalService() {
		return institution_HostLocalService;
	}

	/**
	 * Sets the institution_ host local service.
	 *
	 * @param institution_HostLocalService the institution_ host local service
	 */
	public void setInstitution_HostLocalService(
		de.uhh.l2g.plugins.service.Institution_HostLocalService institution_HostLocalService) {
		this.institution_HostLocalService = institution_HostLocalService;
	}

	/**
	 * Returns the institution_ host persistence.
	 *
	 * @return the institution_ host persistence
	 */
	public Institution_HostPersistence getInstitution_HostPersistence() {
		return institution_HostPersistence;
	}

	/**
	 * Sets the institution_ host persistence.
	 *
	 * @param institution_HostPersistence the institution_ host persistence
	 */
	public void setInstitution_HostPersistence(
		Institution_HostPersistence institution_HostPersistence) {
		this.institution_HostPersistence = institution_HostPersistence;
	}

	/**
	 * Returns the lastvideolist local service.
	 *
	 * @return the lastvideolist local service
	 */
	public de.uhh.l2g.plugins.service.LastvideolistLocalService getLastvideolistLocalService() {
		return lastvideolistLocalService;
	}

	/**
	 * Sets the lastvideolist local service.
	 *
	 * @param lastvideolistLocalService the lastvideolist local service
	 */
	public void setLastvideolistLocalService(
		de.uhh.l2g.plugins.service.LastvideolistLocalService lastvideolistLocalService) {
		this.lastvideolistLocalService = lastvideolistLocalService;
	}

	/**
	 * Returns the lastvideolist persistence.
	 *
	 * @return the lastvideolist persistence
	 */
	public LastvideolistPersistence getLastvideolistPersistence() {
		return lastvideolistPersistence;
	}

	/**
	 * Sets the lastvideolist persistence.
	 *
	 * @param lastvideolistPersistence the lastvideolist persistence
	 */
	public void setLastvideolistPersistence(
		LastvideolistPersistence lastvideolistPersistence) {
		this.lastvideolistPersistence = lastvideolistPersistence;
	}

	/**
	 * Returns the lectureseries local service.
	 *
	 * @return the lectureseries local service
	 */
	public de.uhh.l2g.plugins.service.LectureseriesLocalService getLectureseriesLocalService() {
		return lectureseriesLocalService;
	}

	/**
	 * Sets the lectureseries local service.
	 *
	 * @param lectureseriesLocalService the lectureseries local service
	 */
	public void setLectureseriesLocalService(
		de.uhh.l2g.plugins.service.LectureseriesLocalService lectureseriesLocalService) {
		this.lectureseriesLocalService = lectureseriesLocalService;
	}

	/**
	 * Returns the lectureseries persistence.
	 *
	 * @return the lectureseries persistence
	 */
	public LectureseriesPersistence getLectureseriesPersistence() {
		return lectureseriesPersistence;
	}

	/**
	 * Sets the lectureseries persistence.
	 *
	 * @param lectureseriesPersistence the lectureseries persistence
	 */
	public void setLectureseriesPersistence(
		LectureseriesPersistence lectureseriesPersistence) {
		this.lectureseriesPersistence = lectureseriesPersistence;
	}

	/**
	 * Returns the lectureseries finder.
	 *
	 * @return the lectureseries finder
	 */
	public LectureseriesFinder getLectureseriesFinder() {
		return lectureseriesFinder;
	}

	/**
	 * Sets the lectureseries finder.
	 *
	 * @param lectureseriesFinder the lectureseries finder
	 */
	public void setLectureseriesFinder(LectureseriesFinder lectureseriesFinder) {
		this.lectureseriesFinder = lectureseriesFinder;
	}

	/**
	 * Returns the lectureseries_ category local service.
	 *
	 * @return the lectureseries_ category local service
	 */
	public de.uhh.l2g.plugins.service.Lectureseries_CategoryLocalService getLectureseries_CategoryLocalService() {
		return lectureseries_CategoryLocalService;
	}

	/**
	 * Sets the lectureseries_ category local service.
	 *
	 * @param lectureseries_CategoryLocalService the lectureseries_ category local service
	 */
	public void setLectureseries_CategoryLocalService(
		de.uhh.l2g.plugins.service.Lectureseries_CategoryLocalService lectureseries_CategoryLocalService) {
		this.lectureseries_CategoryLocalService = lectureseries_CategoryLocalService;
	}

	/**
	 * Returns the lectureseries_ category persistence.
	 *
	 * @return the lectureseries_ category persistence
	 */
	public Lectureseries_CategoryPersistence getLectureseries_CategoryPersistence() {
		return lectureseries_CategoryPersistence;
	}

	/**
	 * Sets the lectureseries_ category persistence.
	 *
	 * @param lectureseries_CategoryPersistence the lectureseries_ category persistence
	 */
	public void setLectureseries_CategoryPersistence(
		Lectureseries_CategoryPersistence lectureseries_CategoryPersistence) {
		this.lectureseries_CategoryPersistence = lectureseries_CategoryPersistence;
	}

	/**
	 * Returns the lectureseries_ creator local service.
	 *
	 * @return the lectureseries_ creator local service
	 */
	public de.uhh.l2g.plugins.service.Lectureseries_CreatorLocalService getLectureseries_CreatorLocalService() {
		return lectureseries_CreatorLocalService;
	}

	/**
	 * Sets the lectureseries_ creator local service.
	 *
	 * @param lectureseries_CreatorLocalService the lectureseries_ creator local service
	 */
	public void setLectureseries_CreatorLocalService(
		de.uhh.l2g.plugins.service.Lectureseries_CreatorLocalService lectureseries_CreatorLocalService) {
		this.lectureseries_CreatorLocalService = lectureseries_CreatorLocalService;
	}

	/**
	 * Returns the lectureseries_ creator persistence.
	 *
	 * @return the lectureseries_ creator persistence
	 */
	public Lectureseries_CreatorPersistence getLectureseries_CreatorPersistence() {
		return lectureseries_CreatorPersistence;
	}

	/**
	 * Sets the lectureseries_ creator persistence.
	 *
	 * @param lectureseries_CreatorPersistence the lectureseries_ creator persistence
	 */
	public void setLectureseries_CreatorPersistence(
		Lectureseries_CreatorPersistence lectureseries_CreatorPersistence) {
		this.lectureseries_CreatorPersistence = lectureseries_CreatorPersistence;
	}

	/**
	 * Returns the lectureseries_ institution local service.
	 *
	 * @return the lectureseries_ institution local service
	 */
	public de.uhh.l2g.plugins.service.Lectureseries_InstitutionLocalService getLectureseries_InstitutionLocalService() {
		return lectureseries_InstitutionLocalService;
	}

	/**
	 * Sets the lectureseries_ institution local service.
	 *
	 * @param lectureseries_InstitutionLocalService the lectureseries_ institution local service
	 */
	public void setLectureseries_InstitutionLocalService(
		de.uhh.l2g.plugins.service.Lectureseries_InstitutionLocalService lectureseries_InstitutionLocalService) {
		this.lectureseries_InstitutionLocalService = lectureseries_InstitutionLocalService;
	}

	/**
	 * Returns the lectureseries_ institution persistence.
	 *
	 * @return the lectureseries_ institution persistence
	 */
	public Lectureseries_InstitutionPersistence getLectureseries_InstitutionPersistence() {
		return lectureseries_InstitutionPersistence;
	}

	/**
	 * Sets the lectureseries_ institution persistence.
	 *
	 * @param lectureseries_InstitutionPersistence the lectureseries_ institution persistence
	 */
	public void setLectureseries_InstitutionPersistence(
		Lectureseries_InstitutionPersistence lectureseries_InstitutionPersistence) {
		this.lectureseries_InstitutionPersistence = lectureseries_InstitutionPersistence;
	}

	/**
	 * Returns the license local service.
	 *
	 * @return the license local service
	 */
	public de.uhh.l2g.plugins.service.LicenseLocalService getLicenseLocalService() {
		return licenseLocalService;
	}

	/**
	 * Sets the license local service.
	 *
	 * @param licenseLocalService the license local service
	 */
	public void setLicenseLocalService(
		de.uhh.l2g.plugins.service.LicenseLocalService licenseLocalService) {
		this.licenseLocalService = licenseLocalService;
	}

	/**
	 * Returns the license persistence.
	 *
	 * @return the license persistence
	 */
	public LicensePersistence getLicensePersistence() {
		return licensePersistence;
	}

	/**
	 * Sets the license persistence.
	 *
	 * @param licensePersistence the license persistence
	 */
	public void setLicensePersistence(LicensePersistence licensePersistence) {
		this.licensePersistence = licensePersistence;
	}

	/**
	 * Returns the metadata local service.
	 *
	 * @return the metadata local service
	 */
	public de.uhh.l2g.plugins.service.MetadataLocalService getMetadataLocalService() {
		return metadataLocalService;
	}

	/**
	 * Sets the metadata local service.
	 *
	 * @param metadataLocalService the metadata local service
	 */
	public void setMetadataLocalService(
		de.uhh.l2g.plugins.service.MetadataLocalService metadataLocalService) {
		this.metadataLocalService = metadataLocalService;
	}

	/**
	 * Returns the metadata persistence.
	 *
	 * @return the metadata persistence
	 */
	public MetadataPersistence getMetadataPersistence() {
		return metadataPersistence;
	}

	/**
	 * Sets the metadata persistence.
	 *
	 * @param metadataPersistence the metadata persistence
	 */
	public void setMetadataPersistence(MetadataPersistence metadataPersistence) {
		this.metadataPersistence = metadataPersistence;
	}

	/**
	 * Returns the office local service.
	 *
	 * @return the office local service
	 */
	public de.uhh.l2g.plugins.service.OfficeLocalService getOfficeLocalService() {
		return officeLocalService;
	}

	/**
	 * Sets the office local service.
	 *
	 * @param officeLocalService the office local service
	 */
	public void setOfficeLocalService(
		de.uhh.l2g.plugins.service.OfficeLocalService officeLocalService) {
		this.officeLocalService = officeLocalService;
	}

	/**
	 * Returns the office persistence.
	 *
	 * @return the office persistence
	 */
	public OfficePersistence getOfficePersistence() {
		return officePersistence;
	}

	/**
	 * Sets the office persistence.
	 *
	 * @param officePersistence the office persistence
	 */
	public void setOfficePersistence(OfficePersistence officePersistence) {
		this.officePersistence = officePersistence;
	}

	/**
	 * Returns the producer local service.
	 *
	 * @return the producer local service
	 */
	public de.uhh.l2g.plugins.service.ProducerLocalService getProducerLocalService() {
		return producerLocalService;
	}

	/**
	 * Sets the producer local service.
	 *
	 * @param producerLocalService the producer local service
	 */
	public void setProducerLocalService(
		de.uhh.l2g.plugins.service.ProducerLocalService producerLocalService) {
		this.producerLocalService = producerLocalService;
	}

	/**
	 * Returns the producer persistence.
	 *
	 * @return the producer persistence
	 */
	public ProducerPersistence getProducerPersistence() {
		return producerPersistence;
	}

	/**
	 * Sets the producer persistence.
	 *
	 * @param producerPersistence the producer persistence
	 */
	public void setProducerPersistence(ProducerPersistence producerPersistence) {
		this.producerPersistence = producerPersistence;
	}

	/**
	 * Returns the producer finder.
	 *
	 * @return the producer finder
	 */
	public ProducerFinder getProducerFinder() {
		return producerFinder;
	}

	/**
	 * Sets the producer finder.
	 *
	 * @param producerFinder the producer finder
	 */
	public void setProducerFinder(ProducerFinder producerFinder) {
		this.producerFinder = producerFinder;
	}

	/**
	 * Returns the producer_ lectureseries local service.
	 *
	 * @return the producer_ lectureseries local service
	 */
	public de.uhh.l2g.plugins.service.Producer_LectureseriesLocalService getProducer_LectureseriesLocalService() {
		return producer_LectureseriesLocalService;
	}

	/**
	 * Sets the producer_ lectureseries local service.
	 *
	 * @param producer_LectureseriesLocalService the producer_ lectureseries local service
	 */
	public void setProducer_LectureseriesLocalService(
		de.uhh.l2g.plugins.service.Producer_LectureseriesLocalService producer_LectureseriesLocalService) {
		this.producer_LectureseriesLocalService = producer_LectureseriesLocalService;
	}

	/**
	 * Returns the producer_ lectureseries persistence.
	 *
	 * @return the producer_ lectureseries persistence
	 */
	public Producer_LectureseriesPersistence getProducer_LectureseriesPersistence() {
		return producer_LectureseriesPersistence;
	}

	/**
	 * Sets the producer_ lectureseries persistence.
	 *
	 * @param producer_LectureseriesPersistence the producer_ lectureseries persistence
	 */
	public void setProducer_LectureseriesPersistence(
		Producer_LectureseriesPersistence producer_LectureseriesPersistence) {
		this.producer_LectureseriesPersistence = producer_LectureseriesPersistence;
	}

	/**
	 * Returns the scheduled thread local service.
	 *
	 * @return the scheduled thread local service
	 */
	public de.uhh.l2g.plugins.service.ScheduledThreadLocalService getScheduledThreadLocalService() {
		return scheduledThreadLocalService;
	}

	/**
	 * Sets the scheduled thread local service.
	 *
	 * @param scheduledThreadLocalService the scheduled thread local service
	 */
	public void setScheduledThreadLocalService(
		de.uhh.l2g.plugins.service.ScheduledThreadLocalService scheduledThreadLocalService) {
		this.scheduledThreadLocalService = scheduledThreadLocalService;
	}

	/**
	 * Returns the scheduled thread persistence.
	 *
	 * @return the scheduled thread persistence
	 */
	public ScheduledThreadPersistence getScheduledThreadPersistence() {
		return scheduledThreadPersistence;
	}

	/**
	 * Sets the scheduled thread persistence.
	 *
	 * @param scheduledThreadPersistence the scheduled thread persistence
	 */
	public void setScheduledThreadPersistence(
		ScheduledThreadPersistence scheduledThreadPersistence) {
		this.scheduledThreadPersistence = scheduledThreadPersistence;
	}

	/**
	 * Returns the segment local service.
	 *
	 * @return the segment local service
	 */
	public de.uhh.l2g.plugins.service.SegmentLocalService getSegmentLocalService() {
		return segmentLocalService;
	}

	/**
	 * Sets the segment local service.
	 *
	 * @param segmentLocalService the segment local service
	 */
	public void setSegmentLocalService(
		de.uhh.l2g.plugins.service.SegmentLocalService segmentLocalService) {
		this.segmentLocalService = segmentLocalService;
	}

	/**
	 * Returns the segment persistence.
	 *
	 * @return the segment persistence
	 */
	public SegmentPersistence getSegmentPersistence() {
		return segmentPersistence;
	}

	/**
	 * Sets the segment persistence.
	 *
	 * @param segmentPersistence the segment persistence
	 */
	public void setSegmentPersistence(SegmentPersistence segmentPersistence) {
		this.segmentPersistence = segmentPersistence;
	}

	/**
	 * Returns the statistic local service.
	 *
	 * @return the statistic local service
	 */
	public de.uhh.l2g.plugins.service.StatisticLocalService getStatisticLocalService() {
		return statisticLocalService;
	}

	/**
	 * Sets the statistic local service.
	 *
	 * @param statisticLocalService the statistic local service
	 */
	public void setStatisticLocalService(
		de.uhh.l2g.plugins.service.StatisticLocalService statisticLocalService) {
		this.statisticLocalService = statisticLocalService;
	}

	/**
	 * Returns the statistic persistence.
	 *
	 * @return the statistic persistence
	 */
	public StatisticPersistence getStatisticPersistence() {
		return statisticPersistence;
	}

	/**
	 * Sets the statistic persistence.
	 *
	 * @param statisticPersistence the statistic persistence
	 */
	public void setStatisticPersistence(
		StatisticPersistence statisticPersistence) {
		this.statisticPersistence = statisticPersistence;
	}

	/**
	 * Returns the statistic finder.
	 *
	 * @return the statistic finder
	 */
	public StatisticFinder getStatisticFinder() {
		return statisticFinder;
	}

	/**
	 * Sets the statistic finder.
	 *
	 * @param statisticFinder the statistic finder
	 */
	public void setStatisticFinder(StatisticFinder statisticFinder) {
		this.statisticFinder = statisticFinder;
	}

	/**
	 * Returns the sys local service.
	 *
	 * @return the sys local service
	 */
	public de.uhh.l2g.plugins.service.SysLocalService getSysLocalService() {
		return sysLocalService;
	}

	/**
	 * Sets the sys local service.
	 *
	 * @param sysLocalService the sys local service
	 */
	public void setSysLocalService(
		de.uhh.l2g.plugins.service.SysLocalService sysLocalService) {
		this.sysLocalService = sysLocalService;
	}

	/**
	 * Returns the sys persistence.
	 *
	 * @return the sys persistence
	 */
	public SysPersistence getSysPersistence() {
		return sysPersistence;
	}

	/**
	 * Sets the sys persistence.
	 *
	 * @param sysPersistence the sys persistence
	 */
	public void setSysPersistence(SysPersistence sysPersistence) {
		this.sysPersistence = sysPersistence;
	}

	/**
	 * Returns the tagcloud local service.
	 *
	 * @return the tagcloud local service
	 */
	public de.uhh.l2g.plugins.service.TagcloudLocalService getTagcloudLocalService() {
		return tagcloudLocalService;
	}

	/**
	 * Sets the tagcloud local service.
	 *
	 * @param tagcloudLocalService the tagcloud local service
	 */
	public void setTagcloudLocalService(
		de.uhh.l2g.plugins.service.TagcloudLocalService tagcloudLocalService) {
		this.tagcloudLocalService = tagcloudLocalService;
	}

	/**
	 * Returns the tagcloud persistence.
	 *
	 * @return the tagcloud persistence
	 */
	public TagcloudPersistence getTagcloudPersistence() {
		return tagcloudPersistence;
	}

	/**
	 * Sets the tagcloud persistence.
	 *
	 * @param tagcloudPersistence the tagcloud persistence
	 */
	public void setTagcloudPersistence(TagcloudPersistence tagcloudPersistence) {
		this.tagcloudPersistence = tagcloudPersistence;
	}

	/**
	 * Returns the term local service.
	 *
	 * @return the term local service
	 */
	public de.uhh.l2g.plugins.service.TermLocalService getTermLocalService() {
		return termLocalService;
	}

	/**
	 * Sets the term local service.
	 *
	 * @param termLocalService the term local service
	 */
	public void setTermLocalService(
		de.uhh.l2g.plugins.service.TermLocalService termLocalService) {
		this.termLocalService = termLocalService;
	}

	/**
	 * Returns the term persistence.
	 *
	 * @return the term persistence
	 */
	public TermPersistence getTermPersistence() {
		return termPersistence;
	}

	/**
	 * Sets the term persistence.
	 *
	 * @param termPersistence the term persistence
	 */
	public void setTermPersistence(TermPersistence termPersistence) {
		this.termPersistence = termPersistence;
	}

	/**
	 * Returns the term finder.
	 *
	 * @return the term finder
	 */
	public TermFinder getTermFinder() {
		return termFinder;
	}

	/**
	 * Sets the term finder.
	 *
	 * @param termFinder the term finder
	 */
	public void setTermFinder(TermFinder termFinder) {
		this.termFinder = termFinder;
	}

	/**
	 * Returns the video local service.
	 *
	 * @return the video local service
	 */
	public de.uhh.l2g.plugins.service.VideoLocalService getVideoLocalService() {
		return videoLocalService;
	}

	/**
	 * Sets the video local service.
	 *
	 * @param videoLocalService the video local service
	 */
	public void setVideoLocalService(
		de.uhh.l2g.plugins.service.VideoLocalService videoLocalService) {
		this.videoLocalService = videoLocalService;
	}

	/**
	 * Returns the video persistence.
	 *
	 * @return the video persistence
	 */
	public VideoPersistence getVideoPersistence() {
		return videoPersistence;
	}

	/**
	 * Sets the video persistence.
	 *
	 * @param videoPersistence the video persistence
	 */
	public void setVideoPersistence(VideoPersistence videoPersistence) {
		this.videoPersistence = videoPersistence;
	}

	/**
	 * Returns the video finder.
	 *
	 * @return the video finder
	 */
	public VideoFinder getVideoFinder() {
		return videoFinder;
	}

	/**
	 * Sets the video finder.
	 *
	 * @param videoFinder the video finder
	 */
	public void setVideoFinder(VideoFinder videoFinder) {
		this.videoFinder = videoFinder;
	}

	/**
	 * Returns the video_ category local service.
	 *
	 * @return the video_ category local service
	 */
	public de.uhh.l2g.plugins.service.Video_CategoryLocalService getVideo_CategoryLocalService() {
		return video_CategoryLocalService;
	}

	/**
	 * Sets the video_ category local service.
	 *
	 * @param video_CategoryLocalService the video_ category local service
	 */
	public void setVideo_CategoryLocalService(
		de.uhh.l2g.plugins.service.Video_CategoryLocalService video_CategoryLocalService) {
		this.video_CategoryLocalService = video_CategoryLocalService;
	}

	/**
	 * Returns the video_ category persistence.
	 *
	 * @return the video_ category persistence
	 */
	public Video_CategoryPersistence getVideo_CategoryPersistence() {
		return video_CategoryPersistence;
	}

	/**
	 * Sets the video_ category persistence.
	 *
	 * @param video_CategoryPersistence the video_ category persistence
	 */
	public void setVideo_CategoryPersistence(
		Video_CategoryPersistence video_CategoryPersistence) {
		this.video_CategoryPersistence = video_CategoryPersistence;
	}

	/**
	 * Returns the video_ creator local service.
	 *
	 * @return the video_ creator local service
	 */
	public de.uhh.l2g.plugins.service.Video_CreatorLocalService getVideo_CreatorLocalService() {
		return video_CreatorLocalService;
	}

	/**
	 * Sets the video_ creator local service.
	 *
	 * @param video_CreatorLocalService the video_ creator local service
	 */
	public void setVideo_CreatorLocalService(
		de.uhh.l2g.plugins.service.Video_CreatorLocalService video_CreatorLocalService) {
		this.video_CreatorLocalService = video_CreatorLocalService;
	}

	/**
	 * Returns the video_ creator persistence.
	 *
	 * @return the video_ creator persistence
	 */
	public Video_CreatorPersistence getVideo_CreatorPersistence() {
		return video_CreatorPersistence;
	}

	/**
	 * Sets the video_ creator persistence.
	 *
	 * @param video_CreatorPersistence the video_ creator persistence
	 */
	public void setVideo_CreatorPersistence(
		Video_CreatorPersistence video_CreatorPersistence) {
		this.video_CreatorPersistence = video_CreatorPersistence;
	}

	/**
	 * Returns the video_ institution local service.
	 *
	 * @return the video_ institution local service
	 */
	public de.uhh.l2g.plugins.service.Video_InstitutionLocalService getVideo_InstitutionLocalService() {
		return video_InstitutionLocalService;
	}

	/**
	 * Sets the video_ institution local service.
	 *
	 * @param video_InstitutionLocalService the video_ institution local service
	 */
	public void setVideo_InstitutionLocalService(
		de.uhh.l2g.plugins.service.Video_InstitutionLocalService video_InstitutionLocalService) {
		this.video_InstitutionLocalService = video_InstitutionLocalService;
	}

	/**
	 * Returns the video_ institution persistence.
	 *
	 * @return the video_ institution persistence
	 */
	public Video_InstitutionPersistence getVideo_InstitutionPersistence() {
		return video_InstitutionPersistence;
	}

	/**
	 * Sets the video_ institution persistence.
	 *
	 * @param video_InstitutionPersistence the video_ institution persistence
	 */
	public void setVideo_InstitutionPersistence(
		Video_InstitutionPersistence video_InstitutionPersistence) {
		this.video_InstitutionPersistence = video_InstitutionPersistence;
	}

	/**
	 * Returns the video_ lectureseries local service.
	 *
	 * @return the video_ lectureseries local service
	 */
	public Video_LectureseriesLocalService getVideo_LectureseriesLocalService() {
		return video_LectureseriesLocalService;
	}

	/**
	 * Sets the video_ lectureseries local service.
	 *
	 * @param video_LectureseriesLocalService the video_ lectureseries local service
	 */
	public void setVideo_LectureseriesLocalService(
		Video_LectureseriesLocalService video_LectureseriesLocalService) {
		this.video_LectureseriesLocalService = video_LectureseriesLocalService;
	}

	/**
	 * Returns the video_ lectureseries persistence.
	 *
	 * @return the video_ lectureseries persistence
	 */
	public Video_LectureseriesPersistence getVideo_LectureseriesPersistence() {
		return video_LectureseriesPersistence;
	}

	/**
	 * Sets the video_ lectureseries persistence.
	 *
	 * @param video_LectureseriesPersistence the video_ lectureseries persistence
	 */
	public void setVideo_LectureseriesPersistence(
		Video_LectureseriesPersistence video_LectureseriesPersistence) {
		this.video_LectureseriesPersistence = video_LectureseriesPersistence;
	}

	/**
	 * Returns the videohitlist local service.
	 *
	 * @return the videohitlist local service
	 */
	public de.uhh.l2g.plugins.service.VideohitlistLocalService getVideohitlistLocalService() {
		return videohitlistLocalService;
	}

	/**
	 * Sets the videohitlist local service.
	 *
	 * @param videohitlistLocalService the videohitlist local service
	 */
	public void setVideohitlistLocalService(
		de.uhh.l2g.plugins.service.VideohitlistLocalService videohitlistLocalService) {
		this.videohitlistLocalService = videohitlistLocalService;
	}

	/**
	 * Returns the videohitlist persistence.
	 *
	 * @return the videohitlist persistence
	 */
	public VideohitlistPersistence getVideohitlistPersistence() {
		return videohitlistPersistence;
	}

	/**
	 * Sets the videohitlist persistence.
	 *
	 * @param videohitlistPersistence the videohitlist persistence
	 */
	public void setVideohitlistPersistence(
		VideohitlistPersistence videohitlistPersistence) {
		this.videohitlistPersistence = videohitlistPersistence;
	}

	/**
	 * Returns the video statistic local service.
	 *
	 * @return the video statistic local service
	 */
	public de.uhh.l2g.plugins.service.VideoStatisticLocalService getVideoStatisticLocalService() {
		return videoStatisticLocalService;
	}

	/**
	 * Sets the video statistic local service.
	 *
	 * @param videoStatisticLocalService the video statistic local service
	 */
	public void setVideoStatisticLocalService(
		de.uhh.l2g.plugins.service.VideoStatisticLocalService videoStatisticLocalService) {
		this.videoStatisticLocalService = videoStatisticLocalService;
	}

	/**
	 * Returns the video statistic persistence.
	 *
	 * @return the video statistic persistence
	 */
	public VideoStatisticPersistence getVideoStatisticPersistence() {
		return videoStatisticPersistence;
	}

	/**
	 * Sets the video statistic persistence.
	 *
	 * @param videoStatisticPersistence the video statistic persistence
	 */
	public void setVideoStatisticPersistence(
		VideoStatisticPersistence videoStatisticPersistence) {
		this.videoStatisticPersistence = videoStatisticPersistence;
	}

	/**
	 * Returns the video statistic finder.
	 *
	 * @return the video statistic finder
	 */
	public VideoStatisticFinder getVideoStatisticFinder() {
		return videoStatisticFinder;
	}

	/**
	 * Sets the video statistic finder.
	 *
	 * @param videoStatisticFinder the video statistic finder
	 */
	public void setVideoStatisticFinder(
		VideoStatisticFinder videoStatisticFinder) {
		this.videoStatisticFinder = videoStatisticFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("de.uhh.l2g.plugins.model.Video_Lectureseries",
			video_LectureseriesLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"de.uhh.l2g.plugins.model.Video_Lectureseries");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return Video_LectureseriesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Video_Lectureseries.class;
	}

	protected String getModelClassName() {
		return Video_Lectureseries.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = video_LectureseriesPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = de.uhh.l2g.plugins.service.CategoryLocalService.class)
	protected de.uhh.l2g.plugins.service.CategoryLocalService categoryLocalService;
	@BeanReference(type = CategoryPersistence.class)
	protected CategoryPersistence categoryPersistence;
	@BeanReference(type = CategoryFinder.class)
	protected CategoryFinder categoryFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.CoordinatorLocalService.class)
	protected de.uhh.l2g.plugins.service.CoordinatorLocalService coordinatorLocalService;
	@BeanReference(type = CoordinatorPersistence.class)
	protected CoordinatorPersistence coordinatorPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.CreatorLocalService.class)
	protected de.uhh.l2g.plugins.service.CreatorLocalService creatorLocalService;
	@BeanReference(type = CreatorPersistence.class)
	protected CreatorPersistence creatorPersistence;
	@BeanReference(type = CreatorFinder.class)
	protected CreatorFinder creatorFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.HostLocalService.class)
	protected de.uhh.l2g.plugins.service.HostLocalService hostLocalService;
	@BeanReference(type = HostPersistence.class)
	protected HostPersistence hostPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.InstitutionLocalService.class)
	protected de.uhh.l2g.plugins.service.InstitutionLocalService institutionLocalService;
	@BeanReference(type = InstitutionPersistence.class)
	protected InstitutionPersistence institutionPersistence;
	@BeanReference(type = InstitutionFinder.class)
	protected InstitutionFinder institutionFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.Institution_HostLocalService.class)
	protected de.uhh.l2g.plugins.service.Institution_HostLocalService institution_HostLocalService;
	@BeanReference(type = Institution_HostPersistence.class)
	protected Institution_HostPersistence institution_HostPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.LastvideolistLocalService.class)
	protected de.uhh.l2g.plugins.service.LastvideolistLocalService lastvideolistLocalService;
	@BeanReference(type = LastvideolistPersistence.class)
	protected LastvideolistPersistence lastvideolistPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.LectureseriesLocalService.class)
	protected de.uhh.l2g.plugins.service.LectureseriesLocalService lectureseriesLocalService;
	@BeanReference(type = LectureseriesPersistence.class)
	protected LectureseriesPersistence lectureseriesPersistence;
	@BeanReference(type = LectureseriesFinder.class)
	protected LectureseriesFinder lectureseriesFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.Lectureseries_CategoryLocalService.class)
	protected de.uhh.l2g.plugins.service.Lectureseries_CategoryLocalService lectureseries_CategoryLocalService;
	@BeanReference(type = Lectureseries_CategoryPersistence.class)
	protected Lectureseries_CategoryPersistence lectureseries_CategoryPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.Lectureseries_CreatorLocalService.class)
	protected de.uhh.l2g.plugins.service.Lectureseries_CreatorLocalService lectureseries_CreatorLocalService;
	@BeanReference(type = Lectureseries_CreatorPersistence.class)
	protected Lectureseries_CreatorPersistence lectureseries_CreatorPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.Lectureseries_InstitutionLocalService.class)
	protected de.uhh.l2g.plugins.service.Lectureseries_InstitutionLocalService lectureseries_InstitutionLocalService;
	@BeanReference(type = Lectureseries_InstitutionPersistence.class)
	protected Lectureseries_InstitutionPersistence lectureseries_InstitutionPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.LicenseLocalService.class)
	protected de.uhh.l2g.plugins.service.LicenseLocalService licenseLocalService;
	@BeanReference(type = LicensePersistence.class)
	protected LicensePersistence licensePersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.MetadataLocalService.class)
	protected de.uhh.l2g.plugins.service.MetadataLocalService metadataLocalService;
	@BeanReference(type = MetadataPersistence.class)
	protected MetadataPersistence metadataPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.OfficeLocalService.class)
	protected de.uhh.l2g.plugins.service.OfficeLocalService officeLocalService;
	@BeanReference(type = OfficePersistence.class)
	protected OfficePersistence officePersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.ProducerLocalService.class)
	protected de.uhh.l2g.plugins.service.ProducerLocalService producerLocalService;
	@BeanReference(type = ProducerPersistence.class)
	protected ProducerPersistence producerPersistence;
	@BeanReference(type = ProducerFinder.class)
	protected ProducerFinder producerFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.Producer_LectureseriesLocalService.class)
	protected de.uhh.l2g.plugins.service.Producer_LectureseriesLocalService producer_LectureseriesLocalService;
	@BeanReference(type = Producer_LectureseriesPersistence.class)
	protected Producer_LectureseriesPersistence producer_LectureseriesPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.ScheduledThreadLocalService.class)
	protected de.uhh.l2g.plugins.service.ScheduledThreadLocalService scheduledThreadLocalService;
	@BeanReference(type = ScheduledThreadPersistence.class)
	protected ScheduledThreadPersistence scheduledThreadPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.SegmentLocalService.class)
	protected de.uhh.l2g.plugins.service.SegmentLocalService segmentLocalService;
	@BeanReference(type = SegmentPersistence.class)
	protected SegmentPersistence segmentPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.StatisticLocalService.class)
	protected de.uhh.l2g.plugins.service.StatisticLocalService statisticLocalService;
	@BeanReference(type = StatisticPersistence.class)
	protected StatisticPersistence statisticPersistence;
	@BeanReference(type = StatisticFinder.class)
	protected StatisticFinder statisticFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.SysLocalService.class)
	protected de.uhh.l2g.plugins.service.SysLocalService sysLocalService;
	@BeanReference(type = SysPersistence.class)
	protected SysPersistence sysPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.TagcloudLocalService.class)
	protected de.uhh.l2g.plugins.service.TagcloudLocalService tagcloudLocalService;
	@BeanReference(type = TagcloudPersistence.class)
	protected TagcloudPersistence tagcloudPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.TermLocalService.class)
	protected de.uhh.l2g.plugins.service.TermLocalService termLocalService;
	@BeanReference(type = TermPersistence.class)
	protected TermPersistence termPersistence;
	@BeanReference(type = TermFinder.class)
	protected TermFinder termFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.VideoLocalService.class)
	protected de.uhh.l2g.plugins.service.VideoLocalService videoLocalService;
	@BeanReference(type = VideoPersistence.class)
	protected VideoPersistence videoPersistence;
	@BeanReference(type = VideoFinder.class)
	protected VideoFinder videoFinder;
	@BeanReference(type = de.uhh.l2g.plugins.service.Video_CategoryLocalService.class)
	protected de.uhh.l2g.plugins.service.Video_CategoryLocalService video_CategoryLocalService;
	@BeanReference(type = Video_CategoryPersistence.class)
	protected Video_CategoryPersistence video_CategoryPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.Video_CreatorLocalService.class)
	protected de.uhh.l2g.plugins.service.Video_CreatorLocalService video_CreatorLocalService;
	@BeanReference(type = Video_CreatorPersistence.class)
	protected Video_CreatorPersistence video_CreatorPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.Video_InstitutionLocalService.class)
	protected de.uhh.l2g.plugins.service.Video_InstitutionLocalService video_InstitutionLocalService;
	@BeanReference(type = Video_InstitutionPersistence.class)
	protected Video_InstitutionPersistence video_InstitutionPersistence;
	@BeanReference(type = Video_LectureseriesLocalService.class)
	protected Video_LectureseriesLocalService video_LectureseriesLocalService;
	@BeanReference(type = Video_LectureseriesPersistence.class)
	protected Video_LectureseriesPersistence video_LectureseriesPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.VideohitlistLocalService.class)
	protected de.uhh.l2g.plugins.service.VideohitlistLocalService videohitlistLocalService;
	@BeanReference(type = VideohitlistPersistence.class)
	protected VideohitlistPersistence videohitlistPersistence;
	@BeanReference(type = de.uhh.l2g.plugins.service.VideoStatisticLocalService.class)
	protected de.uhh.l2g.plugins.service.VideoStatisticLocalService videoStatisticLocalService;
	@BeanReference(type = VideoStatisticPersistence.class)
	protected VideoStatisticPersistence videoStatisticPersistence;
	@BeanReference(type = VideoStatisticFinder.class)
	protected VideoStatisticFinder videoStatisticFinder;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}