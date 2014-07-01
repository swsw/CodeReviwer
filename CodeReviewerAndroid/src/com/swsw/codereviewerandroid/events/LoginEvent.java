/**
 * 
 */
package com.swsw.codereviewerandroid.events;

/**
 * @author VinsonCai
 *
 */
public class LoginEvent {

	public boolean mIsFailed;

	public int mReturnCode;

	public ErrorType mErrorType;

	public enum ErrorType {
		PASSWORD_INCORRECT, USERNAME_NOT_FOUND
	}
}
