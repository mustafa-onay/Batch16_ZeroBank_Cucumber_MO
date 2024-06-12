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

    public void login (String username, String password) {
        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        signInBtn.click();
        Driver.get().navigate().back();
    }
    public void login () {
        userNameBox.sendKeys(ConfigurationReader.get("usernaem"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signInBtn.click();
        Driver.get().navigate().back();
    }
}
