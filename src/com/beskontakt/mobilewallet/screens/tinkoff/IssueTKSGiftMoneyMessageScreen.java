package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class IssueTKSGiftMoneyMessageScreen extends BaseScreen<Activity>{
	public static final String SCREENSHOT_MESSAGE = "Gift_money_message";
	public static final String BUTTON_OK_ID = "Ok";

	public IssueTKSGiftMoneyMessageScreen(Solo solo) {
		super(solo);
	}

    public IssueTKSOfferScreen clickButtonOk() {
		solo.sleep(1000);
		solo.takeScreenshot(SCREENSHOT_MESSAGE);
		solo.clickOnButton(BUTTON_OK_ID);		
		return new IssueTKSOfferScreen(solo);
	}

}
