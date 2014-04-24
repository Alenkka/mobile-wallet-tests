package com.beskontakt.mobilewallet.tests.common;


import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;

public class BaseTestCase extends ActivityInstrumentationTestCase2 {
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.beskontakt.mobilewallet.NewMainActivity";
   	private static Class launcherActivityClass;
	static {
	    try {
	     launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
	    } catch (ClassNotFoundException e) {
	throw new RuntimeException(e);
	    }
		}
	
	@SuppressWarnings("unchecked")
	public BaseTestCase(){
		super(launcherActivityClass);
	}

	protected Solo solo;
	@Override
	protected void setUp() throws Exception {
	 solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Override
	public void tearDown() throws Exception {
	solo.finishOpenedActivities();

	}
}
