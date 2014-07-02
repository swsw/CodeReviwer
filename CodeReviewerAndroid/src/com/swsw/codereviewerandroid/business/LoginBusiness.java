/**
 * 
 */
package com.swsw.codereviewerandroid.business;

import com.swsw.codereviewerandroid.dao.UserDao;
import com.swsw.codereviewerandroid.events.LoginEvent;
import com.swsw.codereviewerandroid.events.LoginEvent.ErrorType;
import com.swsw.codereviewerandroid.models.TUser;

import de.greenrobot.event.EventBus;


/**
 * @author VinsonCai
 *
 */
public class LoginBusiness {

	public LoginBusiness() {
	}

	public void doLogin(String userName, String pwd) {
		UserDao userDao = new UserDao();
		TUser user = userDao.getUser(userName, pwd);
		if (null != user) {

		} else {
			LoginEvent event = new LoginEvent();
			event.mReturnCode = -1;
			event.mErrorType = ErrorType.USERNAME_NOT_FOUND;
			EventBus.getDefault().post(event);
		}
	}

}
