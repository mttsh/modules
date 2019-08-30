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

import de.uhh.l2g.plugins.model.Host;
import de.uhh.l2g.plugins.model.HostModel;

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
 * The base model implementation for the Host service. Represents a row in the &quot;LG_Host&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>HostModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HostImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see HostImpl
 * @generated
 */
@ProviderType
public class HostModelImpl extends BaseModelImpl<Host> implements HostModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a host model instance should use the <code>Host</code> interface instead.
	 */
	public static final String TABLE_NAME = "LG_Host";

	public static final Object[][] TABLE_COLUMNS = {
		{"hostId", Types.BIGINT}, {"protocol", Types.VARCHAR},
		{"streamer", Types.VARCHAR}, {"port", Types.INTEGER},
		{"serverRoot", Types.VARCHAR}, {"name", Types.VARCHAR},
		{"defaultHost", Types.INTEGER}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("hostId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("protocol", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("streamer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("port", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("serverRoot", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("defaultHost", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table LG_Host (hostId LONG not null primary key,protocol VARCHAR(75) null,streamer VARCHAR(75) null,port INTEGER,serverRoot VARCHAR(75) null,name VARCHAR(75) null,defaultHost INTEGER,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table LG_Host";

	public static final String ORDER_BY_JPQL = " ORDER BY host.serverRoot ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY LG_Host.serverRoot ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Host"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Host"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Host"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long HOSTID_COLUMN_BITMASK = 4L;

	public static final long SERVERROOT_COLUMN_BITMASK = 8L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		de.uhh.l2g.plugins.service.util.ServiceProps.get(
			"lock.expiration.time.de.uhh.l2g.plugins.model.Host"));

	public HostModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _hostId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHostId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hostId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Host.class;
	}

	@Override
	public String getModelClassName() {
		return Host.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Host, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Host, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Host, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Host)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Host, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Host, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Host)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Host, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Host, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Host>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Host.class.getClassLoader(), Host.class, ModelWrapper.class);

		try {
			Constructor<Host> constructor =
				(Constructor<Host>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Host, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Host, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Host, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Host, Object>>();
		Map<String, BiConsumer<Host, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Host, ?>>();

		attributeGetterFunctions.put("hostId", Host::getHostId);
		attributeSetterBiConsumers.put(
			"hostId", (BiConsumer<Host, Long>)Host::setHostId);
		attributeGetterFunctions.put("protocol", Host::getProtocol);
		attributeSetterBiConsumers.put(
			"protocol", (BiConsumer<Host, String>)Host::setProtocol);
		attributeGetterFunctions.put("streamer", Host::getStreamer);
		attributeSetterBiConsumers.put(
			"streamer", (BiConsumer<Host, String>)Host::setStreamer);
		attributeGetterFunctions.put("port", Host::getPort);
		attributeSetterBiConsumers.put(
			"port", (BiConsumer<Host, Integer>)Host::setPort);
		attributeGetterFunctions.put("serverRoot", Host::getServerRoot);
		attributeSetterBiConsumers.put(
			"serverRoot", (BiConsumer<Host, String>)Host::setServerRoot);
		attributeGetterFunctions.put("name", Host::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Host, String>)Host::setName);
		attributeGetterFunctions.put("defaultHost", Host::getDefaultHost);
		attributeSetterBiConsumers.put(
			"defaultHost", (BiConsumer<Host, Integer>)Host::setDefaultHost);
		attributeGetterFunctions.put("groupId", Host::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Host, Long>)Host::setGroupId);
		attributeGetterFunctions.put("companyId", Host::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Host, Long>)Host::setCompanyId);
		attributeGetterFunctions.put("userId", Host::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Host, Long>)Host::setUserId);
		attributeGetterFunctions.put("userName", Host::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Host, String>)Host::setUserName);
		attributeGetterFunctions.put("createDate", Host::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Host, Date>)Host::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Host::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Host, Date>)Host::setModifiedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getHostId() {
		return _hostId;
	}

	@Override
	public void setHostId(long hostId) {
		_columnBitmask |= HOSTID_COLUMN_BITMASK;

		if (!_setOriginalHostId) {
			_setOriginalHostId = true;

			_originalHostId = _hostId;
		}

		_hostId = hostId;
	}

	public long getOriginalHostId() {
		return _originalHostId;
	}

	@Override
	public String getProtocol() {
		if (_protocol == null) {
			return "";
		}
		else {
			return _protocol;
		}
	}

	@Override
	public void setProtocol(String protocol) {
		_protocol = protocol;
	}

	@Override
	public String getStreamer() {
		if (_streamer == null) {
			return "";
		}
		else {
			return _streamer;
		}
	}

	@Override
	public void setStreamer(String streamer) {
		_streamer = streamer;
	}

	@Override
	public int getPort() {
		return _port;
	}

	@Override
	public void setPort(int port) {
		_port = port;
	}

	@Override
	public String getServerRoot() {
		if (_serverRoot == null) {
			return "";
		}
		else {
			return _serverRoot;
		}
	}

	@Override
	public void setServerRoot(String serverRoot) {
		_columnBitmask = -1L;

		_serverRoot = serverRoot;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public int getDefaultHost() {
		return _defaultHost;
	}

	@Override
	public void setDefaultHost(int defaultHost) {
		_defaultHost = defaultHost;
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
			getCompanyId(), Host.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Host toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = _escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HostImpl hostImpl = new HostImpl();

		hostImpl.setHostId(getHostId());
		hostImpl.setProtocol(getProtocol());
		hostImpl.setStreamer(getStreamer());
		hostImpl.setPort(getPort());
		hostImpl.setServerRoot(getServerRoot());
		hostImpl.setName(getName());
		hostImpl.setDefaultHost(getDefaultHost());
		hostImpl.setGroupId(getGroupId());
		hostImpl.setCompanyId(getCompanyId());
		hostImpl.setUserId(getUserId());
		hostImpl.setUserName(getUserName());
		hostImpl.setCreateDate(getCreateDate());
		hostImpl.setModifiedDate(getModifiedDate());

		hostImpl.resetOriginalValues();

		return hostImpl;
	}

	@Override
	public int compareTo(Host host) {
		int value = 0;

		value = getServerRoot().compareTo(host.getServerRoot());

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

		if (!(obj instanceof Host)) {
			return false;
		}

		Host host = (Host)obj;

		long primaryKey = host.getPrimaryKey();

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
		HostModelImpl hostModelImpl = this;

		hostModelImpl._originalHostId = hostModelImpl._hostId;

		hostModelImpl._setOriginalHostId = false;

		hostModelImpl._originalGroupId = hostModelImpl._groupId;

		hostModelImpl._setOriginalGroupId = false;

		hostModelImpl._originalCompanyId = hostModelImpl._companyId;

		hostModelImpl._setOriginalCompanyId = false;

		hostModelImpl._setModifiedDate = false;

		hostModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Host> toCacheModel() {
		HostCacheModel hostCacheModel = new HostCacheModel();

		hostCacheModel.hostId = getHostId();

		hostCacheModel.protocol = getProtocol();

		String protocol = hostCacheModel.protocol;

		if ((protocol != null) && (protocol.length() == 0)) {
			hostCacheModel.protocol = null;
		}

		hostCacheModel.streamer = getStreamer();

		String streamer = hostCacheModel.streamer;

		if ((streamer != null) && (streamer.length() == 0)) {
			hostCacheModel.streamer = null;
		}

		hostCacheModel.port = getPort();

		hostCacheModel.serverRoot = getServerRoot();

		String serverRoot = hostCacheModel.serverRoot;

		if ((serverRoot != null) && (serverRoot.length() == 0)) {
			hostCacheModel.serverRoot = null;
		}

		hostCacheModel.name = getName();

		String name = hostCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			hostCacheModel.name = null;
		}

		hostCacheModel.defaultHost = getDefaultHost();

		hostCacheModel.groupId = getGroupId();

		hostCacheModel.companyId = getCompanyId();

		hostCacheModel.userId = getUserId();

		hostCacheModel.userName = getUserName();

		String userName = hostCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			hostCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			hostCacheModel.createDate = createDate.getTime();
		}
		else {
			hostCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			hostCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			hostCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return hostCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Host, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Host, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Host, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Host)this));
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
		Map<String, Function<Host, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Host, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Host, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Host)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final Function<InvocationHandler, Host>
		_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	private long _hostId;
	private long _originalHostId;
	private boolean _setOriginalHostId;
	private String _protocol;
	private String _streamer;
	private int _port;
	private String _serverRoot;
	private String _name;
	private int _defaultHost;
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
	private Host _escapedModel;

}