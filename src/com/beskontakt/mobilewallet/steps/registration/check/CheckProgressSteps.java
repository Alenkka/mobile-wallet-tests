package com.beskontakt.mobilewallet.steps.registration.check;

import com.beskontakt.mobilewallet.screens.registration.RegistrationProgressScreen;
import com.beskontakt.mobilewallet.steps.common.masterSteps.BaseStep;
import com.robotium.solo.Solo;


public class CheckProgressSteps extends BaseStep{
	public static final String STATUS_FIRST = "Отправка заявки…";
	public static final String STATUS_SECOND = "Проверка чипа безопасности…";
	public static final String STATUS_THIRD = "Проверка телефонного номера…";
	public static final String STATUS_FORTH = "Подготовка чипа безопасности…";
	public static final String STATUS_FIFTH = "Завершение регистрации…";
	public static final String HEADER = "Регистрация «Кошелька»";
	public static final String HEADER_TITLE = "txt_header_title";
    public static final int TEXT_UNDER_STATUS_ID = 3;
    public static final String TEXT_UNDER_STATUS = "Для регистрации «Кошелька» необходима проверка и подготовка к работе чипа безопасности Вашего телефона, где будут храниться выпущенные карты, а также проверка телефонного номера. Выполнение этих процессов может занять некоторое время и обычно требует всего несколько минут.";


    public CheckProgressSteps(Solo solo) {
        super(solo);
    }

    public void waitForSuccessAndCheckParameters(RegistrationProgressScreen progress) throws Exception{
		progress.waitForStatus(STATUS_FIRST);
		progress.waitForStatus(STATUS_SECOND);
		progress.waitForStatus(STATUS_THIRD);
		checkProgressFormHeader(HEADER, HEADER_TITLE);
		checkMessageUnderStatus(TEXT_UNDER_STATUS, TEXT_UNDER_STATUS_ID);
		progress.waitForStatus(STATUS_FORTH);
		progress.waitForStatus(STATUS_FIFTH);
		
	}


    public void checkProgressFormHeader(String text, String id)throws Exception {
        checkText(text, id, solo);

    }
    public void checkMessageUnderStatus(String text, int id)throws Exception {
        checkText(text, id);
    }

}
