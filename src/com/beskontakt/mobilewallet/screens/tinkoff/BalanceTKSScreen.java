package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

public class BalanceTKSScreen extends BaseScreen<Activity>{

	public BalanceTKSScreen(Solo solo) {
		super(solo);
	}

	public void clickButtonRefresh(String id) {
		clickButton(id);
	}

}
