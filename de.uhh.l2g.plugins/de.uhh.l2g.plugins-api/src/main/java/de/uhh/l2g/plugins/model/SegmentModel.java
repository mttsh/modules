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
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Segment service. Represents a row in the &quot;LG_Segment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.uhh.l2g.plugins.model.impl.SegmentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.uhh.l2g.plugins.model.impl.SegmentImpl</code>.
 * </p>
 *
 * @author Iavor Sturm
 * @see Segment
 * @generated
 */
@ProviderType
public interface SegmentModel
	extends BaseModel<Segment>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a segment model instance should use the {@link Segment} interface instead.
	 */

	/**
	 * Returns the primary key of this segment.
	 *
	 * @return the primary key of this segment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this segment.
	 *
	 * @param primaryKey the primary key of this segment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the segment ID of this segment.
	 *
	 * @return the segment ID of this segment
	 */
	public long getSegmentId();

	/**
	 * Sets the segment ID of this segment.
	 *
	 * @param segmentId the segment ID of this segment
	 */
	public void setSegmentId(long segmentId);

	/**
	 * Returns the video ID of this segment.
	 *
	 * @return the video ID of this segment
	 */
	public long getVideoId();

	/**
	 * Sets the video ID of this segment.
	 *
	 * @param videoId the video ID of this segment
	 */
	public void setVideoId(long videoId);

	/**
	 * Returns the start of this segment.
	 *
	 * @return the start of this segment
	 */
	@AutoEscape
	public String getStart();

	/**
	 * Sets the start of this segment.
	 *
	 * @param start the start of this segment
	 */
	public void setStart(String start);

	/**
	 * Returns the title of this segment.
	 *
	 * @return the title of this segment
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this segment.
	 *
	 * @param title the title of this segment
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this segment.
	 *
	 * @return the description of this segment
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this segment.
	 *
	 * @param description the description of this segment
	 */
	public void setDescription(String description);

	/**
	 * Returns the end of this segment.
	 *
	 * @return the end of this segment
	 */
	@AutoEscape
	public String getEnd();

	/**
	 * Sets the end of this segment.
	 *
	 * @param end the end of this segment
	 */
	public void setEnd(String end);

	/**
	 * Returns the chapter of this segment.
	 *
	 * @return the chapter of this segment
	 */
	public int getChapter();

	/**
	 * Sets the chapter of this segment.
	 *
	 * @param chapter the chapter of this segment
	 */
	public void setChapter(int chapter);

	/**
	 * Returns the user ID of this segment.
	 *
	 * @return the user ID of this segment
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this segment.
	 *
	 * @param userId the user ID of this segment
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this segment.
	 *
	 * @return the user uuid of this segment
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this segment.
	 *
	 * @param userUuid the user uuid of this segment
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this segment.
	 *
	 * @return the group ID of this segment
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this segment.
	 *
	 * @param groupId the group ID of this segment
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this segment.
	 *
	 * @return the company ID of this segment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this segment.
	 *
	 * @param companyId the company ID of this segment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user name of this segment.
	 *
	 * @return the user name of this segment
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this segment.
	 *
	 * @param userName the user name of this segment
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this segment.
	 *
	 * @return the create date of this segment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this segment.
	 *
	 * @param createDate the create date of this segment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this segment.
	 *
	 * @return the modified date of this segment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this segment.
	 *
	 * @param modifiedDate the modified date of this segment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(de.uhh.l2g.plugins.model.Segment segment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Segment> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Segment toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Segment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}