/**
 * 
 */
package com.swsw.codereviewerandroid.web;

/**
 * @author VinsonCai
 *
 */
public class WebServiceManager {

	private static WebServiceManager sInstance = new WebServiceManager();

	private WebServiceManager() {

	}

	public static WebServiceManager getInstance() {
		return sInstance;
	}
}
