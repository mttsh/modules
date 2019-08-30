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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Lastvideolist service. Represents a row in the &quot;LG_Lastvideolist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.uhh.l2g.plugins.model.impl.LastvideolistModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.uhh.l2g.plugins.model.impl.LastvideolistImpl</code>.
 * </p>
 *
 * @author Iavor Sturm
 * @see Lastvideolist
 * @generated
 */
@ProviderType
public interface LastvideolistModel
	extends BaseModel<Lastvideolist>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lastvideolist model instance should use the {@link Lastvideolist} interface instead.
	 */

	/**
	 * Returns the primary key of this lastvideolist.
	 *
	 * @return the primary key of this lastvideolist
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this lastvideolist.
	 *
	 * @param primaryKey the primary key of this lastvideolist
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the lastvideolist ID of this lastvideolist.
	 *
	 * @return the lastvideolist ID of this lastvideolist
	 */
	public int getLastvideolistId();

	/**
	 * Sets the lastvideolist ID of this lastvideolist.
	 *
	 * @param lastvideolistId the lastvideolist ID of this lastvideolist
	 */
	public void setLastvideolistId(int lastvideolistId);

	/**
	 * Returns the video ID of this lastvideolist.
	 *
	 * @return the video ID of this lastvideolist
	 */
	public long getVideoId();

	/**
	 * Sets the video ID of this lastvideolist.
	 *
	 * @param videoId the video ID of this lastvideolist
	 */
	public void setVideoId(long videoId);

	/**
	 * Returns the group ID of this lastvideolist.
	 *
	 * @return the group ID of this lastvideolist
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this lastvideolist.
	 *
	 * @param groupId the group ID of this lastvideolist
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this lastvideolist.
	 *
	 * @return the company ID of this lastvideolist
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this lastvideolist.
	 *
	 * @param companyId the company ID of this lastvideolist
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this lastvideolist.
	 *
	 * @return the user ID of this lastvideolist
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this lastvideolist.
	 *
	 * @param userId the user ID of this lastvideolist
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lastvideolist.
	 *
	 * @return the user uuid of this lastvideolist
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this lastvideolist.
	 *
	 * @param userUuid the user uuid of this lastvideolist
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this lastvideolist.
	 *
	 * @return the user name of this lastvideolist
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this lastvideolist.
	 *
	 * @param userName the user name of this lastvideolist
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this lastvideolist.
	 *
	 * @return the create date of this lastvideolist
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this lastvideolist.
	 *
	 * @param createDate the create date of this lastvideolist
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this lastvideolist.
	 *
	 * @return the modified date of this lastvideolist
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this lastvideolist.
	 *
	 * @param modifiedDate the modified date of this lastvideolist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

}