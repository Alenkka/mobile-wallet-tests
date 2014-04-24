package com.beskontakt.mobilewallet.steps.common.wait;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.AnimationFirstRunScreen;
import com.robotium.solo.Solo;


public class WaitFirstRunAnimation {
	
	private Solo solo;
	
	public WaitFirstRunAnimation(Solo solo){
		this.solo = solo;
	}

    public void waitForFirstRunAnimation() {
		AnimationFirstRunScreen animation = new AnimationFirstRunScreen(solo);
		animation.waitForAnimation();
	}

    public void waitForWalletOpen() {
        AnimationFirstRunScreen animation = new AnimationFirstRunScreen(solo);
        animation.waitForWalletOpen();
    }

}
