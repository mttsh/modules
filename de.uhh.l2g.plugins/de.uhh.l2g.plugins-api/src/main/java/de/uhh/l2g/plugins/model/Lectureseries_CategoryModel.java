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
 * The base model interface for the Lectureseries_Category service. Represents a row in the &quot;LG_Lectureseries_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.Lectureseries_CategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.Lectureseries_CategoryImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Lectureseries_Category
 * @see de.uhh.l2g.plugins.model.impl.Lectureseries_CategoryImpl
 * @see de.uhh.l2g.plugins.model.impl.Lectureseries_CategoryModelImpl
 * @generated
 */
@ProviderType
public interface Lectureseries_CategoryModel extends BaseModel<Lectureseries_Category> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lectureseries_ category model instance should use the {@link Lectureseries_Category} interface instead.
	 */

	/**
	 * Returns the primary key of this lectureseries_ category.
	 *
	 * @return the primary key of this lectureseries_ category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lectureseries_ category.
	 *
	 * @param primaryKey the primary key of this lectureseries_ category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lectureseries category ID of this lectureseries_ category.
	 *
	 * @return the lectureseries category ID of this lectureseries_ category
	 */
	public long getLectureseriesCategoryId();

	/**
	 * Sets the lectureseries category ID of this lectureseries_ category.
	 *
	 * @param lectureseriesCategoryId the lectureseries category ID of this lectureseries_ category
	 */
	public void setLectureseriesCategoryId(long lectureseriesCategoryId);

	/**
	 * Returns the category ID of this lectureseries_ category.
	 *
	 * @return the category ID of this lectureseries_ category
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this lectureseries_ category.
	 *
	 * @param categoryId the category ID of this lectureseries_ category
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the lectureseries ID of this lectureseries_ category.
	 *
	 * @return the lectureseries ID of this lectureseries_ category
	 */
	public long getLectureseriesId();

	/**
	 * Sets the lectureseries ID of this lectureseries_ category.
	 *
	 * @param lectureseriesId the lectureseries ID of this lectureseries_ category
	 */
	public void setLectureseriesId(long lectureseriesId);

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
		de.uhh.l2g.plugins.model.Lectureseries_Category lectureseries_Category);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Lectureseries_Category> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries_Category toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries_Category toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}