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

import de.uhh.l2g.plugins.model.Video_Institution;
import de.uhh.l2g.plugins.service.Video_InstitutionLocalServiceUtil;

/**
 * The extended model base implementation for the Video_Institution service. Represents a row in the &quot;LG_Video_Institution&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Video_InstitutionImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Video_InstitutionImpl
 * @see Video_Institution
 * @generated
 */
@ProviderType
public abstract class Video_InstitutionBaseImpl
	extends Video_InstitutionModelImpl implements Video_Institution {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a video_ institution model instance should use the {@link Video_Institution} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Video_InstitutionLocalServiceUtil.addVideo_Institution(this);
		}
		else {
			Video_InstitutionLocalServiceUtil.updateVideo_Institution(this);
		}
	}
}