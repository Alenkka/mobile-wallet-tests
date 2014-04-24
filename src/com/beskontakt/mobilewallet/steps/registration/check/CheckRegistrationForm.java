package com.beskontakt.mobilewallet.steps.registration.check;

import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


public class CheckRegistrationForm extends BaseStep {
    public static final String CHECK_AGREETEXT = "Я согласен с условиями пользовательского соглашения приложения «Кошелёк»";
    public static final String CHECK_AGREETEXT_ID = "checkAgreeText";
    public static final String BUTTON_NEXT_TEXT = "Продолжить";
    public static final String BUTTON_NEXT_TEXT_2 = "Готово";
    public static final String BUTTON_NEXT_ID = "button1";
    public static final String HEADER_TITLE = "Регистрация «Кошелька»";
    public static final String HEADER_TITLE_ID = "txt_header_title";
    public static final String HEADER_TITLE_2 ="Пароль и кодовое слово";
    public static final String HEADER_TITLE_3 ="Адрес эл.почты и\u00A0номер телефона";
    public static final String TEXT_AFTER_NUMBER ="Номер телефона должен соответствовать вставленной в\u00A0телефон SIM-карте.";
    public static final String TEXT_AFTER_NUMBER_ID ="txt_3_5_SIMmsg2";
    public static final String TEXT_UNDER_PASSWORD  = "Пароль может содержать только цифры и будет запрашиваться при входе в «Кошелёк».";
    public static final int ID_TEXT_UNDER_PASSWORD = 11;
    public static final String TEXT_UNDER_PASSWORD_2  = "Ваш пароль действителен только для входа в «Кошелёк». Никто не может запрашивать Ваш пароль по почте или телефону, и только Вы можете его сменить или восстановить.";
    public static final int ID_TEXT_UNDER_PASSWORD_2 = 12;

    public CheckRegistrationForm(Solo solo) {
        super(solo);
    }

    public void checkFirstScreenParameters() throws Exception {
		
		checkAgreementText(CHECK_AGREETEXT, CHECK_AGREETEXT_ID);
        checkButtonNextText(BUTTON_NEXT_TEXT, BUTTON_NEXT_ID);
		checkFirstFormHeader(HEADER_TITLE, HEADER_TITLE_ID);
			
	}
	
	public void checkSecondScreenParameters() throws Exception {
		checkButtonNextText(BUTTON_NEXT_TEXT, BUTTON_NEXT_ID);
        checkSecondFormHeader(HEADER_TITLE_2, HEADER_TITLE_ID);
        checkTextAfterPassword();
			
	}

	public void checkThirdScreenParameters() throws Exception {
		checkButtonNextText(BUTTON_NEXT_TEXT_2, BUTTON_NEXT_ID);
		checkTextAfterNumber(TEXT_AFTER_NUMBER, TEXT_AFTER_NUMBER_ID);
		checkThirdFormHeader(HEADER_TITLE_3, HEADER_TITLE_ID);
	}

    public void checkFirstFormHeader(String text, String id)throws Exception {
        checkText(text, id, solo);
    }

    public void checkAgreementText (String text, String id) throws Exception {
        checkText(text, id, solo);
    }


    public void checkTextAfterPassword() throws Exception{
        checkText(TEXT_UNDER_PASSWORD,ID_TEXT_UNDER_PASSWORD);
        checkText(TEXT_UNDER_PASSWORD_2,ID_TEXT_UNDER_PASSWORD_2);
    }

    public void checkSecondFormHeader(String text, String id)throws Exception {
        checkText(text, id, solo);
    }

    public void checkThirdFormHeader(String text, String id)throws Exception {
        checkText(text, id, solo);
    }

    public void checkButtonNextText(String text, String id) throws Exception {
        checkText(text, id, solo);
    }

    public void checkTextAfterNumber(String text, String id) throws Exception {
        checkText(text, id, solo);
    }

}


