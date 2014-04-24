package com.beskontakt.mobilewallet.tests.cardMenu;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.MainAppScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.MenuTKSScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.RequisitesTKSScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.SecretWordScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckRequisitesScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.fill.FillSecretWordForm;
import com.beskontakt.mobilewallet.tests.common.BaseTestCase;

public class RequisitesTKS extends BaseTestCase{
	
	public static final String BUTTON_REQUISITES = "rbutton_1";
	public static final String BUTTON_NEXT = "button_continue";
	
		public void xtestBalanceTKS() throws Exception
		{
			// тап по карте на главном экране => видим меню			
			MainAppScreen mainScreen = new MainAppScreen(solo);
			mainScreen.tapOnTheCard();
			MenuTKSScreen menuTKSScreen = new MenuTKSScreen(solo);
			
			//зашли на экран ввод кодового слова
			SecretWordScreen secretWordScreen = menuTKSScreen.clickButtonRequisites(BUTTON_REQUISITES);
			// заполнили поле
			FillSecretWordForm form = new FillSecretWordForm(solo);
			form.setSecretWordForm(secretWordScreen); 
			// нажать Продолжить 
			RequisitesTKSScreen requisitesTKSScreen = secretWordScreen.clickButtonNext(BUTTON_NEXT);
			
		    // далее проверки  
			CheckRequisitesScreen checkRequisitesScreen = new CheckRequisitesScreen(solo);
			checkRequisitesScreen.checkRequisitesForm(requisitesTKSScreen);
	
		
		}

}
