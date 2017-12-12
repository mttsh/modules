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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import de.uhh.l2g.plugins.model.Sys;
import de.uhh.l2g.plugins.model.SysModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Sys service. Represents a row in the &quot;LG_Sys&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SysModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SysImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see SysImpl
 * @see Sys
 * @see SysModel
 * @generated
 */
@ProviderType
public class SysModelImpl extends BaseModelImpl<Sys> implements SysModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sys model instance should use the {@link Sys} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Sys";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sysId", Types.INTEGER },
			{ "version", Types.VARCHAR },
			{ "setupWizard", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sysId", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("version", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("setupWizard", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table LG_Sys (sysId INTEGER not null primary key,version VARCHAR(75) null,setupWizard INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table LG_Sys";
	public static final String ORDER_BY_JPQL = " ORDER BY sys.sysId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Sys.sysId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(de.uhh.l2g.plugins.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Sys"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(de.uhh.l2g.plugins.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Sys"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(de.uhh.l2g.plugins.service.util.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Sys"));

	public SysModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _sysId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSysId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sysId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Sys.class;
	}

	@Override
	public String getModelClassName() {
		return Sys.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sysId", getSysId());
		attributes.put("version", getVersion());
		attributes.put("setupWizard", getSetupWizard());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer sysId = (Integer)attributes.get("sysId");

		if (sysId != null) {
			setSysId(sysId);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Integer setupWizard = (Integer)attributes.get("setupWizard");

		if (setupWizard != null) {
			setSetupWizard(setupWizard);
		}
	}

	@Override
	public int getSysId() {
		return _sysId;
	}

	@Override
	public void setSysId(int sysId) {
		_sysId = sysId;
	}

	@Override
	public String getVersion() {
		if (_version == null) {
			return StringPool.BLANK;
		}
		else {
			return _version;
		}
	}

	@Override
	public void setVersion(String version) {
		_version = version;
	}

	@Override
	public int getSetupWizard() {
		return _setupWizard;
	}

	@Override
	public void setSetupWizard(int setupWizard) {
		_setupWizard = setupWizard;
	}

	@Override
	public Sys toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Sys)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SysImpl sysImpl = new SysImpl();

		sysImpl.setSysId(getSysId());
		sysImpl.setVersion(getVersion());
		sysImpl.setSetupWizard(getSetupWizard());

		sysImpl.resetOriginalValues();

		return sysImpl;
	}

	@Override
	public int compareTo(Sys sys) {
		int primaryKey = sys.getPrimaryKey();

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

		if (!(obj instanceof Sys)) {
			return false;
		}

		Sys sys = (Sys)obj;

		int primaryKey = sys.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
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
	}

	@Override
	public CacheModel<Sys> toCacheModel() {
		SysCacheModel sysCacheModel = new SysCacheModel();

		sysCacheModel.sysId = getSysId();

		sysCacheModel.version = getVersion();

		String version = sysCacheModel.version;

		if ((version != null) && (version.length() == 0)) {
			sysCacheModel.version = null;
		}

		sysCacheModel.setupWizard = getSetupWizard();

		return sysCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{sysId=");
		sb.append(getSysId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", setupWizard=");
		sb.append(getSetupWizard());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Sys");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sysId</column-name><column-value><![CDATA[");
		sb.append(getSysId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>setupWizard</column-name><column-value><![CDATA[");
		sb.append(getSetupWizard());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Sys.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Sys.class
		};
	private int _sysId;
	private String _version;
	private int _setupWizard;
	private Sys _escapedModel;
}