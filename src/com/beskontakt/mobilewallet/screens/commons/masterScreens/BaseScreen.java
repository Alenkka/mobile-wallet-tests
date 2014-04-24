package com.beskontakt.mobilewallet.screens.commons.masterScreens;


import android.app.Activity;
import android.widget.EditText;
import com.robotium.solo.Solo;


public class BaseScreen<T extends Activity> {

    protected Solo solo;

    public BaseScreen(Solo solo) {
        this.solo = solo;
    }

    public Solo getDriver() {
        return solo;
    }

    protected String getText(String resId) { return solo.getString(resId);    }

    public void setStringField(String text, String id) {
        EditText fieldName = (EditText)solo.getView(id);
        solo.enterText(fieldName, text);
    }

    public void getScreenshot(String titleText){
        solo.sleep(2000);
        solo.takeScreenshot(titleText);
    }

    public void clickButton(String id) {
        solo.clickOnView(solo.getView(id));
    }

    public void setCheckbox(Integer id){
        solo.clickOnCheckBox(id);
    }

    public void isCheckboxSet(Integer id)throws Exception{
        if (!solo.isCheckBoxChecked(id)){
            throw new Exception("AcceptCheckBox is not empty!");
        }
    }
    public void waitForMessage(String message){
        solo.waitForText(message);
    }

    public void waitForMessage(String message, int matchers, int timeForWait){
        solo.waitForText(message,matchers,timeForWait);
    }
}

