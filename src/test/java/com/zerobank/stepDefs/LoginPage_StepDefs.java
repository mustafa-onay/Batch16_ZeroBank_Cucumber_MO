package com.zerobank.stepDefs;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.When;

public class LoginPage_StepDefs {
    LoginPage loginPage = new LoginPage();
    @When("The user enters valid credentials: {string} and {string}")
    public void the_user_enters_valid_credentials_and(String username, String password) {
        loginPage.login(username,password);
    }
}
