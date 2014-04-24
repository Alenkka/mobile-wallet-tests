package com.beskontakt.mobilewallet.screens.tinkoff;


import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;
import android.app.Activity;

public class MenuTKSScreen extends BaseScreen<Activity> {

	public MenuTKSScreen(Solo solo) {
		super(solo);
	}
	
	public BalanceTKSScreen clickButtonBalance(String id) {
		clickButton(id);
		return new BalanceTKSScreen(solo);
	}
	
	public SecretWordScreen clickButtonRequisites(String id) {
		clickButton(id);
		return new SecretWordScreen(solo);
	}
	
	
}
