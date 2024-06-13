package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy (id = "user_login")
    private WebElement userNameBox;
    @FindBy (id = "user_password")
    private WebElement passwordBox;
    @FindBy (css = "[name='submit']")
    private WebElement signInBtn;
    @FindBy (css = ".alert.alert-error")
    private WebElement errorMessage;

    public void login (String username, String password) {
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        signInBtn.click();

    }
    public void login () {
        userNameBox.sendKeys(ConfigurationReader.get("usernaem"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signInBtn.click();

    }

    public String getErrorMessageText(){
        return errorMessage.getText();
    }
}
