package com.beskontakt.mobilewallet.screens.tinkoff;

import android.app.Activity;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.robotium.solo.Solo;

/**
 * Created by e.perevaryukha on 4/8/14.
 */
public class IssueTKSSecondScreen extends BaseScreen<Activity> {
    private static String HEADER = "header";
    private static String HEADER_ID = "Отправка заявки";
    private static String SEND_BUTTON = "Отправить заявку";
    private static String SEND_BUTTON_ID = "button_continue";
    private static String ACCEPT_CHECKBOX_TEXT_ID = "checkAgreeText";
    private static String ACCEPT_CHECKBOX_TEXT = "Я согласен на обработку персональных данных";
    private static Integer ACCEPT_CHECKBOX_ID = 0;
    private static String SECRET_WORD = "Кодовое слово для банка";
    private static String NAME_FOR_BANK = "Ваше имя на банковской карте:";
    private static String NAME_FOR_BANK_ID = "edit_bank_name";
    private static String SECRET_WORD_ID = "edit_keyword";


    public IssueTKSSecondScreen(Solo solo) {
        super(solo);
    }

    public void setAgreeCheckBox(){
        this.setCheckbox(ACCEPT_CHECKBOX_ID);
    }

    public void setSecretWord(String secretWord){
        setStringField(secretWord, SECRET_WORD_ID);
    }

   public IssueTKSProgressScreen tapSendButton() {
        clickButton(SEND_BUTTON_ID);
        return new IssueTKSProgressScreen(solo) ;
    }

    public String getHeaderId(){
        return  this.HEADER_ID;
    }
    public String getSendButtonId(){
        return  this.SEND_BUTTON_ID;
    }
    public String getSendButtonText(){
        return  this.SEND_BUTTON;
    }
    public String getHeaderText(){
        return  this.HEADER;
    }
    public String getSecretWordnId(){
        return  this.SECRET_WORD_ID;
    }
    public String getSecretWordText(){
        return  this.SECRET_WORD;
    }
    public String getBankNameId(){
        return  this.NAME_FOR_BANK_ID;
    }
    public String getBankNameText(){
        return  this.NAME_FOR_BANK;
    }
    public String getAcceptTextId(){
        return  this.ACCEPT_CHECKBOX_TEXT_ID;
    }
    public String getAcceptText(){
        return  this.ACCEPT_CHECKBOX_TEXT;
    }
    public Integer getAcceptCheckBoxId(){
        return  this.ACCEPT_CHECKBOX_ID;
    }

}

