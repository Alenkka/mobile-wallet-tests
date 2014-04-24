package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.beskontakt.mobilewallet.screens.commons.popupScreens.AlertTwoButtonPopupScreen;
import com.robotium.solo.Solo;

/**
 * Created by e.perevaryukha on 4/9/14.
 */
public class IssueTKSProgressScreen extends BaseScreen<Activity> {
    public static final String STATUS_FIRST = "Отправка заявки…";
    public static final String STATUS_SECOND = "Ожидание ответа от ТКС Банк (ЗАО). Обычно это занимает от 5 до 15 минут.";
    public static final String STATUS_THIRD = "Загрузка данных банковской карты...";
    public static final String STATUS_FOUR = "Активация банковской карты…";
    public static final String HEADER_TEXT = "TINKOFF MOBILE";
    public static final String HEADER_ID = "header";
    public static final String HIDE_BUTTON = "Свернуть";
    public static final String HIDE_BUTTON_ID = "button_reduce";
    public static final int WAITING_TIME = 180000;
    public static final int COUNT_OF_MATCHES = 1;
    public static final String successMessage = "Ваша банковская карта Tinkoff Mobile выпущена. Активируйте карту и оплачивайте покупки в одно касание!";
    public static final String ACTIVATE_BUTTON = "Активировать карту";
    public static final String ACTIVATE_BUTTON_ID = "button_activate";

    public IssueTKSProgressScreen(Solo solo) {
        super(solo);
    }

    public String getFirstStatusText(){
        return  this.STATUS_FIRST;
    }
    public String getThirdStatusText(){
        return  this.STATUS_THIRD;
    }
    public String getSecondStatusText(){return  this.STATUS_SECOND;}
    public String getActivationStatusText(){
        return  this.STATUS_FOUR;
    }
    public String getHeaderId(){ return  this.HEADER_ID; }
    public String getHeaderText(){ return  this.HEADER_TEXT; }
    public String getHideButtonIdId(){ return  this.HIDE_BUTTON_ID; }
    public String getHideButtonText(){ return  this.HIDE_BUTTON; }
    public String getActivateButtonId(){ return  this.ACTIVATE_BUTTON_ID; }
    public String getActivateButtonText(){ return  this.ACTIVATE_BUTTON; }


}
