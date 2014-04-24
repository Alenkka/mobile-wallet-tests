package com.beskontakt.mobilewallet.tests.issueTKS;


import com.beskontakt.mobilewallet.screens.commons.masterScreens.MainAppScreen;
import com.beskontakt.mobilewallet.screens.commons.popupScreens.AlertTwoButtonPopupScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.*;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSFirstScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckIssueTKSFirstScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckIssueTKSProgressScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckIssueTKSSecondScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.fill.FillIssueTKSForm;
import com.beskontakt.mobilewallet.tests.common.BaseTestCase;

/**
 * Created by e.perevaryukha on 4/8/14.
 */
public class IssueTKSTest extends BaseTestCase {
  public void xtestTKSIssueTest() throws Exception
    {
        MainAppScreen mainScreen = new MainAppScreen(solo);
        IssueTKSFirstScreen agreement = (IssueTKSFirstScreen) mainScreen.clickTKSCard(IssueTKSScreensEnum.IssueFirstScreen);
        CheckIssueTKSFirstScreen checkOferta =  new CheckIssueTKSFirstScreen(solo);
        IssueTKSSecondScreen form = checkOferta.checkOfertaAndTapButtonAccept(agreement);
        CheckIssueTKSSecondScreen checkForm = new CheckIssueTKSSecondScreen(solo);
        checkForm.checkForm(form);
        FillIssueTKSForm formForFill = new FillIssueTKSForm(solo);
        formForFill.fillForm(form);
        IssueTKSProgressScreen progress = form.tapSendButton();
        CheckIssueTKSProgressScreen progressCheck = new CheckIssueTKSProgressScreen(solo);
        progressCheck.waitForSuccessIssueAndCheckParameters(progress);
        AlertTwoButtonPopupScreen successMessage = new AlertTwoButtonPopupScreen(solo);
        successMessage.clickButtonOne();

//        JDBCConnections jdbc = new JDBCConnections();
//        jdbc.checkClientWithEmailExist();
    }


}
