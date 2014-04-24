package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSFirstScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSSecondScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


/**
 * Created by e.perevaryukha on 4/10/14.
 */
public class CheckIssueTKSFirstScreen extends BaseStep{

    private Solo solo;

    public CheckIssueTKSFirstScreen(Solo solo){}

    public IssueTKSSecondScreen checkOfertaAndTapButtonAccept(IssueTKSFirstScreen agreement) throws Exception{
        String buttonId = agreement.getAcceptButtonId();
        String headerId = agreement.getHeaderId();
        checkOfertaHeaderText(headerId, agreement);
        checkButtonAcceptText(buttonId, agreement);
        agreement.tapAcceptButton();
         return new IssueTKSSecondScreen(solo);
        }

    public void checkOfertaHeaderText(String id, IssueTKSFirstScreen agreement)throws Exception {
        String text = agreement.getHeaderText();
        checkText(text, id, solo);
    }

    public void checkButtonAcceptText(String id, IssueTKSFirstScreen agreement) throws Exception {
        String text = agreement.getAcceptButtonText();
        checkText(text, id, solo);
    }



}
