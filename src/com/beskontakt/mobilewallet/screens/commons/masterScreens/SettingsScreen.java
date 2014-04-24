package com.beskontakt.mobilewallet.screens.commons.masterScreens;

import com.beskontakt.mobilewallet.screens.settings.ChangeKeywordScreen;
import com.beskontakt.mobilewallet.screens.settings.ChangePasswordScreen;
import com.robotium.solo.Solo;

import android.app.Activity;

public class SettingsScreen extends BaseScreen<Activity>{

	private String changePasswordButton_id = "button_4_1_change_password";
	private String changeKeywordButton_id = "button_4_1_change_control_questions";
	
	public SettingsScreen(Solo solo) {
		super(solo);
	}
	
	public ChangePasswordScreen tapOnChangePassword(){
		clickButton(changePasswordButton_id);
		return new ChangePasswordScreen(solo);
	}

	public ChangeKeywordScreen tapOnChangeKeyword(){
		clickButton(changeKeywordButton_id);
		return new ChangeKeywordScreen(solo);
	}
}
