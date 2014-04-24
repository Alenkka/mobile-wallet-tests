package com.beskontakt.mobilewallet.steps.common.masterSteps;

import android.widget.TextView;
import com.robotium.solo.Solo;
import junit.framework.Assert;

/**
 * Created by n.chekasheva on 11.04.2014.
 */
public class BaseStep {

    protected Solo solo;
    public BaseStep(Solo solo) {this.solo = solo;}

    public BaseStep() {
    }

    public void checkText(String text, String id, Solo solo) throws Exception {
        solo.sleep(1000);
        TextView text_header = (TextView)solo.getView(id);
        String text1 = text_header.getText().toString();
        Assert.assertEquals(text, text1);
    }

    public void checkText(String text, int id) throws Exception {
        String textActual = solo.getText(id).getText().toString();
        Assert.assertEquals(text, textActual);
    }

}
