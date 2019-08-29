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

package de.uhh.l2g.plugins.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import de.uhh.l2g.plugins.model.Creator;
import de.uhh.l2g.plugins.model.CreatorModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Creator service. Represents a row in the &quot;LG_Creator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CreatorModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreatorImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see CreatorImpl
 * @generated
 */
@ProviderType
public class CreatorModelImpl
	extends BaseModelImpl<Creator> implements CreatorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creator model instance should use the <code>Creator</code> interface instead.
	 */
	public static final String TABLE_NAME = "LG_Creator";

	public static final Object[][] TABLE_COLUMNS = {
		{"creatorId", Types.BIGINT}, {"firstName", Types.VARCHAR},
		{"lastName", Types.VARCHAR}, {"middleName", Types.VARCHAR},
		{"jobTitle", Types.VARCHAR}, {"gender", Types.VARCHAR},
		{"fullName", Types.VARCHAR}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("creatorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("middleName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jobTitle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("gender", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fullName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table LG_Creator (creatorId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,middleName VARCHAR(75) null,jobTitle VARCHAR(75) null,gender VARCHAR(75) null,fullName VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table LG_Creator";

	public static final String ORDER_BY_JPQL = " ORDER BY creator.lastName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY LG_Creator.lastName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Creator"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Creator"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Creator"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long FIRSTNAME_COLUMN_BITMASK = 2L;

	public static final long FULLNAME_COLUMN_BITMASK = 4L;

	public static final long GROUPID_COLUMN_BITMASK = 8L;

	public static final long LASTNAME_COLUMN_BITMASK = 16L;

	public static final long MIDDLENAME_COLUMN_BITMASK = 32L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"lock.expiration.time.de.uhh.l2g.plugins.model.Creator"));

	public CreatorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _creatorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCreatorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _creatorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Creator.class;
	}

	@Override
	public String getModelClassName() {
		return Creator.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Creator, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Creator, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Creator, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Creator)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Creator, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Creator, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Creator)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Creator, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Creator, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Creator>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Creator.class.getClassLoader(), Creator.class, ModelWrapper.class);

		try {
			Constructor<Creator> constructor =
				(Constructor<Creator>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Creator, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Creator, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Creator, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Creator, Object>>();
		Map<String, BiConsumer<Creator, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Creator, ?>>();

		attributeGetterFunctions.put(
			"creatorId",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getCreatorId();
				}

			});
		attributeSetterBiConsumers.put(
			"creatorId",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object creatorId) {
					creator.setCreatorId((Long)creatorId);
				}

			});
		attributeGetterFunctions.put(
			"firstName",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getFirstName();
				}

			});
		attributeSetterBiConsumers.put(
			"firstName",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object firstName) {
					creator.setFirstName((String)firstName);
				}

			});
		attributeGetterFunctions.put(
			"lastName",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getLastName();
				}

			});
		attributeSetterBiConsumers.put(
			"lastName",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object lastName) {
					creator.setLastName((String)lastName);
				}

			});
		attributeGetterFunctions.put(
			"middleName",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getMiddleName();
				}

			});
		attributeSetterBiConsumers.put(
			"middleName",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object middleName) {
					creator.setMiddleName((String)middleName);
				}

			});
		attributeGetterFunctions.put(
			"jobTitle",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getJobTitle();
				}

			});
		attributeSetterBiConsumers.put(
			"jobTitle",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object jobTitle) {
					creator.setJobTitle((String)jobTitle);
				}

			});
		attributeGetterFunctions.put(
			"gender",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getGender();
				}

			});
		attributeSetterBiConsumers.put(
			"gender",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object gender) {
					creator.setGender((String)gender);
				}

			});
		attributeGetterFunctions.put(
			"fullName",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getFullName();
				}

			});
		attributeSetterBiConsumers.put(
			"fullName",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object fullName) {
					creator.setFullName((String)fullName);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object groupId) {
					creator.setGroupId((Long)groupId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object companyId) {
					creator.setCompanyId((Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object userId) {
					creator.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object userName) {
					creator.setUserName((String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object createDate) {
					creator.setCreateDate((Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Creator, Object>() {

				@Override
				public Object apply(Creator creator) {
					return creator.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Creator, Object>() {

				@Override
				public void accept(Creator creator, Object modifiedDate) {
					creator.setModifiedDate((Date)modifiedDate);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getCreatorId() {
		return _creatorId;
	}

	@Override
	public void setCreatorId(long creatorId) {
		_creatorId = creatorId;
	}

	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_columnBitmask |= FIRSTNAME_COLUMN_BITMASK;

		if (_originalFirstName == null) {
			_originalFirstName = _firstName;
		}

		_firstName = firstName;
	}

	public String getOriginalFirstName() {
		return GetterUtil.getString(_originalFirstName);
	}

	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_columnBitmask = -1L;

		if (_originalLastName == null) {
			_originalLastName = _lastName;
		}

		_lastName = lastName;
	}

	public String getOriginalLastName() {
		return GetterUtil.getString(_originalLastName);
	}

	@Override
	public String getMiddleName() {
		if (_middleName == null) {
			return "";
		}
		else {
			return _middleName;
		}
	}

	@Override
	public void setMiddleName(String middleName) {
		_columnBitmask |= MIDDLENAME_COLUMN_BITMASK;

		if (_originalMiddleName == null) {
			_originalMiddleName = _middleName;
		}

		_middleName = middleName;
	}

	public String getOriginalMiddleName() {
		return GetterUtil.getString(_originalMiddleName);
	}

	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return "";
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	@Override
	public String getGender() {
		if (_gender == null) {
			return "";
		}
		else {
			return _gender;
		}
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;
	}

	@Override
	public String getFullName() {
		if (_fullName == null) {
			return "";
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		_columnBitmask |= FULLNAME_COLUMN_BITMASK;

		if (_originalFullName == null) {
			_originalFullName = _fullName;
		}

		_fullName = fullName;
	}

	public String getOriginalFullName() {
		return GetterUtil.getString(_originalFullName);
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Creator.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Creator toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = _escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CreatorImpl creatorImpl = new CreatorImpl();

		creatorImpl.setCreatorId(getCreatorId());
		creatorImpl.setFirstName(getFirstName());
		creatorImpl.setLastName(getLastName());
		creatorImpl.setMiddleName(getMiddleName());
		creatorImpl.setJobTitle(getJobTitle());
		creatorImpl.setGender(getGender());
		creatorImpl.setFullName(getFullName());
		creatorImpl.setGroupId(getGroupId());
		creatorImpl.setCompanyId(getCompanyId());
		creatorImpl.setUserId(getUserId());
		creatorImpl.setUserName(getUserName());
		creatorImpl.setCreateDate(getCreateDate());
		creatorImpl.setModifiedDate(getModifiedDate());

		creatorImpl.resetOriginalValues();

		return creatorImpl;
	}

	@Override
	public int compareTo(Creator creator) {
		int value = 0;

		value = getLastName().compareTo(creator.getLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Creator)) {
			return false;
		}

		Creator creator = (Creator)obj;

		long primaryKey = creator.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CreatorModelImpl creatorModelImpl = this;

		creatorModelImpl._originalFirstName = creatorModelImpl._firstName;

		creatorModelImpl._originalLastName = creatorModelImpl._lastName;

		creatorModelImpl._originalMiddleName = creatorModelImpl._middleName;

		creatorModelImpl._originalFullName = creatorModelImpl._fullName;

		creatorModelImpl._originalGroupId = creatorModelImpl._groupId;

		creatorModelImpl._setOriginalGroupId = false;

		creatorModelImpl._originalCompanyId = creatorModelImpl._companyId;

		creatorModelImpl._setOriginalCompanyId = false;

		creatorModelImpl._setModifiedDate = false;

		creatorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Creator> toCacheModel() {
		CreatorCacheModel creatorCacheModel = new CreatorCacheModel();

		creatorCacheModel.creatorId = getCreatorId();

		creatorCacheModel.firstName = getFirstName();

		String firstName = creatorCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			creatorCacheModel.firstName = null;
		}

		creatorCacheModel.lastName = getLastName();

		String lastName = creatorCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			creatorCacheModel.lastName = null;
		}

		creatorCacheModel.middleName = getMiddleName();

		String middleName = creatorCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			creatorCacheModel.middleName = null;
		}

		creatorCacheModel.jobTitle = getJobTitle();

		String jobTitle = creatorCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			creatorCacheModel.jobTitle = null;
		}

		creatorCacheModel.gender = getGender();

		String gender = creatorCacheModel.gender;

		if ((gender != null) && (gender.length() == 0)) {
			creatorCacheModel.gender = null;
		}

		creatorCacheModel.fullName = getFullName();

		String fullName = creatorCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			creatorCacheModel.fullName = null;
		}

		creatorCacheModel.groupId = getGroupId();

		creatorCacheModel.companyId = getCompanyId();

		creatorCacheModel.userId = getUserId();

		creatorCacheModel.userName = getUserName();

		String userName = creatorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			creatorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			creatorCacheModel.createDate = createDate.getTime();
		}
		else {
			creatorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			creatorCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			creatorCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return creatorCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Creator, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Creator, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Creator, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Creator)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Creator, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Creator, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Creator, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Creator)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final Function<InvocationHandler, Creator>
		_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	private long _creatorId;
	private String _firstName;
	private String _originalFirstName;
	private String _lastName;
	private String _originalLastName;
	private String _middleName;
	private String _originalMiddleName;
	private String _jobTitle;
	private String _gender;
	private String _fullName;
	private String _originalFullName;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Creator _escapedModel;

}