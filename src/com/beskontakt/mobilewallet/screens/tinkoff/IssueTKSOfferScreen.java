package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class IssueTKSOfferScreen extends BaseScreen<Activity> {

	public IssueTKSOfferScreen(Solo solo) {
		super(solo);
	}

    private String buttonIssue = "button1";

	public void clickButtonIssue(IssueTKSOfferScreen offer) {
        offer.clickButton(buttonIssue);
	}

	

}

