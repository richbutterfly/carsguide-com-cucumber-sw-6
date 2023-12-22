package com.carguide.www.steps;

import com.carguide.www.propertyreader.PropertyReader;
import com.carguide.www.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
             final byte[] screenshot = getScreenShot();
             scenario.attach(screenshot,"image/png", scenario.getName());
        }

        closeBrowser();
    }
}
