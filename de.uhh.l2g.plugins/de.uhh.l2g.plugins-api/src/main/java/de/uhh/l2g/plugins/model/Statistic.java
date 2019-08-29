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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Statistic service. Represents a row in the &quot;LG_Statistic&quot; database table, with each column mapped to a property of this class.
 *
 * @author Iavor Sturm
 * @see StatisticModel
 * @generated
 */
@ImplementationClassName("de.uhh.l2g.plugins.model.impl.StatisticImpl")
@ProviderType
public interface Statistic extends PersistedModel, StatisticModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>de.uhh.l2g.plugins.model.impl.StatisticImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Statistic, Long> STATISTIC_ID_ACCESSOR =
		new Accessor<Statistic, Long>() {

			@Override
			public Long get(Statistic statistic) {
				return statistic.getStatisticId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Statistic> getTypeClass() {
				return Statistic.class;
			}

		};

}