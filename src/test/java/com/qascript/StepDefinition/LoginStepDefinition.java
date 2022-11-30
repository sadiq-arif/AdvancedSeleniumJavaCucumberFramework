package com.qascript.StepDefinition;

import com.qascript.BaseClass;
import com.qascript.PageObjects.LoginPage;
import com.qascript.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

import java.util.Properties;

public class LoginStepDefinition extends BaseClass {

    Properties properties = PropertiesUtil.loadUserProperties();
    @Given("user enters valid username in email field")
    public void userEntersValidUsernameInEmailField() {
        String email = properties.getProperty("username");
        LoginPage.enterEmail(email);
    }

    @And("user enters valid password in password field")
    public void userEntersValidPasswordInPasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("user enters invalid username in email field")
    public void userEntersInvalidUsernameInEmailField() {
    }

    @And("user enters invalid password in password field")
    public void userEntersInvalidPasswordInPasswordField() {
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
