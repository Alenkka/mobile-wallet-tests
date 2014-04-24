package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.registration.RegistrationFirstScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSOfferScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


public class CheckOfferTinkoffScreen extends BaseStep{
    private Solo solo;

    public CheckOfferTinkoffScreen(Solo solo) {
      this.solo = solo;
    }

    public RegistrationFirstScreen checkScreenParametersAndClickButtonIssue(IssueTKSOfferScreen offer) throws Exception {
        checkOfferHeader("Tinkoff Mobile", "txt_header_title");
        checkButtonIssue("Выпустить карту", "button1");
	    offer.clickButtonIssue(offer);
		return new RegistrationFirstScreen(solo) ;
	}

    public void checkOfferHeader(String text, String id)throws Exception {
       checkText(text, id, solo);
    }

    public void checkButtonIssue(String text, String id) throws Exception {
       checkText(text, id, solo);
    }


}
