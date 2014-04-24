package com.beskontakt.mobilewallet.screens.registration;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class RegistrationSecondScreen extends BaseScreen<Activity> {
	public static final int PASSWORD_ID_0 = 0;
	public static final int PASSWORD_ID_1 = 1;
	public static final int PASSWORD_ID_2 = 2;
	public static final int PASSWORD_ID_3 = 3;
	public static final int PASSWORD_ID_4 = 4;
	public static final int PASSWORD_ID_5 = 5;
	public static final int PASSWORD_ID_6 = 6;
	public static final int PASSWORD_ID_7 = 7;


    private String secretWorld = "edit_3_5_mother_name";

	public RegistrationSecondScreen (Solo solo) {
        super(solo);
    }

    public void setPassword(String Pas1, String Pas2, String Pas3, String Pas4, String Pas5, String Pas6, String Pas7, String Pas8){
		solo.enterText(PASSWORD_ID_0, Pas1);
		solo.enterText(PASSWORD_ID_1, Pas2);
		solo.enterText(PASSWORD_ID_2, Pas3);
		solo.enterText(PASSWORD_ID_3, Pas4);
		solo.enterText(PASSWORD_ID_4, Pas5);
		solo.enterText(PASSWORD_ID_5, Pas6);
		solo.enterText(PASSWORD_ID_6, Pas7);
		solo.enterText(PASSWORD_ID_7, Pas8);
	}

	public void setSecretWorld(String text){
		setStringField(text, secretWorld);
	}

	public RegistrationThirdScreen clickButtonNext(String id) {
		clickButton(id);		
		return new RegistrationThirdScreen(solo) ;
	}

	
}
