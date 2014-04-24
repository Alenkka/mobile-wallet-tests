package com.beskontakt.mobilewallet.steps.settings.fill;

import com.beskontakt.mobilewallet.screens.settings.ChangePasswordScreen;
import com.robotium.solo.Solo;

public class FillChangePasswordForm {
	
	public FillChangePasswordForm (Solo solo) {
		
	}
	
	public void fillChangePasswordForm(ChangePasswordScreen changePasswordScreen, String currentPassword, String keyword,
			String newPassword) {
		changePasswordScreen.setCurrentPassword(currentPassword);
		changePasswordScreen.setKeyword(keyword);
		changePasswordScreen.setNewPassword(newPassword);
		changePasswordScreen.setNewPasswordRepeat(newPassword);
		changePasswordScreen.clickSaveButton();
	}

}
