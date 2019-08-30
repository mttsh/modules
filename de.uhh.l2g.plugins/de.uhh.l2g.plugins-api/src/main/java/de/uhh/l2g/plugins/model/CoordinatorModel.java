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
 * The base model interface for the Coordinator service. Represents a row in the &quot;LG_Coordinator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.uhh.l2g.plugins.model.impl.CoordinatorModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.uhh.l2g.plugins.model.impl.CoordinatorImpl</code>.
 * </p>
 *
 * @author Iavor Sturm
 * @see Coordinator
 * @generated
 */
@ProviderType
public interface CoordinatorModel
	extends BaseModel<Coordinator>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a coordinator model instance should use the {@link Coordinator} interface instead.
	 */

	/**
	 * Returns the primary key of this coordinator.
	 *
	 * @return the primary key of this coordinator
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this coordinator.
	 *
	 * @param primaryKey the primary key of this coordinator
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the coordinator ID of this coordinator.
	 *
	 * @return the coordinator ID of this coordinator
	 */
	public long getCoordinatorId();

	/**
	 * Sets the coordinator ID of this coordinator.
	 *
	 * @param coordinatorId the coordinator ID of this coordinator
	 */
	public void setCoordinatorId(long coordinatorId);

	/**
	 * Returns the institution ID of this coordinator.
	 *
	 * @return the institution ID of this coordinator
	 */
	public long getInstitutionId();

	/**
	 * Sets the institution ID of this coordinator.
	 *
	 * @param institutionId the institution ID of this coordinator
	 */
	public void setInstitutionId(long institutionId);

	/**
	 * Returns the office ID of this coordinator.
	 *
	 * @return the office ID of this coordinator
	 */
	public long getOfficeId();

	/**
	 * Sets the office ID of this coordinator.
	 *
	 * @param officeId the office ID of this coordinator
	 */
	public void setOfficeId(long officeId);

	/**
	 * Returns the group ID of this coordinator.
	 *
	 * @return the group ID of this coordinator
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this coordinator.
	 *
	 * @param groupId the group ID of this coordinator
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this coordinator.
	 *
	 * @return the company ID of this coordinator
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this coordinator.
	 *
	 * @param companyId the company ID of this coordinator
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this coordinator.
	 *
	 * @return the user ID of this coordinator
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this coordinator.
	 *
	 * @param userId the user ID of this coordinator
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this coordinator.
	 *
	 * @return the user uuid of this coordinator
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this coordinator.
	 *
	 * @param userUuid the user uuid of this coordinator
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this coordinator.
	 *
	 * @return the user name of this coordinator
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this coordinator.
	 *
	 * @param userName the user name of this coordinator
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this coordinator.
	 *
	 * @return the create date of this coordinator
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this coordinator.
	 *
	 * @param createDate the create date of this coordinator
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this coordinator.
	 *
	 * @return the modified date of this coordinator
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this coordinator.
	 *
	 * @param modifiedDate the modified date of this coordinator
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

}