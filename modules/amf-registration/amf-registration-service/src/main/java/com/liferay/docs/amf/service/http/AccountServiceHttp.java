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

package com.liferay.docs.amf.service.http;

import com.liferay.docs.amf.service.AccountServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>AccountServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccountServiceHttp {

	public static com.liferay.docs.amf.model.Account addAccount(
			HttpPrincipal httpPrincipal, long groupId, String firstName,
			String lastName, String emailAddress, String _userName,
			String gender, java.util.Date birthday, String password1,
			String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, String securityQuestion, String securityAnswer,
			boolean termsOfUse,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AccountServiceUtil.class, "addAccount",
				_addAccountParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, firstName, lastName, emailAddress,
				_userName, gender, birthday, password1, confirmPassword,
				homePhone, mobilePhone, address1, address2, city, state,
				zipCode, securityQuestion, securityAnswer, termsOfUse,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.docs.amf.model.Account)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.docs.amf.model.Account updateAccount(
			HttpPrincipal httpPrincipal, long accountId, String firstName,
			String lastName, String emailAddress, String _userName,
			String gender, java.util.Date birthday, String password1,
			String confirmPassword, String homePhone, String mobilePhone,
			String address1, String address2, String city, String state,
			String zipCode, String securityQuestion, String securityAnswer)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AccountServiceUtil.class, "updateAccount",
				_updateAccountParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, accountId, firstName, lastName, emailAddress,
				_userName, gender, birthday, password1, confirmPassword,
				homePhone, mobilePhone, address1, address2, city, state,
				zipCode, securityQuestion, securityAnswer);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.docs.amf.model.Account)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.docs.amf.model.Account>
		getAccountsByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				AccountServiceUtil.class, "getAccountsByGroupId",
				_getAccountsByGroupIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.docs.amf.model.Account>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.docs.amf.model.Account getAccountById(
			HttpPrincipal httpPrincipal, long accountId)
		throws com.liferay.docs.amf.exception.NoSuchAccountException {

		try {
			MethodKey methodKey = new MethodKey(
				AccountServiceUtil.class, "getAccountById",
				_getAccountByIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, accountId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.docs.amf.exception.NoSuchAccountException) {

					throw (com.liferay.docs.amf.exception.
						NoSuchAccountException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.docs.amf.model.Account)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.docs.amf.model.Account deleteAccountById(
			HttpPrincipal httpPrincipal, long accountId)
		throws com.liferay.docs.amf.exception.NoSuchAccountException {

		try {
			MethodKey methodKey = new MethodKey(
				AccountServiceUtil.class, "deleteAccountById",
				_deleteAccountByIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, accountId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.docs.amf.exception.NoSuchAccountException) {

					throw (com.liferay.docs.amf.exception.
						NoSuchAccountException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.docs.amf.model.Account)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AccountServiceHttp.class);

	private static final Class<?>[] _addAccountParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, java.util.Date.class, String.class, String.class,
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class, String.class, boolean.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateAccountParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			String.class, java.util.Date.class, String.class, String.class,
			String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class
		};
	private static final Class<?>[] _getAccountsByGroupIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getAccountByIdParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _deleteAccountByIdParameterTypes4 =
		new Class[] {long.class};

}