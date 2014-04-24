package com.beskontakt.mobilewallet.screens.commons.popupScreens;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class AlertTwoButtonPopupScreen extends BaseScreen<Activity> {

	public AlertTwoButtonPopupScreen(Solo solo) {
		super(solo);
	}

    private String allertUpMessageButtonOneId = "button_alert_one";
    private String allertUpMessageButtonTwoId = "button_alert_two";
    private String allertUpMessageTextId = "txt_alert_message";


    public void clickButtonOne() {
        clickButton(allertUpMessageButtonOneId);
    }

    public void clickButtonTwo() {
        clickButton(allertUpMessageButtonTwoId);
    }

    public String getMessageText() {
        return getText(allertUpMessageTextId);
    }

}



