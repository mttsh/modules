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
 * The base model interface for the Producer service. Represents a row in the &quot;LG_Producer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.ProducerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.ProducerImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Producer
 * @see de.uhh.l2g.plugins.model.impl.ProducerImpl
 * @see de.uhh.l2g.plugins.model.impl.ProducerModelImpl
 * @generated
 */
@ProviderType
public interface ProducerModel extends BaseModel<Producer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a producer model instance should use the {@link Producer} interface instead.
	 */

	/**
	 * Returns the primary key of this producer.
	 *
	 * @return the primary key of this producer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this producer.
	 *
	 * @param primaryKey the primary key of this producer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the producer ID of this producer.
	 *
	 * @return the producer ID of this producer
	 */
	public long getProducerId();

	/**
	 * Sets the producer ID of this producer.
	 *
	 * @param producerId the producer ID of this producer
	 */
	public void setProducerId(long producerId);

	/**
	 * Returns the id num of this producer.
	 *
	 * @return the id num of this producer
	 */
	@AutoEscape
	public String getIdNum();

	/**
	 * Sets the id num of this producer.
	 *
	 * @param idNum the id num of this producer
	 */
	public void setIdNum(String idNum);

	/**
	 * Returns the home dir of this producer.
	 *
	 * @return the home dir of this producer
	 */
	@AutoEscape
	public String getHomeDir();

	/**
	 * Sets the home dir of this producer.
	 *
	 * @param homeDir the home dir of this producer
	 */
	public void setHomeDir(String homeDir);

	/**
	 * Returns the host ID of this producer.
	 *
	 * @return the host ID of this producer
	 */
	public long getHostId();

	/**
	 * Sets the host ID of this producer.
	 *
	 * @param hostId the host ID of this producer
	 */
	public void setHostId(long hostId);

	/**
	 * Returns the institution ID of this producer.
	 *
	 * @return the institution ID of this producer
	 */
	public long getInstitutionId();

	/**
	 * Sets the institution ID of this producer.
	 *
	 * @param institutionId the institution ID of this producer
	 */
	public void setInstitutionId(long institutionId);

	/**
	 * Returns the number of productions of this producer.
	 *
	 * @return the number of productions of this producer
	 */
	public long getNumberOfProductions();

	/**
	 * Sets the number of productions of this producer.
	 *
	 * @param numberOfProductions the number of productions of this producer
	 */
	public void setNumberOfProductions(long numberOfProductions);

	/**
	 * Returns the approved of this producer.
	 *
	 * @return the approved of this producer
	 */
	public int getApproved();

	/**
	 * Sets the approved of this producer.
	 *
	 * @param approved the approved of this producer
	 */
	public void setApproved(int approved);

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
	public int compareTo(de.uhh.l2g.plugins.model.Producer producer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Producer> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Producer toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Producer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}