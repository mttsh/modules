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

package de.uhh.l2g.plugins.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import de.uhh.l2g.plugins.exception.NoSuchVideo_LectureseriesException;
import de.uhh.l2g.plugins.model.Video_Lectureseries;

/**
 * The persistence interface for the video_ lectureseries service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.persistence.impl.Video_LectureseriesPersistenceImpl
 * @see Video_LectureseriesUtil
 * @generated
 */
@ProviderType
public interface Video_LectureseriesPersistence extends BasePersistence<Video_Lectureseries> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Video_LectureseriesUtil} to access the video_ lectureseries persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the video_ lectureserieses where videoId = &#63;.
	*
	* @param videoId the video ID
	* @return the matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByVideo(long videoId);

	/**
	* Returns a range of all the video_ lectureserieses where videoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param videoId the video ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @return the range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByVideo(long videoId,
		int start, int end);

	/**
	* Returns an ordered range of all the video_ lectureserieses where videoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param videoId the video ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByVideo(long videoId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns an ordered range of all the video_ lectureserieses where videoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param videoId the video ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByVideo(long videoId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first video_ lectureseries in the ordered set where videoId = &#63;.
	*
	* @param videoId the video ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByVideo_First(long videoId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the first video_ lectureseries in the ordered set where videoId = &#63;.
	*
	* @param videoId the video ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByVideo_First(long videoId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the last video_ lectureseries in the ordered set where videoId = &#63;.
	*
	* @param videoId the video ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByVideo_Last(long videoId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the last video_ lectureseries in the ordered set where videoId = &#63;.
	*
	* @param videoId the video ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByVideo_Last(long videoId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the video_ lectureserieses before and after the current video_ lectureseries in the ordered set where videoId = &#63;.
	*
	* @param videoLectureseriesId the primary key of the current video_ lectureseries
	* @param videoId the video ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries[] findByVideo_PrevAndNext(
		long videoLectureseriesId, long videoId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Removes all the video_ lectureserieses where videoId = &#63; from the database.
	*
	* @param videoId the video ID
	*/
	public void removeByVideo(long videoId);

	/**
	* Returns the number of video_ lectureserieses where videoId = &#63;.
	*
	* @param videoId the video ID
	* @return the number of matching video_ lectureserieses
	*/
	public int countByVideo(long videoId);

	/**
	* Returns all the video_ lectureserieses where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @return the matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseries(
		long lectureseriesId);

	/**
	* Returns a range of all the video_ lectureserieses where lectureseriesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @return the range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseries(
		long lectureseriesId, int start, int end);

	/**
	* Returns an ordered range of all the video_ lectureserieses where lectureseriesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseries(
		long lectureseriesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns an ordered range of all the video_ lectureserieses where lectureseriesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseries(
		long lectureseriesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first video_ lectureseries in the ordered set where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByLectureseries_First(long lectureseriesId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the first video_ lectureseries in the ordered set where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByLectureseries_First(
		long lectureseriesId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the last video_ lectureseries in the ordered set where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByLectureseries_Last(long lectureseriesId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the last video_ lectureseries in the ordered set where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByLectureseries_Last(long lectureseriesId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the video_ lectureserieses before and after the current video_ lectureseries in the ordered set where lectureseriesId = &#63;.
	*
	* @param videoLectureseriesId the primary key of the current video_ lectureseries
	* @param lectureseriesId the lectureseries ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries[] findByLectureseries_PrevAndNext(
		long videoLectureseriesId, long lectureseriesId,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Removes all the video_ lectureserieses where lectureseriesId = &#63; from the database.
	*
	* @param lectureseriesId the lectureseries ID
	*/
	public void removeByLectureseries(long lectureseriesId);

	/**
	* Returns the number of video_ lectureserieses where lectureseriesId = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @return the number of matching video_ lectureserieses
	*/
	public int countByLectureseries(long lectureseriesId);

	/**
	* Returns all the video_ lectureserieses where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @return the matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByOpenaccess(int openAccess);

	/**
	* Returns a range of all the video_ lectureserieses where openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @return the range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByOpenaccess(
		int openAccess, int start, int end);

	/**
	* Returns an ordered range of all the video_ lectureserieses where openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByOpenaccess(
		int openAccess, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns an ordered range of all the video_ lectureserieses where openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByOpenaccess(
		int openAccess, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first video_ lectureseries in the ordered set where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByOpenaccess_First(int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the first video_ lectureseries in the ordered set where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByOpenaccess_First(int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the last video_ lectureseries in the ordered set where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByOpenaccess_Last(int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the last video_ lectureseries in the ordered set where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByOpenaccess_Last(int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the video_ lectureserieses before and after the current video_ lectureseries in the ordered set where openAccess = &#63;.
	*
	* @param videoLectureseriesId the primary key of the current video_ lectureseries
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries[] findByOpenaccess_PrevAndNext(
		long videoLectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Removes all the video_ lectureserieses where openAccess = &#63; from the database.
	*
	* @param openAccess the open access
	*/
	public void removeByOpenaccess(int openAccess);

	/**
	* Returns the number of video_ lectureserieses where openAccess = &#63;.
	*
	* @param openAccess the open access
	* @return the number of matching video_ lectureserieses
	*/
	public int countByOpenaccess(int openAccess);

	/**
	* Returns all the video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @return the matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseriesAndOpenAccess(
		long lectureseriesId, int openAccess);

	/**
	* Returns a range of all the video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @return the range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseriesAndOpenAccess(
		long lectureseriesId, int openAccess, int start, int end);

	/**
	* Returns an ordered range of all the video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseriesAndOpenAccess(
		long lectureseriesId, int openAccess, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns an ordered range of all the video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findByLectureseriesAndOpenAccess(
		long lectureseriesId, int openAccess, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first video_ lectureseries in the ordered set where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByLectureseriesAndOpenAccess_First(
		long lectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the first video_ lectureseries in the ordered set where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByLectureseriesAndOpenAccess_First(
		long lectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the last video_ lectureseries in the ordered set where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries findByLectureseriesAndOpenAccess_Last(
		long lectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the last video_ lectureseries in the ordered set where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching video_ lectureseries, or <code>null</code> if a matching video_ lectureseries could not be found
	*/
	public Video_Lectureseries fetchByLectureseriesAndOpenAccess_Last(
		long lectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns the video_ lectureserieses before and after the current video_ lectureseries in the ordered set where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param videoLectureseriesId the primary key of the current video_ lectureseries
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries[] findByLectureseriesAndOpenAccess_PrevAndNext(
		long videoLectureseriesId, long lectureseriesId, int openAccess,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Removes all the video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63; from the database.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	*/
	public void removeByLectureseriesAndOpenAccess(long lectureseriesId,
		int openAccess);

	/**
	* Returns the number of video_ lectureserieses where lectureseriesId = &#63; and openAccess = &#63;.
	*
	* @param lectureseriesId the lectureseries ID
	* @param openAccess the open access
	* @return the number of matching video_ lectureserieses
	*/
	public int countByLectureseriesAndOpenAccess(long lectureseriesId,
		int openAccess);

	/**
	* Caches the video_ lectureseries in the entity cache if it is enabled.
	*
	* @param video_Lectureseries the video_ lectureseries
	*/
	public void cacheResult(Video_Lectureseries video_Lectureseries);

	/**
	* Caches the video_ lectureserieses in the entity cache if it is enabled.
	*
	* @param video_Lectureserieses the video_ lectureserieses
	*/
	public void cacheResult(
		java.util.List<Video_Lectureseries> video_Lectureserieses);

	/**
	* Creates a new video_ lectureseries with the primary key. Does not add the video_ lectureseries to the database.
	*
	* @param videoLectureseriesId the primary key for the new video_ lectureseries
	* @return the new video_ lectureseries
	*/
	public Video_Lectureseries create(long videoLectureseriesId);

	/**
	* Removes the video_ lectureseries with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param videoLectureseriesId the primary key of the video_ lectureseries
	* @return the video_ lectureseries that was removed
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries remove(long videoLectureseriesId)
		throws NoSuchVideo_LectureseriesException;

	public Video_Lectureseries updateImpl(
		Video_Lectureseries video_Lectureseries);

	/**
	* Returns the video_ lectureseries with the primary key or throws a {@link NoSuchVideo_LectureseriesException} if it could not be found.
	*
	* @param videoLectureseriesId the primary key of the video_ lectureseries
	* @return the video_ lectureseries
	* @throws NoSuchVideo_LectureseriesException if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries findByPrimaryKey(long videoLectureseriesId)
		throws NoSuchVideo_LectureseriesException;

	/**
	* Returns the video_ lectureseries with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param videoLectureseriesId the primary key of the video_ lectureseries
	* @return the video_ lectureseries, or <code>null</code> if a video_ lectureseries with the primary key could not be found
	*/
	public Video_Lectureseries fetchByPrimaryKey(long videoLectureseriesId);

	@Override
	public java.util.Map<java.io.Serializable, Video_Lectureseries> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the video_ lectureserieses.
	*
	* @return the video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findAll();

	/**
	* Returns a range of all the video_ lectureserieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @return the range of video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findAll(int start, int end);

	/**
	* Returns an ordered range of all the video_ lectureserieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator);

	/**
	* Returns an ordered range of all the video_ lectureserieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Video_LectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of video_ lectureserieses
	* @param end the upper bound of the range of video_ lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of video_ lectureserieses
	*/
	public java.util.List<Video_Lectureseries> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Video_Lectureseries> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the video_ lectureserieses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of video_ lectureserieses.
	*
	* @return the number of video_ lectureserieses
	*/
	public int countAll();
}