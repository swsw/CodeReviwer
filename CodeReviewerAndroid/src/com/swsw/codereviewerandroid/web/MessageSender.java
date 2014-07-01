/**
 * 
 */
package com.swsw.codereviewerandroid.web;

/**
 * @author VinsonCai
 *
 */
public class MessageSender {

	private static MessageSender sInstance = new MessageSender();

	private MessageSender() {

	}

	public static MessageSender getInstance() {
		return sInstance;
	}

	public void sendMessage(String msg) {

	}
}
