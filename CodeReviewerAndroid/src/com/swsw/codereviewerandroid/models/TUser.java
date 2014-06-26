/**
 * 
 */
package com.swsw.codereviewerandroid.models;


/**
 * @author VinsonCai
 *
 */
public class TUser {
	public int _id;
	public String mUserName;
	public String mPwd;

	public static final String TABLE = "t_user";
	public static final String FIELD_ID = "_id";
	public static final String FIELD_USER_NAME = "user_name";
	public static final String FIELD_PWD = "user_pwd";

	public static final String[] PROJECTIONS = new String[] { FIELD_ID,
			FIELD_USER_NAME, FIELD_PWD };
}
