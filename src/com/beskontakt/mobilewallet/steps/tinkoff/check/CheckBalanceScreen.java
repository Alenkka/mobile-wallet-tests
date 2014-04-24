package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.tinkoff.BalanceTKSScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;

public class CheckBalanceScreen extends BaseStep {
	
	public static final String HEADER_TITLE = "БАЛАНС";
    public static final String HEADER_TITLE_ID = "txt_header_title";
    public static final String BUTTON_TEXT = "Обновить";
    public static final String BUTTON_ID = "button_update";
	
	
	public CheckBalanceScreen(Solo solo) {
	}
    
	public void checkButtonText(String text, String id)throws Exception {
        checkText(text, id, solo);
    }

    public void checkTitleText(String text, String id) throws Exception {
        checkText(text, id, solo);
    }
	
	
	public void checkBalanceForm(BalanceTKSScreen form) throws Exception {
		checkText(BUTTON_TEXT, BUTTON_ID, solo);
		checkTitleText(HEADER_TITLE, HEADER_TITLE_ID);
	}


}
