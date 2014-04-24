package com.beskontakt.mobilewallet.screens.registration;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class RegistrationThirdScreen extends BaseScreen<Activity> {

    private String emailID = "edit_3_5_email";
    private String phoneCode = "edit_phone_code";
    private String phoneNumber = "edit_phone_number";

	public RegistrationThirdScreen(Solo solo) {
		super(solo);
	}

    public void setEmail(String text){
		setStringField(text, emailID);
	}
	
	public void setPhoneCode(String text){
		setStringField(text, phoneCode);
	}
	
	public void setPhoneNumber(String text){
		setStringField(text, phoneNumber);
	}
	

	public RegistrationProgressScreen clickButtonNext(String id) {
		clickButton(id);		
		return new RegistrationProgressScreen(solo) ;
	}

}
