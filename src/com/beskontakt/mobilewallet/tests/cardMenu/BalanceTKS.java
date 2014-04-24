package com.beskontakt.mobilewallet.tests.cardMenu;

import com.beskontakt.mobilewallet.screens.commons.masterScreens.MainAppScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.BalanceTKSScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.MenuTKSScreen;
import com.beskontakt.mobilewallet.steps.tinkoff.check.CheckBalanceScreen;
import com.beskontakt.mobilewallet.tests.common.BaseTestCase;

public class BalanceTKS extends BaseTestCase{
	
	public static final String BUTTON_BALANCE = "rbutton_0";
	public static final String BUTTON_REFRESH = "button_update";
	
		public void xtestBalanceTKS() throws Exception
		{
			// тап по карте на главном экране => видим меню			
			MainAppScreen mainScreen = new MainAppScreen(solo);
			mainScreen.tapOnTheCard();
			MenuTKSScreen menuTKSScreen = new MenuTKSScreen(solo);
			
			//зашли в меню баланс и проверили текст заголовка и текст кнопки
			BalanceTKSScreen balanceTKSScreen = menuTKSScreen.clickButtonBalance(BUTTON_BALANCE);
			CheckBalanceScreen checkBalanceScreen = new CheckBalanceScreen(solo);
			checkBalanceScreen.checkBalanceForm(balanceTKSScreen);
		
			//нажали кн.Обновить и проверили текст заголовка и текст кнопки
			balanceTKSScreen.clickButtonRefresh(BUTTON_REFRESH);
			checkBalanceScreen.checkBalanceForm(balanceTKSScreen);
		
		}

}
