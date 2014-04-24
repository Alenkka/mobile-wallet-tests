package com.beskontakt.mobilewallet.steps.tinkoff.check;

import com.beskontakt.mobilewallet.screens.tinkoff.RequisitesTKSScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;

import com.robotium.solo.Solo;

public class CheckRequisitesScreen extends BaseStep{
	

	public static final String HEADER_TITLE = "РЕКВИЗИТЫ";
	public static final String HEADER_TITLE_ID = "txt_header_title";
	
	public CheckRequisitesScreen(Solo solo) {
	}
	
	
	public void checkRequisitesForm(RequisitesTKSScreen requisites) throws Exception {
			
		checkTitleText(HEADER_TITLE, HEADER_TITLE_ID);
			// добавить другие проверки
	}
	
	public void checkTitleText(String text, String id) throws Exception{
		checkText(text, id, solo);
		
	}

}
