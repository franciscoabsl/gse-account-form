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
import com.liferay.docs.amf.exception.*;
import com.liferay.docs.amf.model.Account;
import com.liferay.docs.amf.service.base.AccountLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
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

	@Override
	public Account addAccount(long groupId, String firstName, String lastName, String emailAddress, String _userName,
							  String gender, Date birthday, String password1, String confirmPassword, String homePhone,
							  String mobilePhone, String address1, String address2, String city, String state, String zipCode,
							  String securityQuestion, String securityAnswer, boolean termsOfUse, ServiceContext serviceContext
								) throws PortalException {

		validation(firstName, lastName, emailAddress, _userName, gender, birthday, password1, confirmPassword, homePhone,
				mobilePhone, address1, address2, city, state, zipCode, securityQuestion, securityAnswer, termsOfUse);


		// Get group and user
		Group group = _groupLocalService.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);

		// Generate primary key
		long accountId = counterLocalService.increment(Account.class.getName());

		// Create account
		Account account = createAccount(accountId);

		// Populate fields
		account.setGroupId(groupId);
		account.setCompanyId(group.getCompanyId());
		account.setUserName(user.getScreenName());
		account.setUserId(userId);
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

	@Override
	public void validation(String firstName, String lastName, String emailAddress, String _userName,
						   String gender, Date birthday, String password1, String confirmPassword, String homePhone,
						   String mobilePhone, String address1, String address2, String city, String state, String zipCode,
						   String securityQuestion, String securityAnswer, boolean termsOfUse) throws PortalException {

		// Required Fields validation
		if(Validator.isNull(firstName)) {
			throw new FirstNameException("First name field is required.");
		}
		if(Validator.isNull(lastName)) {
			throw new LastNameException("Last name field is required.");
		}
		if(Validator.isNull(emailAddress)) {
			throw new EmailException("Email field is required.");
		}
		if(Validator.isNull(_userName)) {
			throw new UserNameException("Username field is required.");
		}
		if(Validator.isNull(gender)) {
			throw new GenderException("Gender field is required.");
		}
		if(Validator.isNull(birthday)) {
			throw new BirthdayException("Birthday field is required.");
		}
		if(Validator.isNull(password1)) {
			throw new PasswordException("Password field is required.");
		}
		if(Validator.isNull(confirmPassword)) {
			throw new ConfirmPasswordException("Confirm Password field is required.");
		}
		if(Validator.isNull(address1)) {
			throw new AddressException("Address field is required.");
		}
		if(Validator.isNull(city)) {
			throw new CityException("City field is required.");
		}
		if(Validator.isNull(state)) {
			throw new StateException("State field is required.");
		}
		if(Validator.isNull(zipCode)) {
			throw new ZipCodeException("Zip Code field is required.");
		}
		if(Validator.isNull(securityQuestion)) {
			throw new SecurityQuestionException("Security Question field is required.");
		}
		if(Validator.isNull(securityAnswer)) {
			throw new SecurityAnswerException("Security Answer field is required.");
		}

		// Field Length Validation
		if(firstName.length() > 50) {
			throw new FirstNameException("First name field must have a maximum of 50 characters.");
		}
		if(lastName.length() > 50) {
			throw new LastNameException("Last name field must have a maximum of 50 characters.");
		}
		if(emailAddress.length() > 255) {
			throw new EmailException("Email field must have a maximum of 255 characters.");
		}
		if(_userName.length() > 16 || _userName.length() < 4 ) {
			throw new UserNameException("Username must have between 4 and 16 characters.");
		}
		if(password1.length() < 6) {
			throw new PasswordException("Password field must have at least 6 characters.");
		}
		if(!Validator.isNull(homePhone) && homePhone.length() != 10) {
			throw new HomePhoneException("Home Phone field must have 10 digits.");
		}
		if(!Validator.isNull(mobilePhone) && mobilePhone.length() != 10) {
			throw new HomePhoneException("Mobile Phone field must have 10 digits.");
		}
		if(zipCode.length() != 5) {
			throw new ZipCodeException("Zip Code field must have 5 digits.");
		}

		// Field Format Validation
		if(!Validator.isAlphanumericName(firstName)) {
			throw new FirstNameException("First name field must have only alphanumeric characters.");
		}
		if(!Validator.isAlphanumericName(lastName)) {
			throw new LastNameException("Last name field must have only alphanumeric characters.");
		}
		if(!Validator.isEmailAddress(emailAddress)) {
			throw new EmailException("Email field not valid.");
		}
		if(!Validator.isAlphanumericName(_userName)) {
			throw new UserNameException("Username field must have only alphanumeric characters.");
		}
		if(!Validator.isNull(homePhone) && !Validator.isDigit(homePhone)) {
			throw new HomePhoneException("Home Phone field must have only digits.");
		}
		if(!Validator.isNull(mobilePhone) && !Validator.isDigit(mobilePhone)) {
			throw new MobilePhoneException("Mobile Phone field must have only digits.");
		}
		if(!Validator.isAlphanumericName(address1)) {
			throw new AddressException("Address field must have only alphanumeric characters.");
		}
		if(!Validator.isNull(address2) && !Validator.isAlphanumericName(address2)) {
			throw new AddressException("Address field must have only alphanumeric characters.");
		}
		if(!Validator.isAlphanumericName(city)) {
			throw new CityException("City field must have only alphanumeric characters.");
		}
		if(!Validator.isDigit(zipCode)) {
			throw new ZipCodeException("Zip Code field must have only digits.");
		}

		// Other Validations
		//TODO - password (must contain one uppercase, one number, one special character)
		//TODO - birthday (must be at least 13 to register)
		//TODO - state (must use Liferay's State code)

		if(!password1.equals(confirmPassword)) {
			throw new PasswordException("Passwords must match.");
		}
		if(!termsOfUse) {
			throw new TermsOfUseException("You must accept the Terms of Use.");
		}

	}

	@Reference
	GroupLocalService _groupLocalService;
}