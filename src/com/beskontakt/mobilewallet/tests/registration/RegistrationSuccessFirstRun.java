package com.beskontakt.mobilewallet.tests.registration;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.MainAppScreen;
import com.beskontakt.mobilewallet.screens.commons.popupScreens.AlertTwoButtonPopupScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationFirstScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationProgressScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationSecondScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationThirdScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSOfferScreen;
import com.beskontakt.mobilewallet.steps.common.wait.WaitFirstRunAnimation;
import com.beskontakt.mobilewallet.steps.registration.check.CheckProgressSteps;
import com.beskontakt.mobilewallet.steps.registration.check.CheckRegistrationForm;
import com.beskontakt.mobilewallet.steps.registration.fill.FillRegistrationForm;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckOfferTinkoffScreen;
import com.beskontakt.mobilewallet.tests.common.BaseTestCase;


public class RegistrationSuccessFirstRun extends BaseTestCase {
	public static final String BUTTON_NEXT = "button1";
	public static final String SUCCESS_MESSAGE = "Ваш «Кошелёк» зарегистрирован";


    public void testRegistrationSuccessFirstRun() throws Exception {
        WaitFirstRunAnimation animation = new WaitFirstRunAnimation(solo);
		animation.waitForWalletOpen();

        AlertTwoButtonPopupScreen newRegistration = new AlertTwoButtonPopupScreen(solo);
        newRegistration.clickButtonTwo();

        animation.waitForFirstRunAnimation();
		
		MainAppScreen mainScreen = new MainAppScreen(solo);
		//IssueTKSGiftMoneyMessageScreen giftMoney = mainScreen.clickOnTheCardWithGiftMoney();
		//IssueTKSOfferScreen offerTinkoff = giftMoney.clickButtonOk();
		IssueTKSOfferScreen offerTinkoff = mainScreen.clickOnTheCard();
		
		CheckOfferTinkoffScreen checkOffer = new CheckOfferTinkoffScreen(solo);
		RegistrationFirstScreen firstReg = checkOffer.checkScreenParametersAndClickButtonIssue(offerTinkoff);
		
		CheckRegistrationForm checkForm = new CheckRegistrationForm(solo);
		checkForm.checkFirstScreenParameters();
		FillRegistrationForm form = new FillRegistrationForm(solo);
		form.setFirstFormFields(firstReg);
		firstReg.setCheckBox();
				
		RegistrationSecondScreen secondReg = firstReg.clickButtonNext(BUTTON_NEXT);
		checkForm.checkSecondScreenParameters();
		form.setSecondFormFields(secondReg);
		
		RegistrationThirdScreen thirdReg = secondReg.clickButtonNext(BUTTON_NEXT);
        checkForm.checkThirdScreenParameters();
		form.setThirdFormFields(thirdReg);
		
		RegistrationProgressScreen progress = thirdReg.clickButtonNext(BUTTON_NEXT);
		CheckProgressSteps progressStep = new CheckProgressSteps(solo);
		progressStep.waitForSuccessAndCheckParameters(progress);
		
		AlertTwoButtonPopupScreen message = new AlertTwoButtonPopupScreen(solo);
        progress.waitForSuccess(SUCCESS_MESSAGE);
	    message.clickButtonOne();
        solo.goBack();
        solo.goBack();

      	}
	
}
