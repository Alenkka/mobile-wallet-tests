package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationFirstScreen;
import com.robotium.solo.Solo;

public class IssueTKSUserAgreementScreen extends BaseScreen<Activity> {

	public IssueTKSUserAgreementScreen(Solo solo) {
		super(solo);
	}

    private String buttonAgree = "button_continue";
	
	public RegistrationFirstScreen clickButtonAgree(){
		clickButton(buttonAgree);
		return new RegistrationFirstScreen(solo);
	}

}
