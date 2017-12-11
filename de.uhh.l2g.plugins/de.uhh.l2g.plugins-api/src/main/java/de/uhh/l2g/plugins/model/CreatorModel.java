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
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Creator service. Represents a row in the &quot;LG_Creator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.CreatorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.CreatorImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Creator
 * @see de.uhh.l2g.plugins.model.impl.CreatorImpl
 * @see de.uhh.l2g.plugins.model.impl.CreatorModelImpl
 * @generated
 */
@ProviderType
public interface CreatorModel extends BaseModel<Creator> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a creator model instance should use the {@link Creator} interface instead.
	 */

	/**
	 * Returns the primary key of this creator.
	 *
	 * @return the primary key of this creator
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this creator.
	 *
	 * @param primaryKey the primary key of this creator
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the creator ID of this creator.
	 *
	 * @return the creator ID of this creator
	 */
	public long getCreatorId();

	/**
	 * Sets the creator ID of this creator.
	 *
	 * @param creatorId the creator ID of this creator
	 */
	public void setCreatorId(long creatorId);

	/**
	 * Returns the first name of this creator.
	 *
	 * @return the first name of this creator
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this creator.
	 *
	 * @param firstName the first name of this creator
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this creator.
	 *
	 * @return the last name of this creator
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this creator.
	 *
	 * @param lastName the last name of this creator
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the middle name of this creator.
	 *
	 * @return the middle name of this creator
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this creator.
	 *
	 * @param middleName the middle name of this creator
	 */
	public void setMiddleName(String middleName);

	/**
	 * Returns the job title of this creator.
	 *
	 * @return the job title of this creator
	 */
	@AutoEscape
	public String getJobTitle();

	/**
	 * Sets the job title of this creator.
	 *
	 * @param jobTitle the job title of this creator
	 */
	public void setJobTitle(String jobTitle);

	/**
	 * Returns the gender of this creator.
	 *
	 * @return the gender of this creator
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this creator.
	 *
	 * @param gender the gender of this creator
	 */
	public void setGender(String gender);

	/**
	 * Returns the full name of this creator.
	 *
	 * @return the full name of this creator
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this creator.
	 *
	 * @param fullName the full name of this creator
	 */
	public void setFullName(String fullName);

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
	public int compareTo(de.uhh.l2g.plugins.model.Creator creator);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Creator> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Creator toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Creator toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}