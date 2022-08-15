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

package com.liferay.docs.amf.model.impl;

import com.liferay.docs.amf.model.Account;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Account in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccountCacheModel implements CacheModel<Account>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccountCacheModel)) {
			return false;
		}

		AccountCacheModel accountCacheModel = (AccountCacheModel)object;

		if (accountId == accountCacheModel.accountId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accountId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accountId=");
		sb.append(accountId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", _userName=");
		sb.append(_userName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", password1=");
		sb.append(password1);
		sb.append(", confirmPassword=");
		sb.append(confirmPassword);
		sb.append(", homePhone=");
		sb.append(homePhone);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append(", securityQuestion=");
		sb.append(securityQuestion);
		sb.append(", securityAnswer=");
		sb.append(securityAnswer);
		sb.append(", termsOfUse=");
		sb.append(termsOfUse);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Account toEntityModel() {
		AccountImpl accountImpl = new AccountImpl();

		if (uuid == null) {
			accountImpl.setUuid("");
		}
		else {
			accountImpl.setUuid(uuid);
		}

		accountImpl.setAccountId(accountId);
		accountImpl.setGroupId(groupId);
		accountImpl.setCompanyId(companyId);
		accountImpl.setUserId(userId);

		if (userName == null) {
			accountImpl.setUserName("");
		}
		else {
			accountImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accountImpl.setCreateDate(null);
		}
		else {
			accountImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accountImpl.setModifiedDate(null);
		}
		else {
			accountImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			accountImpl.setFirstName("");
		}
		else {
			accountImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			accountImpl.setLastName("");
		}
		else {
			accountImpl.setLastName(lastName);
		}

		if (emailAddress == null) {
			accountImpl.setEmailAddress("");
		}
		else {
			accountImpl.setEmailAddress(emailAddress);
		}

		if (_userName == null) {
			accountImpl.set_userName("");
		}
		else {
			accountImpl.set_userName(_userName);
		}

		if (gender == null) {
			accountImpl.setGender("");
		}
		else {
			accountImpl.setGender(gender);
		}

		if (birthday == Long.MIN_VALUE) {
			accountImpl.setBirthday(null);
		}
		else {
			accountImpl.setBirthday(new Date(birthday));
		}

		if (password1 == null) {
			accountImpl.setPassword1("");
		}
		else {
			accountImpl.setPassword1(password1);
		}

		if (confirmPassword == null) {
			accountImpl.setConfirmPassword("");
		}
		else {
			accountImpl.setConfirmPassword(confirmPassword);
		}

		if (homePhone == null) {
			accountImpl.setHomePhone("");
		}
		else {
			accountImpl.setHomePhone(homePhone);
		}

		if (mobilePhone == null) {
			accountImpl.setMobilePhone("");
		}
		else {
			accountImpl.setMobilePhone(mobilePhone);
		}

		if (address1 == null) {
			accountImpl.setAddress1("");
		}
		else {
			accountImpl.setAddress1(address1);
		}

		if (address2 == null) {
			accountImpl.setAddress2("");
		}
		else {
			accountImpl.setAddress2(address2);
		}

		if (city == null) {
			accountImpl.setCity("");
		}
		else {
			accountImpl.setCity(city);
		}

		if (state == null) {
			accountImpl.setState("");
		}
		else {
			accountImpl.setState(state);
		}

		if (zipCode == null) {
			accountImpl.setZipCode("");
		}
		else {
			accountImpl.setZipCode(zipCode);
		}

		if (securityQuestion == null) {
			accountImpl.setSecurityQuestion("");
		}
		else {
			accountImpl.setSecurityQuestion(securityQuestion);
		}

		if (securityAnswer == null) {
			accountImpl.setSecurityAnswer("");
		}
		else {
			accountImpl.setSecurityAnswer(securityAnswer);
		}

		accountImpl.setTermsOfUse(termsOfUse);

		accountImpl.resetOriginalValues();

		return accountImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accountId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		_userName = objectInput.readUTF();
		gender = objectInput.readUTF();
		birthday = objectInput.readLong();
		password1 = objectInput.readUTF();
		confirmPassword = objectInput.readUTF();
		homePhone = objectInput.readUTF();
		mobilePhone = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zipCode = objectInput.readUTF();
		securityQuestion = objectInput.readUTF();
		securityAnswer = objectInput.readUTF();

		termsOfUse = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accountId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (_userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_userName);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(birthday);

		if (password1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password1);
		}

		if (confirmPassword == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(confirmPassword);
		}

		if (homePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homePhone);
		}

		if (mobilePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobilePhone);
		}

		if (address1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}

		if (securityQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityQuestion);
		}

		if (securityAnswer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityAnswer);
		}

		objectOutput.writeBoolean(termsOfUse);
	}

	public String uuid;
	public long accountId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String emailAddress;
	public String _userName;
	public String gender;
	public long birthday;
	public String password1;
	public String confirmPassword;
	public String homePhone;
	public String mobilePhone;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zipCode;
	public String securityQuestion;
	public String securityAnswer;
	public boolean termsOfUse;

}