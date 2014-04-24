package com.beskontakt.mobilewallet.tests.activationTKS;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.MainAppScreen;
import com.beskontakt.mobilewallet.screens.commons.popupScreens.AlertTwoButtonPopupScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSProgressScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSScreensEnum;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckIssueTKSProgressScreen;
import com.beskontakt.mobilewallet.tests.common.BaseTestCase;

/**
 * Created by e.perevaryukha on 4/15/14.
 */
public class ActivationTKSTest extends BaseTestCase {

    public void xtestTKSActivationTest() throws Exception
    {
        MainAppScreen mainScreen = new MainAppScreen(solo);
        IssueTKSProgressScreen activationScreen = (IssueTKSProgressScreen) mainScreen.clickTKSCard(IssueTKSScreensEnum.IssueProgressScreen);
        CheckIssueTKSProgressScreen checkActivationProgress =  new CheckIssueTKSProgressScreen(solo);
        checkActivationProgress.activateAndCheckParameters(activationScreen);
        AlertTwoButtonPopupScreen successMessage = new AlertTwoButtonPopupScreen(solo);
        successMessage.clickButtonOne();

//        JDBCConnections jdbc = new JDBCConnections();
//        jdbc.checkClientWithEmailExist();
    }
}
