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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Tagcloud}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Tagcloud
 * @generated
 */
@ProviderType
public class TagcloudWrapper implements Tagcloud, ModelWrapper<Tagcloud> {
	public TagcloudWrapper(Tagcloud tagcloud) {
		_tagcloud = tagcloud;
	}

	@Override
	public Class<?> getModelClass() {
		return Tagcloud.class;
	}

	@Override
	public String getModelClassName() {
		return Tagcloud.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagcloudId", getTagcloudId());
		attributes.put("objectClassType", getObjectClassType());
		attributes.put("objectId", getObjectId());
		attributes.put("tags", getTags());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tagcloudId = (Long)attributes.get("tagcloudId");

		if (tagcloudId != null) {
			setTagcloudId(tagcloudId);
		}

		String objectClassType = (String)attributes.get("objectClassType");

		if (objectClassType != null) {
			setObjectClassType(objectClassType);
		}

		Long objectId = (Long)attributes.get("objectId");

		if (objectId != null) {
			setObjectId(objectId);
		}

		String tags = (String)attributes.get("tags");

		if (tags != null) {
			setTags(tags);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tagcloud.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tagcloud.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tagcloud.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tagcloud.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<de.uhh.l2g.plugins.model.Tagcloud> toCacheModel() {
		return _tagcloud.toCacheModel();
	}

	@Override
	public de.uhh.l2g.plugins.model.Tagcloud toEscapedModel() {
		return new TagcloudWrapper(_tagcloud.toEscapedModel());
	}

	@Override
	public de.uhh.l2g.plugins.model.Tagcloud toUnescapedModel() {
		return new TagcloudWrapper(_tagcloud.toUnescapedModel());
	}

	@Override
	public int compareTo(de.uhh.l2g.plugins.model.Tagcloud tagcloud) {
		return _tagcloud.compareTo(tagcloud);
	}

	@Override
	public int hashCode() {
		return _tagcloud.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tagcloud.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TagcloudWrapper((Tagcloud)_tagcloud.clone());
	}

	/**
	* Returns the object class type of this tagcloud.
	*
	* @return the object class type of this tagcloud
	*/
	@Override
	public java.lang.String getObjectClassType() {
		return _tagcloud.getObjectClassType();
	}

	/**
	* Returns the tags of this tagcloud.
	*
	* @return the tags of this tagcloud
	*/
	@Override
	public java.lang.String getTags() {
		return _tagcloud.getTags();
	}

	@Override
	public java.lang.String toString() {
		return _tagcloud.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tagcloud.toXmlString();
	}

	/**
	* Returns the object ID of this tagcloud.
	*
	* @return the object ID of this tagcloud
	*/
	@Override
	public long getObjectId() {
		return _tagcloud.getObjectId();
	}

	/**
	* Returns the primary key of this tagcloud.
	*
	* @return the primary key of this tagcloud
	*/
	@Override
	public long getPrimaryKey() {
		return _tagcloud.getPrimaryKey();
	}

	/**
	* Returns the tagcloud ID of this tagcloud.
	*
	* @return the tagcloud ID of this tagcloud
	*/
	@Override
	public long getTagcloudId() {
		return _tagcloud.getTagcloudId();
	}

	@Override
	public void persist() {
		_tagcloud.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tagcloud.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tagcloud.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tagcloud.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tagcloud.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tagcloud.setNew(n);
	}

	/**
	* Sets the object class type of this tagcloud.
	*
	* @param objectClassType the object class type of this tagcloud
	*/
	@Override
	public void setObjectClassType(java.lang.String objectClassType) {
		_tagcloud.setObjectClassType(objectClassType);
	}

	/**
	* Sets the object ID of this tagcloud.
	*
	* @param objectId the object ID of this tagcloud
	*/
	@Override
	public void setObjectId(long objectId) {
		_tagcloud.setObjectId(objectId);
	}

	/**
	* Sets the primary key of this tagcloud.
	*
	* @param primaryKey the primary key of this tagcloud
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tagcloud.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tagcloud.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tagcloud ID of this tagcloud.
	*
	* @param tagcloudId the tagcloud ID of this tagcloud
	*/
	@Override
	public void setTagcloudId(long tagcloudId) {
		_tagcloud.setTagcloudId(tagcloudId);
	}

	/**
	* Sets the tags of this tagcloud.
	*
	* @param tags the tags of this tagcloud
	*/
	@Override
	public void setTags(java.lang.String tags) {
		_tagcloud.setTags(tags);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TagcloudWrapper)) {
			return false;
		}

		TagcloudWrapper tagcloudWrapper = (TagcloudWrapper)obj;

		if (Objects.equals(_tagcloud, tagcloudWrapper._tagcloud)) {
			return true;
		}

		return false;
	}

	@Override
	public Tagcloud getWrappedModel() {
		return _tagcloud;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tagcloud.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tagcloud.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tagcloud.resetOriginalValues();
	}

	private final Tagcloud _tagcloud;
}