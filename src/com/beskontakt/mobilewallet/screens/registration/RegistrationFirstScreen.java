package com.beskontakt.mobilewallet.screens.registration;

import android.app.Activity;
import android.widget.DatePicker;
import com.beskontakt.mobilewallet.screens.commons.masterScreens.BaseScreen;
import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSUserAgreementScreen;
import com.robotium.solo.Solo;


public class RegistrationFirstScreen extends BaseScreen<Activity> {
	public static final int BUTTON_NEXT_DATEPICKER_X = 159;
	public static final int BUTTON_NEXT_DATEPICKER_Y = 341;

    private String firstName = "edit_3_5_name";
    private String secondName = "edit_3_5_second_name";
    private String middleName = "edit_3_5_middle_name";
    private String editBirthday = "edit_birthday";
    private String dataPicker = "datePicker";


    public RegistrationFirstScreen(Solo solo) {
		super(solo);
	}

    public void setName(String text){
		setStringField(text, firstName);
	}

	public void setSecondName(String text){
		setStringField(text, secondName);
	}
	
	public void setMiddleName(String text){
		setStringField(text, middleName);
	}

	public void setDateBirthday(int date, int month, int year) {
		solo.clickOnView(solo.getView(editBirthday));
		DatePicker datePiker = (DatePicker)solo.getView(dataPicker);
		solo.setDatePicker(datePiker, year, month, date);
		solo.clickOnScreen(BUTTON_NEXT_DATEPICKER_X,BUTTON_NEXT_DATEPICKER_Y);
	}

	public IssueTKSUserAgreementScreen clickAgreementText(String textAgreeLink) {
		solo.clickOnText(textAgreeLink);
		return new IssueTKSUserAgreementScreen(solo);
		}
	
	public RegistrationSecondScreen clickButtonNext(String id) {
		clickButton(id);		
		return new RegistrationSecondScreen(solo) ;
	}

    public void setCheckBox() {
       solo.clickOnCheckBox(0);
    }

}
