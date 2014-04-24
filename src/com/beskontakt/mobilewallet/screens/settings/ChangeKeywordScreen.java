package com.beskontakt.mobilewallet.screens.settings;

import android.app.Activity;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class ChangeKeywordScreen extends BaseScreen<Activity>{

	private String currentKeyword_id = "edit_4_2_current_keyword";
	private String forgetPasswordButton_id = "lable_forget_password";
	private String[] currentPassword_id = {"0", "1", "2", "3"};
	private String newKeyword_id = "edit_4_2_new_keyword";
	private String saveButton_id = "button_continue";
	
	public ChangeKeywordScreen(Solo solo) {
		super(solo);
	}
	
	public void setCurrentKeyword(String text) {
		setStringField(text, currentKeyword_id);
	}

	public RecoveryKeywordScreen clickForgetPasswordButton (){
		clickButton(forgetPasswordButton_id);
		return new RecoveryKeywordScreen(solo);
	}
	
	public void setCurrentPassword(String text) {
		setStringField(text, currentPassword_id[0]);
		setStringField(text, currentPassword_id[1]);
		setStringField(text, currentPassword_id[2]);
		setStringField(text, currentPassword_id[3]);
	}
	
	public void setNewKeyword(String text) {
		setStringField(text, newKeyword_id);
	}
	
	public ChangePasswordProgressScreen clickSaveButton (){
		clickButton(saveButton_id);
		return new ChangePasswordProgressScreen(solo);
	}

}
