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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
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

import de.uhh.l2g.plugins.model.Statistic;
import de.uhh.l2g.plugins.model.StatisticModel;

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Statistic service. Represents a row in the &quot;LG_Statistic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>StatisticModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatisticImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see StatisticImpl
 * @generated
 */
@ProviderType
public class StatisticModelImpl
	extends BaseModelImpl<Statistic> implements StatisticModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a statistic model instance should use the <code>Statistic</code> interface instead.
	 */
	public static final String TABLE_NAME = "LG_Statistic";

	public static final Object[][] TABLE_COLUMNS = {
		{"createDate", Types.TIMESTAMP}, {"publicVideos", Types.INTEGER},
		{"privateVideos", Types.INTEGER}, {"autofillRow", Types.INTEGER},
		{"statisticId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("publicVideos", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("privateVideos", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("autofillRow", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statisticId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table LG_Statistic (createDate DATE null,publicVideos INTEGER,privateVideos INTEGER,autofillRow INTEGER,statisticId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table LG_Statistic";

	public static final String ORDER_BY_JPQL =
		" ORDER BY statistic.statisticId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY LG_Statistic.statisticId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Statistic"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Statistic"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Statistic"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long STATISTICID_COLUMN_BITMASK = 8L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"lock.expiration.time.de.uhh.l2g.plugins.model.Statistic"));

	public StatisticModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _statisticId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatisticId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statisticId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Statistic.class;
	}

	@Override
	public String getModelClassName() {
		return Statistic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Statistic, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Statistic, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Statistic, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Statistic)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Statistic, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Statistic, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Statistic)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Statistic, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Statistic, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Statistic>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Statistic.class.getClassLoader(), Statistic.class,
			ModelWrapper.class);

		try {
			Constructor<Statistic> constructor =
				(Constructor<Statistic>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Statistic, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Statistic, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Statistic, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Statistic, Object>>();
		Map<String, BiConsumer<Statistic, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Statistic, ?>>();

		attributeGetterFunctions.put("createDate", Statistic::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Statistic, Date>)Statistic::setCreateDate);
		attributeGetterFunctions.put(
			"publicVideos", Statistic::getPublicVideos);
		attributeSetterBiConsumers.put(
			"publicVideos",
			(BiConsumer<Statistic, Integer>)Statistic::setPublicVideos);
		attributeGetterFunctions.put(
			"privateVideos", Statistic::getPrivateVideos);
		attributeSetterBiConsumers.put(
			"privateVideos",
			(BiConsumer<Statistic, Integer>)Statistic::setPrivateVideos);
		attributeGetterFunctions.put("autofillRow", Statistic::getAutofillRow);
		attributeSetterBiConsumers.put(
			"autofillRow",
			(BiConsumer<Statistic, Integer>)Statistic::setAutofillRow);
		attributeGetterFunctions.put("statisticId", Statistic::getStatisticId);
		attributeSetterBiConsumers.put(
			"statisticId",
			(BiConsumer<Statistic, Long>)Statistic::setStatisticId);
		attributeGetterFunctions.put("groupId", Statistic::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Statistic, Long>)Statistic::setGroupId);
		attributeGetterFunctions.put("companyId", Statistic::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Statistic, Long>)Statistic::setCompanyId);
		attributeGetterFunctions.put("userId", Statistic::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Statistic, Long>)Statistic::setUserId);
		attributeGetterFunctions.put("userName", Statistic::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Statistic, String>)Statistic::setUserName);
		attributeGetterFunctions.put(
			"modifiedDate", Statistic::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Statistic, Date>)Statistic::setModifiedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask |= CREATEDATE_COLUMN_BITMASK;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

	@Override
	public int getPublicVideos() {
		return _publicVideos;
	}

	@Override
	public void setPublicVideos(int publicVideos) {
		_publicVideos = publicVideos;
	}

	@Override
	public int getPrivateVideos() {
		return _privateVideos;
	}

	@Override
	public void setPrivateVideos(int privateVideos) {
		_privateVideos = privateVideos;
	}

	@Override
	public int getAutofillRow() {
		return _autofillRow;
	}

	@Override
	public void setAutofillRow(int autofillRow) {
		_autofillRow = autofillRow;
	}

	@Override
	public long getStatisticId() {
		return _statisticId;
	}

	@Override
	public void setStatisticId(long statisticId) {
		_columnBitmask |= STATISTICID_COLUMN_BITMASK;

		if (!_setOriginalStatisticId) {
			_setOriginalStatisticId = true;

			_originalStatisticId = _statisticId;
		}

		_statisticId = statisticId;
	}

	public long getOriginalStatisticId() {
		return _originalStatisticId;
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
			getCompanyId(), Statistic.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Statistic toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = _escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StatisticImpl statisticImpl = new StatisticImpl();

		statisticImpl.setCreateDate(getCreateDate());
		statisticImpl.setPublicVideos(getPublicVideos());
		statisticImpl.setPrivateVideos(getPrivateVideos());
		statisticImpl.setAutofillRow(getAutofillRow());
		statisticImpl.setStatisticId(getStatisticId());
		statisticImpl.setGroupId(getGroupId());
		statisticImpl.setCompanyId(getCompanyId());
		statisticImpl.setUserId(getUserId());
		statisticImpl.setUserName(getUserName());
		statisticImpl.setModifiedDate(getModifiedDate());

		statisticImpl.resetOriginalValues();

		return statisticImpl;
	}

	@Override
	public int compareTo(Statistic statistic) {
		long primaryKey = statistic.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Statistic)) {
			return false;
		}

		Statistic statistic = (Statistic)obj;

		long primaryKey = statistic.getPrimaryKey();

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
		StatisticModelImpl statisticModelImpl = this;

		statisticModelImpl._originalCreateDate = statisticModelImpl._createDate;

		statisticModelImpl._originalStatisticId =
			statisticModelImpl._statisticId;

		statisticModelImpl._setOriginalStatisticId = false;

		statisticModelImpl._originalGroupId = statisticModelImpl._groupId;

		statisticModelImpl._setOriginalGroupId = false;

		statisticModelImpl._originalCompanyId = statisticModelImpl._companyId;

		statisticModelImpl._setOriginalCompanyId = false;

		statisticModelImpl._setModifiedDate = false;

		statisticModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Statistic> toCacheModel() {
		StatisticCacheModel statisticCacheModel = new StatisticCacheModel();

		Date createDate = getCreateDate();

		if (createDate != null) {
			statisticCacheModel.createDate = createDate.getTime();
		}
		else {
			statisticCacheModel.createDate = Long.MIN_VALUE;
		}

		statisticCacheModel.publicVideos = getPublicVideos();

		statisticCacheModel.privateVideos = getPrivateVideos();

		statisticCacheModel.autofillRow = getAutofillRow();

		statisticCacheModel.statisticId = getStatisticId();

		statisticCacheModel.groupId = getGroupId();

		statisticCacheModel.companyId = getCompanyId();

		statisticCacheModel.userId = getUserId();

		statisticCacheModel.userName = getUserName();

		String userName = statisticCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			statisticCacheModel.userName = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			statisticCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			statisticCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return statisticCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Statistic, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Statistic, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Statistic, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Statistic)this));
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
		Map<String, Function<Statistic, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Statistic, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Statistic, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Statistic)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final Function<InvocationHandler, Statistic>
		_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	private Date _createDate;
	private Date _originalCreateDate;
	private int _publicVideos;
	private int _privateVideos;
	private int _autofillRow;
	private long _statisticId;
	private long _originalStatisticId;
	private boolean _setOriginalStatisticId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Statistic _escapedModel;

}