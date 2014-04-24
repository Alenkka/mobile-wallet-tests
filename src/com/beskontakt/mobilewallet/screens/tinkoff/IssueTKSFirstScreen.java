package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

/**
 * Created by e.perevaryukha on 4/8/14.
 */
public class IssueTKSFirstScreen extends BaseScreen<Activity> {
    private static final String ACCEPT_BUTTON_ID = "button_continue";
    private static final String HEADER_ID = "header";
    private static final String BUTTON_NAME = "Я принимаю условия оферты";
    public static String HEADER = "Оферта банка";
    public static String OFERTA = "";


    public IssueTKSFirstScreen(Solo solo) {
        super(solo);
    }

    public IssueTKSSecondScreen tapAcceptButton() {
        clickButton(ACCEPT_BUTTON_ID);
        return new IssueTKSSecondScreen(solo) ;
    }

    public String getHeaderId(){
       return  this.HEADER_ID;
    }

    public String getAcceptButtonId(){
        return  this.ACCEPT_BUTTON_ID;
    }
    public String getAcceptButtonText(){
        return  this.BUTTON_NAME;
    }

    public String getHeaderText(){
        return  this.HEADER;
    }
}
