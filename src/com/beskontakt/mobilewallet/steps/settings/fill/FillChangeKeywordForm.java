package com.beskontakt.mobilewallet.steps.settings.fill;

import com.beskontakt.mobilewallet.screens.settings.ChangeKeywordScreen;
import com.robotium.solo.Solo;

public class FillChangeKeywordForm {
	
	public FillChangeKeywordForm (Solo solo) {
		
	}
	
	public void fillChangeKeywordForm(ChangeKeywordScreen changeKeywordScreen, String currentKeyword, 
			String currentPassword,String newKeyword) {
		changeKeywordScreen.setCurrentKeyword(currentKeyword);
		changeKeywordScreen.setCurrentPassword(currentPassword);
		changeKeywordScreen.setNewKeyword(newKeyword);
		changeKeywordScreen.clickSaveButton();
	}
}
