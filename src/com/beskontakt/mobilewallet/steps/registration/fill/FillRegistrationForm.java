package com.beskontakt.mobilewallet.steps.registration.fill;

import com.beskontakt.mobilewallet.screens.registration.RegistrationFirstScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationSecondScreen;
import com.beskontakt.mobilewallet.screens.registration.RegistrationThirdScreen;
import com.robotium.solo.Solo;

public class FillRegistrationForm {
	public static final String SCREENS_TEXT = "First_registration_form";
	public static final String SECOND_NAME = "Сидоров";

	public FillRegistrationForm(Solo solo) {
	}

	public void setFirstFormFields(RegistrationFirstScreen firstReg) {
		
		firstReg.getScreenshot(SCREENS_TEXT);
		firstReg.setSecondName(SECOND_NAME);
		firstReg.setName("Петр");
		firstReg.setMiddleName("Петрович");
		firstReg.setDateBirthday( 15, 04, 1988);
		
	}

	public void setSecondFormFields(RegistrationSecondScreen secondReg) {
		secondReg.getScreenshot("Second_registration_form");
		secondReg.setPassword("0", "0", "0", "0", "0", "0", "0", "0");
		secondReg.setSecretWorld("Сидорова");
		
	}

	public void setThirdFormFields(RegistrationThirdScreen thirdReg) {
		thirdReg.setEmail("test@mail.com");
		thirdReg.setPhoneCode("965");
		thirdReg.setPhoneNumber("179 13 41");
	}

}
