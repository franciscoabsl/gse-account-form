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

package com.liferay.docs.amf.service;

import com.liferay.docs.amf.model.Account;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Account. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AccountServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AccountService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.docs.amf.service.impl.AccountServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the account remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AccountServiceUtil} if injection and service tracking are not available.
	 */
	public Account addAccount(
			long groupId, String firstName, String lastName,
			String emailAddress, String _userName, String gender, Date birthday,
			String password1, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String securityAnswer, boolean termsOfUse,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Account updateAccount(
			long accountId, String firstName, String lastName,
			String emailAddress, String _userName, String gender, Date birthday,
			String password1, String confirmPassword, String homePhone,
			String mobilePhone, String address1, String address2, String city,
			String state, String zipCode, String securityQuestion,
			String securityAnswer)
		throws PortalException;

}