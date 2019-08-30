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

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Producer_Lectureseries service. Represents a row in the &quot;LG_Producer_Lectureseries&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.uhh.l2g.plugins.model.impl.Producer_LectureseriesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.uhh.l2g.plugins.model.impl.Producer_LectureseriesImpl</code>.
 * </p>
 *
 * @author Iavor Sturm
 * @see Producer_Lectureseries
 * @generated
 */
@ProviderType
public interface Producer_LectureseriesModel
	extends BaseModel<Producer_Lectureseries> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a producer_ lectureseries model instance should use the {@link Producer_Lectureseries} interface instead.
	 */

	/**
	 * Returns the primary key of this producer_ lectureseries.
	 *
	 * @return the primary key of this producer_ lectureseries
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this producer_ lectureseries.
	 *
	 * @param primaryKey the primary key of this producer_ lectureseries
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the producer lectureseries ID of this producer_ lectureseries.
	 *
	 * @return the producer lectureseries ID of this producer_ lectureseries
	 */
	public long getProducerLectureseriesId();

	/**
	 * Sets the producer lectureseries ID of this producer_ lectureseries.
	 *
	 * @param producerLectureseriesId the producer lectureseries ID of this producer_ lectureseries
	 */
	public void setProducerLectureseriesId(long producerLectureseriesId);

	/**
	 * Returns the lectureseries ID of this producer_ lectureseries.
	 *
	 * @return the lectureseries ID of this producer_ lectureseries
	 */
	public long getLectureseriesId();

	/**
	 * Sets the lectureseries ID of this producer_ lectureseries.
	 *
	 * @param lectureseriesId the lectureseries ID of this producer_ lectureseries
	 */
	public void setLectureseriesId(long lectureseriesId);

	/**
	 * Returns the producer ID of this producer_ lectureseries.
	 *
	 * @return the producer ID of this producer_ lectureseries
	 */
	public long getProducerId();

	/**
	 * Sets the producer ID of this producer_ lectureseries.
	 *
	 * @param producerId the producer ID of this producer_ lectureseries
	 */
	public void setProducerId(long producerId);

}