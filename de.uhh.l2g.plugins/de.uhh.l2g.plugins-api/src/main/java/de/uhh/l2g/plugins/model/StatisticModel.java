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
 * The base model interface for the Statistic service. Represents a row in the &quot;LG_Statistic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.StatisticModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.StatisticImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Statistic
 * @see de.uhh.l2g.plugins.model.impl.StatisticImpl
 * @see de.uhh.l2g.plugins.model.impl.StatisticModelImpl
 * @generated
 */
@ProviderType
public interface StatisticModel extends BaseModel<Statistic>, GroupedModel,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statistic model instance should use the {@link Statistic} interface instead.
	 */

	/**
	 * Returns the primary key of this statistic.
	 *
	 * @return the primary key of this statistic
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statistic.
	 *
	 * @param primaryKey the primary key of this statistic
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the create date of this statistic.
	 *
	 * @return the create date of this statistic
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this statistic.
	 *
	 * @param createDate the create date of this statistic
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the public videos of this statistic.
	 *
	 * @return the public videos of this statistic
	 */
	public int getPublicVideos();

	/**
	 * Sets the public videos of this statistic.
	 *
	 * @param publicVideos the public videos of this statistic
	 */
	public void setPublicVideos(int publicVideos);

	/**
	 * Returns the private videos of this statistic.
	 *
	 * @return the private videos of this statistic
	 */
	public int getPrivateVideos();

	/**
	 * Sets the private videos of this statistic.
	 *
	 * @param privateVideos the private videos of this statistic
	 */
	public void setPrivateVideos(int privateVideos);

	/**
	 * Returns the autofill row of this statistic.
	 *
	 * @return the autofill row of this statistic
	 */
	public int getAutofillRow();

	/**
	 * Sets the autofill row of this statistic.
	 *
	 * @param autofillRow the autofill row of this statistic
	 */
	public void setAutofillRow(int autofillRow);

	/**
	 * Returns the statistic ID of this statistic.
	 *
	 * @return the statistic ID of this statistic
	 */
	public long getStatisticId();

	/**
	 * Sets the statistic ID of this statistic.
	 *
	 * @param statisticId the statistic ID of this statistic
	 */
	public void setStatisticId(long statisticId);

	/**
	 * Returns the group ID of this statistic.
	 *
	 * @return the group ID of this statistic
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this statistic.
	 *
	 * @param groupId the group ID of this statistic
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this statistic.
	 *
	 * @return the company ID of this statistic
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this statistic.
	 *
	 * @param companyId the company ID of this statistic
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this statistic.
	 *
	 * @return the user ID of this statistic
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this statistic.
	 *
	 * @param userId the user ID of this statistic
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this statistic.
	 *
	 * @return the user uuid of this statistic
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this statistic.
	 *
	 * @param userUuid the user uuid of this statistic
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this statistic.
	 *
	 * @return the user name of this statistic
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this statistic.
	 *
	 * @param userName the user name of this statistic
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the modified date of this statistic.
	 *
	 * @return the modified date of this statistic
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this statistic.
	 *
	 * @param modifiedDate the modified date of this statistic
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
	public int compareTo(de.uhh.l2g.plugins.model.Statistic statistic);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Statistic> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Statistic toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Statistic toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}