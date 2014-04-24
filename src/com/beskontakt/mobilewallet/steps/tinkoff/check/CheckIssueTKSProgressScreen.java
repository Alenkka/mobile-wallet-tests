package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSProgressScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


/**
 * Created by e.perevaryukha on 4/10/14.
 */
public class CheckIssueTKSProgressScreen extends BaseStep{
    public CheckIssueTKSProgressScreen(Solo solo){ }

    public void waitForSuccessIssueAndCheckParameters(IssueTKSProgressScreen progress)throws Exception {
        String headerId = progress.getHeaderId();
        checkProgressHeader(headerId,progress);
        String status1 = progress.getFirstStatusText();
        progress.waitForMessage(status1);
        String status2 = progress.getSecondStatusText();
        progress.waitForMessage(status2);
        String status3 = progress.getThirdStatusText();
        progress.waitForMessage(status3);
    }

    public void checkProgressHeader(String id, IssueTKSProgressScreen progress)throws Exception {
        String text = progress.getHeaderId();
        checkText(text, id,solo);
    }

    public void activateAndCheckParameters(IssueTKSProgressScreen progress)throws Exception {
        String headerId = progress.getHeaderId();
        checkProgressHeader(headerId,progress);
        String buttonId = progress.getActivateButtonId();
        checkButtonActivateText(buttonId,progress);
        progress.clickButton(buttonId);
        waitForSuccessActivation(progress);
    }

    public void checkButtonActivateText(String id, IssueTKSProgressScreen activationScreen) throws Exception {
        String text = activationScreen.getActivateButtonText();
        checkText(text, id, solo);
    }

    public void waitForSuccessActivation(IssueTKSProgressScreen progress)throws Exception {
        String status = progress.getActivationStatusText();
        progress.waitForMessage(status);
        }
}
