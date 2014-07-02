package com.swsw.codereviewerandroid.dao;

import android.database.Cursor;

import com.swsw.codereviewerandroid.db.DbHelper;
import com.swsw.codereviewerandroid.models.TUser;

/**
 * 
 * @author VinsonCai
 * 
 */
public class UserDao {

	public UserDao() {

	}

	public TUser getUser(String userName, String pwd) {

		String sql = "select * from " + TUser.TABLE + " where "
				+ TUser.FIELD_USER_NAME + "=? &&" + TUser.FIELD_PWD + "=?;";
		DbHelper dbHelper = DbHelper.getInstance();
		Cursor cursor = dbHelper.getReadableDatabase().rawQuery(sql,
				new String[] { userName, pwd });
		TUser user = null;
		if (null != cursor && cursor.moveToNext()) {
			user = new TUser();
			user._id = cursor.getInt(cursor.getColumnIndex(TUser.FIELD_ID));
			user.mUserName = cursor.getString(cursor
					.getColumnIndex(TUser.FIELD_USER_NAME));
			user.mPwd = cursor
					.getString(cursor.getColumnIndex(TUser.FIELD_PWD));
		}
		return user;
	}
}
