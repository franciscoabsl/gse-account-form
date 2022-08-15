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

package com.liferay.docs.amf.service.impl;

import com.liferay.docs.amf.model.Account;
import com.liferay.docs.amf.service.base.AccountServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=amf",
		"json.web.service.context.path=Account"
	},
	service = AopService.class
)
public class AccountServiceImpl extends AccountServiceBaseImpl {
	@Override
	public Account addAccount(long groupId, String firstName, String lastName, String emailAddress, String _userName,
							  String gender, Date birthday, String password1, String confirmPassword, String homePhone,
							  String mobilePhone, String address1, String address2, String city, String state, String zipCode,
							  String securityQuestion, String securityAnswer, boolean termsOfUse, ServiceContext serviceContext
	) throws PortalException {
		return accountLocalService.addAccount(groupId, firstName, lastName, emailAddress, _userName,
				gender, birthday, password1, confirmPassword, homePhone,
				mobilePhone, address1, address2, city, state, zipCode,
				securityQuestion, securityAnswer, termsOfUse, serviceContext);
	}
	@Override
	public Account updateAccount(long accountId, String firstName, String lastName, String emailAddress, String _userName,
								 String gender, Date birthday, String password1, String confirmPassword, String homePhone,
								 String mobilePhone, String address1, String address2, String city, String state, String zipCode,
								 String securityQuestion, String securityAnswer) throws PortalException {

		return accountLocalService.updateAccount(accountId, firstName, lastName, emailAddress, _userName,
				gender, birthday, password1, confirmPassword, homePhone, mobilePhone, address1, address2, city, state,
				zipCode, securityQuestion, securityAnswer);
	}
}