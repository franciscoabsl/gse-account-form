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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccountService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccountService
 * @generated
 */
public class AccountServiceWrapper
	implements AccountService, ServiceWrapper<AccountService> {

	public AccountServiceWrapper() {
		this(null);
	}

	public AccountServiceWrapper(AccountService accountService) {
		_accountService = accountService;
	}

	@Override
	public com.liferay.docs.amf.model.Account addAccount(
			long groupId, String firstName, String lastName,
			String emailAddress, String _userName, String gender,
			java.util.Date birthday, String password1, String confirmPassword,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			String securityQuestion, String securityAnswer, boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accountService.addAccount(
			groupId, firstName, lastName, emailAddress, _userName, gender,
			birthday, password1, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion,
			securityAnswer, termsOfUse, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accountService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.docs.amf.model.Account updateAccount(
			long accountId, String firstName, String lastName,
			String emailAddress, String _userName, String gender,
			java.util.Date birthday, String password1, String confirmPassword,
			String homePhone, String mobilePhone, String address1,
			String address2, String city, String state, String zipCode,
			String securityQuestion, String securityAnswer)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accountService.updateAccount(
			accountId, firstName, lastName, emailAddress, _userName, gender,
			birthday, password1, confirmPassword, homePhone, mobilePhone,
			address1, address2, city, state, zipCode, securityQuestion,
			securityAnswer);
	}

	@Override
	public AccountService getWrappedService() {
		return _accountService;
	}

	@Override
	public void setWrappedService(AccountService accountService) {
		_accountService = accountService;
	}

	private AccountService _accountService;

}