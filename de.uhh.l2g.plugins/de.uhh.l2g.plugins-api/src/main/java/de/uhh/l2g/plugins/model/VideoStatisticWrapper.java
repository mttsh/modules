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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VideoStatistic}.
 * </p>
 *
 * @author Iavor Sturm
 * @see VideoStatistic
 * @generated
 */
@ProviderType
public class VideoStatisticWrapper implements VideoStatistic,
	ModelWrapper<VideoStatistic> {
	public VideoStatisticWrapper(VideoStatistic videoStatistic) {
		_videoStatistic = videoStatistic;
	}

	@Override
	public Class<?> getModelClass() {
		return VideoStatistic.class;
	}

	@Override
	public String getModelClassName() {
		return VideoStatistic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("videoStatisticId", getVideoStatisticId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("compareDate", getCompareDate());
		attributes.put("totalVideos", getTotalVideos());
		attributes.put("publicVideos", getPublicVideos());
		attributes.put("privateVideos", getPrivateVideos());
		attributes.put("currentTotal", getCurrentTotal());
		attributes.put("currentPublic", getCurrentPublic());
		attributes.put("currentPrivate", getCurrentPrivate());
		attributes.put("pubPercent", getPubPercent());
		attributes.put("privPercent", getPrivPercent());
		attributes.put("currentPubPercent", getCurrentPubPercent());
		attributes.put("currentPrivPercent", getCurrentPrivPercent());
		attributes.put("intervalName", getIntervalName());
		attributes.put("publicDiff", getPublicDiff());
		attributes.put("privateDiff", getPrivateDiff());
		attributes.put("totalDiff", getTotalDiff());
		attributes.put("dateDiff", getDateDiff());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long videoStatisticId = (Long)attributes.get("videoStatisticId");

		if (videoStatisticId != null) {
			setVideoStatisticId(videoStatisticId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date compareDate = (Date)attributes.get("compareDate");

		if (compareDate != null) {
			setCompareDate(compareDate);
		}

		Long totalVideos = (Long)attributes.get("totalVideos");

		if (totalVideos != null) {
			setTotalVideos(totalVideos);
		}

		Long publicVideos = (Long)attributes.get("publicVideos");

		if (publicVideos != null) {
			setPublicVideos(publicVideos);
		}

		Long privateVideos = (Long)attributes.get("privateVideos");

		if (privateVideos != null) {
			setPrivateVideos(privateVideos);
		}

		Long currentTotal = (Long)attributes.get("currentTotal");

		if (currentTotal != null) {
			setCurrentTotal(currentTotal);
		}

		Long currentPublic = (Long)attributes.get("currentPublic");

		if (currentPublic != null) {
			setCurrentPublic(currentPublic);
		}

		Long currentPrivate = (Long)attributes.get("currentPrivate");

		if (currentPrivate != null) {
			setCurrentPrivate(currentPrivate);
		}

		Integer pubPercent = (Integer)attributes.get("pubPercent");

		if (pubPercent != null) {
			setPubPercent(pubPercent);
		}

		Integer privPercent = (Integer)attributes.get("privPercent");

		if (privPercent != null) {
			setPrivPercent(privPercent);
		}

		Integer currentPubPercent = (Integer)attributes.get("currentPubPercent");

		if (currentPubPercent != null) {
			setCurrentPubPercent(currentPubPercent);
		}

		Integer currentPrivPercent = (Integer)attributes.get(
				"currentPrivPercent");

		if (currentPrivPercent != null) {
			setCurrentPrivPercent(currentPrivPercent);
		}

		String intervalName = (String)attributes.get("intervalName");

		if (intervalName != null) {
			setIntervalName(intervalName);
		}

		Integer publicDiff = (Integer)attributes.get("publicDiff");

		if (publicDiff != null) {
			setPublicDiff(publicDiff);
		}

		Integer privateDiff = (Integer)attributes.get("privateDiff");

		if (privateDiff != null) {
			setPrivateDiff(privateDiff);
		}

		Integer totalDiff = (Integer)attributes.get("totalDiff");

		if (totalDiff != null) {
			setTotalDiff(totalDiff);
		}

		Integer dateDiff = (Integer)attributes.get("dateDiff");

		if (dateDiff != null) {
			setDateDiff(dateDiff);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _videoStatistic.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _videoStatistic.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _videoStatistic.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _videoStatistic.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<de.uhh.l2g.plugins.model.VideoStatistic> toCacheModel() {
		return _videoStatistic.toCacheModel();
	}

	@Override
	public de.uhh.l2g.plugins.model.VideoStatistic toEscapedModel() {
		return new VideoStatisticWrapper(_videoStatistic.toEscapedModel());
	}

	@Override
	public de.uhh.l2g.plugins.model.VideoStatistic toUnescapedModel() {
		return new VideoStatisticWrapper(_videoStatistic.toUnescapedModel());
	}

	@Override
	public int compareTo(de.uhh.l2g.plugins.model.VideoStatistic videoStatistic) {
		return _videoStatistic.compareTo(videoStatistic);
	}

	/**
	* Returns the current priv percent of this video statistic.
	*
	* @return the current priv percent of this video statistic
	*/
	@Override
	public int getCurrentPrivPercent() {
		return _videoStatistic.getCurrentPrivPercent();
	}

	/**
	* Returns the current pub percent of this video statistic.
	*
	* @return the current pub percent of this video statistic
	*/
	@Override
	public int getCurrentPubPercent() {
		return _videoStatistic.getCurrentPubPercent();
	}

	/**
	* Returns the date diff of this video statistic.
	*
	* @return the date diff of this video statistic
	*/
	@Override
	public int getDateDiff() {
		return _videoStatistic.getDateDiff();
	}

	/**
	* Returns the priv percent of this video statistic.
	*
	* @return the priv percent of this video statistic
	*/
	@Override
	public int getPrivPercent() {
		return _videoStatistic.getPrivPercent();
	}

	/**
	* Returns the private diff of this video statistic.
	*
	* @return the private diff of this video statistic
	*/
	@Override
	public int getPrivateDiff() {
		return _videoStatistic.getPrivateDiff();
	}

	/**
	* Returns the pub percent of this video statistic.
	*
	* @return the pub percent of this video statistic
	*/
	@Override
	public int getPubPercent() {
		return _videoStatistic.getPubPercent();
	}

	/**
	* Returns the public diff of this video statistic.
	*
	* @return the public diff of this video statistic
	*/
	@Override
	public int getPublicDiff() {
		return _videoStatistic.getPublicDiff();
	}

	/**
	* Returns the total diff of this video statistic.
	*
	* @return the total diff of this video statistic
	*/
	@Override
	public int getTotalDiff() {
		return _videoStatistic.getTotalDiff();
	}

	@Override
	public int hashCode() {
		return _videoStatistic.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _videoStatistic.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VideoStatisticWrapper((VideoStatistic)_videoStatistic.clone());
	}

	/**
	* Returns the interval name of this video statistic.
	*
	* @return the interval name of this video statistic
	*/
	@Override
	public java.lang.String getIntervalName() {
		return _videoStatistic.getIntervalName();
	}

	@Override
	public java.lang.String toString() {
		return _videoStatistic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _videoStatistic.toXmlString();
	}

	/**
	* Returns the compare date of this video statistic.
	*
	* @return the compare date of this video statistic
	*/
	@Override
	public Date getCompareDate() {
		return _videoStatistic.getCompareDate();
	}

	/**
	* Returns the create date of this video statistic.
	*
	* @return the create date of this video statistic
	*/
	@Override
	public Date getCreateDate() {
		return _videoStatistic.getCreateDate();
	}

	/**
	* Returns the modified date of this video statistic.
	*
	* @return the modified date of this video statistic
	*/
	@Override
	public Date getModifiedDate() {
		return _videoStatistic.getModifiedDate();
	}

	/**
	* Returns the company ID of this video statistic.
	*
	* @return the company ID of this video statistic
	*/
	@Override
	public long getCompanyId() {
		return _videoStatistic.getCompanyId();
	}

	/**
	* Returns the current private of this video statistic.
	*
	* @return the current private of this video statistic
	*/
	@Override
	public long getCurrentPrivate() {
		return _videoStatistic.getCurrentPrivate();
	}

	/**
	* Returns the current public of this video statistic.
	*
	* @return the current public of this video statistic
	*/
	@Override
	public long getCurrentPublic() {
		return _videoStatistic.getCurrentPublic();
	}

	/**
	* Returns the current total of this video statistic.
	*
	* @return the current total of this video statistic
	*/
	@Override
	public long getCurrentTotal() {
		return _videoStatistic.getCurrentTotal();
	}

	/**
	* Returns the group ID of this video statistic.
	*
	* @return the group ID of this video statistic
	*/
	@Override
	public long getGroupId() {
		return _videoStatistic.getGroupId();
	}

	/**
	* Returns the primary key of this video statistic.
	*
	* @return the primary key of this video statistic
	*/
	@Override
	public long getPrimaryKey() {
		return _videoStatistic.getPrimaryKey();
	}

	/**
	* Returns the private videos of this video statistic.
	*
	* @return the private videos of this video statistic
	*/
	@Override
	public long getPrivateVideos() {
		return _videoStatistic.getPrivateVideos();
	}

	/**
	* Returns the public videos of this video statistic.
	*
	* @return the public videos of this video statistic
	*/
	@Override
	public long getPublicVideos() {
		return _videoStatistic.getPublicVideos();
	}

	/**
	* Returns the total videos of this video statistic.
	*
	* @return the total videos of this video statistic
	*/
	@Override
	public long getTotalVideos() {
		return _videoStatistic.getTotalVideos();
	}

	/**
	* Returns the video statistic ID of this video statistic.
	*
	* @return the video statistic ID of this video statistic
	*/
	@Override
	public long getVideoStatisticId() {
		return _videoStatistic.getVideoStatisticId();
	}

	@Override
	public void persist() {
		_videoStatistic.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_videoStatistic.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this video statistic.
	*
	* @param companyId the company ID of this video statistic
	*/
	@Override
	public void setCompanyId(long companyId) {
		_videoStatistic.setCompanyId(companyId);
	}

	/**
	* Sets the compare date of this video statistic.
	*
	* @param compareDate the compare date of this video statistic
	*/
	@Override
	public void setCompareDate(Date compareDate) {
		_videoStatistic.setCompareDate(compareDate);
	}

	/**
	* Sets the create date of this video statistic.
	*
	* @param createDate the create date of this video statistic
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_videoStatistic.setCreateDate(createDate);
	}

	/**
	* Sets the current priv percent of this video statistic.
	*
	* @param currentPrivPercent the current priv percent of this video statistic
	*/
	@Override
	public void setCurrentPrivPercent(int currentPrivPercent) {
		_videoStatistic.setCurrentPrivPercent(currentPrivPercent);
	}

	/**
	* Sets the current private of this video statistic.
	*
	* @param currentPrivate the current private of this video statistic
	*/
	@Override
	public void setCurrentPrivate(long currentPrivate) {
		_videoStatistic.setCurrentPrivate(currentPrivate);
	}

	/**
	* Sets the current pub percent of this video statistic.
	*
	* @param currentPubPercent the current pub percent of this video statistic
	*/
	@Override
	public void setCurrentPubPercent(int currentPubPercent) {
		_videoStatistic.setCurrentPubPercent(currentPubPercent);
	}

	/**
	* Sets the current public of this video statistic.
	*
	* @param currentPublic the current public of this video statistic
	*/
	@Override
	public void setCurrentPublic(long currentPublic) {
		_videoStatistic.setCurrentPublic(currentPublic);
	}

	/**
	* Sets the current total of this video statistic.
	*
	* @param currentTotal the current total of this video statistic
	*/
	@Override
	public void setCurrentTotal(long currentTotal) {
		_videoStatistic.setCurrentTotal(currentTotal);
	}

	/**
	* Sets the date diff of this video statistic.
	*
	* @param dateDiff the date diff of this video statistic
	*/
	@Override
	public void setDateDiff(int dateDiff) {
		_videoStatistic.setDateDiff(dateDiff);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_videoStatistic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_videoStatistic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_videoStatistic.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this video statistic.
	*
	* @param groupId the group ID of this video statistic
	*/
	@Override
	public void setGroupId(long groupId) {
		_videoStatistic.setGroupId(groupId);
	}

	/**
	* Sets the interval name of this video statistic.
	*
	* @param intervalName the interval name of this video statistic
	*/
	@Override
	public void setIntervalName(java.lang.String intervalName) {
		_videoStatistic.setIntervalName(intervalName);
	}

	/**
	* Sets the modified date of this video statistic.
	*
	* @param modifiedDate the modified date of this video statistic
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_videoStatistic.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_videoStatistic.setNew(n);
	}

	/**
	* Sets the primary key of this video statistic.
	*
	* @param primaryKey the primary key of this video statistic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_videoStatistic.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_videoStatistic.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the priv percent of this video statistic.
	*
	* @param privPercent the priv percent of this video statistic
	*/
	@Override
	public void setPrivPercent(int privPercent) {
		_videoStatistic.setPrivPercent(privPercent);
	}

	/**
	* Sets the private diff of this video statistic.
	*
	* @param privateDiff the private diff of this video statistic
	*/
	@Override
	public void setPrivateDiff(int privateDiff) {
		_videoStatistic.setPrivateDiff(privateDiff);
	}

	/**
	* Sets the private videos of this video statistic.
	*
	* @param privateVideos the private videos of this video statistic
	*/
	@Override
	public void setPrivateVideos(long privateVideos) {
		_videoStatistic.setPrivateVideos(privateVideos);
	}

	/**
	* Sets the pub percent of this video statistic.
	*
	* @param pubPercent the pub percent of this video statistic
	*/
	@Override
	public void setPubPercent(int pubPercent) {
		_videoStatistic.setPubPercent(pubPercent);
	}

	/**
	* Sets the public diff of this video statistic.
	*
	* @param publicDiff the public diff of this video statistic
	*/
	@Override
	public void setPublicDiff(int publicDiff) {
		_videoStatistic.setPublicDiff(publicDiff);
	}

	/**
	* Sets the public videos of this video statistic.
	*
	* @param publicVideos the public videos of this video statistic
	*/
	@Override
	public void setPublicVideos(long publicVideos) {
		_videoStatistic.setPublicVideos(publicVideos);
	}

	/**
	* Sets the total diff of this video statistic.
	*
	* @param totalDiff the total diff of this video statistic
	*/
	@Override
	public void setTotalDiff(int totalDiff) {
		_videoStatistic.setTotalDiff(totalDiff);
	}

	/**
	* Sets the total videos of this video statistic.
	*
	* @param totalVideos the total videos of this video statistic
	*/
	@Override
	public void setTotalVideos(long totalVideos) {
		_videoStatistic.setTotalVideos(totalVideos);
	}

	/**
	* Sets the video statistic ID of this video statistic.
	*
	* @param videoStatisticId the video statistic ID of this video statistic
	*/
	@Override
	public void setVideoStatisticId(long videoStatisticId) {
		_videoStatistic.setVideoStatisticId(videoStatisticId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VideoStatisticWrapper)) {
			return false;
		}

		VideoStatisticWrapper videoStatisticWrapper = (VideoStatisticWrapper)obj;

		if (Objects.equals(_videoStatistic,
					videoStatisticWrapper._videoStatistic)) {
			return true;
		}

		return false;
	}

	@Override
	public VideoStatistic getWrappedModel() {
		return _videoStatistic;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _videoStatistic.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _videoStatistic.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_videoStatistic.resetOriginalValues();
	}

	private final VideoStatistic _videoStatistic;
}