/**
 * 
 */
package com.swsw.codereviewerandroid.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.swsw.codereviewerandroid.R;

/**
 * @author VinsonCai
 *
 */
public class LoginActivity extends Activity {

	private Button mLoginButton;
	private EditText mUserNameEditText;
	private EditText mPasswordEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.login);
		initViews();
	}

	private void initViews() {
		mLoginButton = (Button) findViewById(R.id.login_go_button);
		mLoginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				doLogin();
			}
		});

		mUserNameEditText = (EditText) findViewById(R.id.login_user_name_editText);

		mPasswordEditText = (EditText) findViewById(R.id.login_pwd_editText);
	}

	private void doLogin() {
		String userName = mUserNameEditText.getText().toString();
		String pwd = mPasswordEditText.getText().toString();
		if (isValid(userName, pwd)) {

		}
	}

	private boolean isValid(String userName, String pwd) {

		return true;
	}
}
