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

import java.util.List;

/**
 * Provides the remote service utility for Account. This utility wraps
 * <code>com.liferay.docs.amf.service.impl.AccountServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AccountService
 * @generated
 */
public class AccountServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.docs.amf.service.impl.AccountServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Account addAccount(
			long groupId, String firstName, String lastName,
			String emailAddress, String _userName, String gender,
			java.util.Date birthday, String password1, String confirmPassword,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			String securityQuestion, String securityAnswer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws java.text.ParseException, PortalException {

		return getService().addAccount(
			groupId, firstName, lastName, emailAddress, _userName, gender,
			birthday, password1, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion,
			securityAnswer, termsOfUse, serviceContext);
	}

	public static Account deleteAccountById(long accountId)
		throws com.liferay.docs.amf.exception.NoSuchAccountException {

		return getService().deleteAccountById(accountId);
	}

	public static Account getAccountById(long accountId)
		throws com.liferay.docs.amf.exception.NoSuchAccountException {

		return getService().getAccountById(accountId);
	}

	public static List<Account> getAccountsByGroupId(long groupId) {
		return getService().getAccountsByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Account updateAccount(
			long accountId, String firstName, String lastName,
			String emailAddress, String _userName, String gender,
			java.util.Date birthday, String password1, String confirmPassword,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			String securityQuestion, String securityAnswer)
		throws PortalException {

		return getService().updateAccount(
			accountId, firstName, lastName, emailAddress, _userName, gender,
			birthday, password1, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion,
			securityAnswer);
	}

	public static AccountService getService() {
		return _service;
	}

	private static volatile AccountService _service;

}