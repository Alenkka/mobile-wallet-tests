package com.beskontakt.mobilewallet.steps.tinkoff.fill;

import com.beskontakt.mobilewallet.screens.tinkoff.SecretWordScreen;
import com.robotium.solo.Solo;

public class FillSecretWordForm {
	
	public static final String SECRET_WORD = "Зззз";
	public static final String SECRET_WORD_ID = "edit_7_5_keyword";

	
	public FillSecretWordForm(Solo solo) {
	}

	public void setSecretWordForm(SecretWordScreen word) {
		
		word.setSecretWord(SECRET_WORD, SECRET_WORD_ID);
		
	}
	

}
