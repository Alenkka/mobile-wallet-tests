package com.beskontakt.mobilewallet.screens.commons.masterScreens;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.registration.RegistrationFirstScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSGiftMoneyMessageScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSOfferScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSProgressScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSScreensEnum;
import com.robotium.solo.Solo;

import static com.beskontakt.mobilewallet.helper.PhoneModelHelper.SETTINGS_COORDINATION_X_PHILIPS_SMALL;
import static com.beskontakt.mobilewallet.helper.PhoneModelHelper.SETTINGS_COORDINATION_Y_PHILIPS_SMALL;


public class MainAppScreen extends BaseScreen<Activity> {
    public static final int CARD_COORDINATION_X = 172;
    public static final int CARD_COORDINATION_Y = 314;

    public MainAppScreen(Solo solo) {
        super(solo);
    }

    public IssueTKSGiftMoneyMessageScreen clickOnTheCardWithGiftMoney() {
        solo.clickOnScreen(CARD_COORDINATION_X, CARD_COORDINATION_Y);
        return new IssueTKSGiftMoneyMessageScreen(solo);
    }

    public IssueTKSOfferScreen clickOnTheCard() {
        solo.clickOnScreen(CARD_COORDINATION_X,CARD_COORDINATION_Y);
        return new IssueTKSOfferScreen(solo);
    }

   /* using this method you may get one of three screens:
    * - IssueTKSFirstScreen - if set screenToCreate.IssueFirstScreen as parameter
    * - IssueProgressScreen - if set screenToCreate.IssueProgressScreen as parameter
    * - IssueTKSOfferScreen - if set screenToCreate.OfferScreen as parameter
    * by clicking on TKS Card*/
    public BaseScreen<Activity> clickTKSCard(IssueTKSScreensEnum screenToCreate) {
        if (screenToCreate == null){
            System.out.println("which screen to create?");
            }
        solo.clickOnScreen(CARD_COORDINATION_X,CARD_COORDINATION_Y);
        BaseScreen<Activity> screen = new BaseScreen(solo);
        switch (screenToCreate){
            case IssueFirstScreen:
           screen = new IssueTKSProgressScreen(solo);
                break;
            case IssueProgressScreen:
           screen = new RegistrationFirstScreen(solo);
                break;
            case OfferScreen:
           screen = new IssueTKSOfferScreen(solo);
                break;
        }
        return screen;
    }

    
	public SettingsScreen clickOnSettingsButton() {
		solo.clickOnScreen(SETTINGS_COORDINATION_X_PHILIPS_SMALL, SETTINGS_COORDINATION_Y_PHILIPS_SMALL);
		return new SettingsScreen(solo);
	}


}
