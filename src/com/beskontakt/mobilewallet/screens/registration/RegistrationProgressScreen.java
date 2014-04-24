package com.beskontakt.mobilewallet.screens.registration;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class RegistrationProgressScreen extends BaseScreen<Activity> {
	public static final String PROGRESS_SCREEN = "Progress";

	public static final int WAITING_TIME = 300000;
	public static final int COUNT_OF_MATCHES =0;

	
	public RegistrationProgressScreen(Solo solo) {
		super(solo);
	}

    public void waitForStatus(String status){
		  waitForMessage(status);
		  solo.takeScreenshot(PROGRESS_SCREEN);
	}

	public void waitForSuccess(String message){
          waitForMessage(message,COUNT_OF_MATCHES, WAITING_TIME);
    }

}
