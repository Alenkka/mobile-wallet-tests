package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSSecondScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


/**
 * Created by e.perevaryukha on 4/10/14.
 */
public class CheckIssueTKSSecondScreen extends BaseStep{
    private Solo solo;

    public CheckIssueTKSSecondScreen(Solo solo){}

    public void checkForm(IssueTKSSecondScreen form) throws Exception{
      String headerId = form.getHeaderId();
      String buttonId = form.getSendButtonId();
      Integer acceptCheckBoxId = form.getAcceptCheckBoxId();
        checkRequestHeader(headerId,form);
        checkSendButtonText(buttonId,form);
        checkAcceptIsNotSet(acceptCheckBoxId,form);

    }

    public void checkRequestHeader(String id, IssueTKSSecondScreen form)throws Exception {
        String text = form.getHeaderText();
        checkText(text, id, solo);
    }

    public void checkSendButtonText(String id, IssueTKSSecondScreen form) throws Exception {
       String text = form.getSendButtonText();
       checkText(text, id, solo);
    }

    public void checkAcceptIsNotSet(Integer id, IssueTKSSecondScreen form)throws Exception {
        form.isCheckboxSet(id);
    }
}

