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

import com.liferay.chat.model.StatusModel;
import com.liferay.docs.amf.model.Account;
import com.liferay.docs.amf.service.base.AccountLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.docs.amf.model.Account",
	service = AopService.class
)
public class AccountLocalServiceImpl extends AccountLocalServiceBaseImpl {
	public Account addAccount(long groupId, String firstName, String lastName, String emailAddress, String _userName,
							  String gender, Date birthday, String password1, String confirmPassword, String homePhone,
							  String mobilePhone, String address1, String address2, String city, String state, String zipCode,
							  String securityQuestion, String securityAnswer, boolean termsOfUse, ServiceContext serviceContext
								) throws PortalException {

		// Get group and user
		Group group = _groupLocalService.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);

		// Generate primary key
		long accountId = counterLocalService.increment(Account.class.getName());

		// Create account
		Account account = createAccount(accountId);

		// Populate fields
		account.setCompanyId(group.getCompanyId());
		account.setUserName(user.getScreenName());
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setEmailAddress(emailAddress);
		account.set_userName(_userName);
		account.setGender(gender);
		account.setBirthday(birthday);
		account.setPassword1(password1);
		account.setConfirmPassword(confirmPassword);
		account.setHomePhone(homePhone);
		account.setMobilePhone(mobilePhone);
		account.setAddress1(address1);
		account.setAddress2(address2);
		account.setCity(city);
		account.setState(state);
		account.setZipCode(zipCode);
		account.setSecurityQuestion(securityQuestion);
		account.setSecurityAnswer(securityAnswer);
		account.setTermsOfUse(termsOfUse);

		return super.addAccount(account);
	}

	@Reference
	GroupLocalService _groupLocalService;
}