package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class SecretWordScreen extends BaseScreen<Activity>{

	public SecretWordScreen(Solo solo) {
		super(solo);
		// TODO Auto-generated constructor stub
	}
	
	public RequisitesTKSScreen clickButtonNext(String id) {
		clickButton(id);
		return new RequisitesTKSScreen(solo);
	}

	public void setSecretWord(String text, String id) {
		setStringField(text, id);
		
	}

}
