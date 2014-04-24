package com.beskontakt.mobilewallet.screens.settings;

import android.app.Activity;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class ChangePasswordScreen extends BaseScreen<Activity>{
	
	private String[] currentPassword_id = {"0", "1", "2", "3"};
	private String keywordField_id = "edit_4_2_keyword";
	private String[] newPassword_id = {"4", "5", "6", "7"};
	private String[] newPasswordRepeat_id = {"8", "9", "10", "11"};
	private String saveButton_id = "button_continue";
	
	public ChangePasswordScreen(Solo solo) {
		super(solo);
	}
	
	public void setCurrentPassword(String text) {
		setStringField(text, currentPassword_id[0]);
		setStringField(text, currentPassword_id[1]);
		setStringField(text, currentPassword_id[2]);
		setStringField(text, currentPassword_id[3]);
	}
	
	public void setKeyword(String text) {
		setStringField(text, keywordField_id);
	}
	
	public void setNewPassword(String text) {
		setStringField(text, newPassword_id[0]);
		setStringField(text, newPassword_id[1]);
		setStringField(text, newPassword_id[2]);
		setStringField(text, newPassword_id[3]);
	}
	
	public void setNewPasswordRepeat(String text) {
		setStringField(text, newPasswordRepeat_id[0]);
		setStringField(text, newPasswordRepeat_id[1]);
		setStringField(text, newPasswordRepeat_id[2]);
		setStringField(text, newPasswordRepeat_id[3]);
	}
	
	public ChangePasswordProgressScreen clickSaveButton (){
		clickButton(saveButton_id);
		return new ChangePasswordProgressScreen(solo);
	}
}
