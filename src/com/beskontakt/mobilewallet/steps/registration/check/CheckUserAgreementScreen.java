package com.beskontakt.mobilewallet.steps.registration.check;

import com.beskontakt.mobilewallet.screens.tinkoff.IssueTKSUserAgreementScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;

public class CheckUserAgreementScreen extends BaseStep{
	public static final String HEADER_TITLE = "Пользовательское соглашение";
	public static final String HEADER_TITLE_ID = "txt_header_title";
	public static final String BUTTON_NEXT_ID = "button1";
	public static final String BUTTON_NEXT_TEXT = "Я принимаю условия\nпользовательского соглашения";
	public static final String SCREENSHOT_TEXT = "Registration_oferta";

    public CheckUserAgreementScreen(Solo solo) {
        super(solo);
    }

    public void checkAgreementScreenParametrs(IssueTKSUserAgreementScreen userAgree) throws Exception {
		checkAgreementFormHeader(HEADER_TITLE, HEADER_TITLE_ID);
		checkButtonNextText(BUTTON_NEXT_TEXT, BUTTON_NEXT_ID);
		userAgree.getScreenshot(SCREENSHOT_TEXT);
	}


    public void checkAgreementFormHeader(String text, String id)throws Exception {
        checkText(text, id, solo);
    }

    public void checkButtonNextText(String text, String id) throws Exception {
        checkText(text, id, solo);
    }

}
