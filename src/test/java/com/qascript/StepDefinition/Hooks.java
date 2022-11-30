package com.qascript.StepDefinition;

import com.qascript.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        initializeDriver();
    }

    @After
    public void close(){
        closeDriver();
    }
}
