/**
 * 
 */
package com.swsw.codereviewerandroid.db;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * @author VinsonCai
 *
 */
public class DbHelper extends SQLiteAssetHelper {

	private static final String DB_NAME = "code_review.db";
	private static final int DATABASE_VERSION = 1;
	private static DbHelper sInstance;

	private static Context sContext;


	public DbHelper(Context context) {
		super(context, DB_NAME, null, DATABASE_VERSION);
		sContext = context;
		sInstance = this;

	}

	public static DbHelper getInstance() {
		return sInstance;
	}
}
