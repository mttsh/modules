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

import de.uhh.l2g.plugins.model.Institution_Host;
import de.uhh.l2g.plugins.service.Institution_HostLocalServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model base implementation for the Institution_Host service. Represents a row in the &quot;LG_Institution_Host&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Institution_HostImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Institution_HostImpl
 * @see Institution_Host
 * @generated
 */
@ProviderType
public abstract class Institution_HostBaseImpl
	extends Institution_HostModelImpl implements Institution_Host {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a institution_ host model instance should use the <code>Institution_Host</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Institution_HostLocalServiceUtil.addInstitution_Host(this);
		}
		else {
			Institution_HostLocalServiceUtil.updateInstitution_Host(this);
		}
	}

}