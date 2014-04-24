package com.beskontakt.mobilewallet.steps.tinkoff.fill;

import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSSecondScreen;
import com.robotium.solo.Solo;


/**
 * Created by e.perevaryukha on 4/10/14.
 */
public class FillIssueTKSForm {

    public FillIssueTKSForm(Solo solo) {}

    public void fillForm(IssueTKSSecondScreen form) {
        form.setSecretWord("По");
        form.setAgreeCheckBox();
    }
}
