package com.beskontakt.mobilewallet.screens.commons.masterScreens;

import android.app.Activity;
import com.robotium.solo.Solo;


public class AnimationFirstRunScreen extends BaseScreen<Activity> {
	public static final int WAIT_FOR_OPEN = 20000;
	public static final int WAIT_FOR_SECOND_ANIMATION = 20000;

	public AnimationFirstRunScreen(Solo solo){
		super(solo);
	}

	public void waitForWalletOpen() {
		solo.sleep(WAIT_FOR_OPEN);
	}

	public void waitForAnimation() {
		solo.sleep(WAIT_FOR_SECOND_ANIMATION);
	}

}
