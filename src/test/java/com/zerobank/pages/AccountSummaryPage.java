package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(tagName = "h2")
    private List<WebElement> accountSummaryTypes;

    public List<String> getAccountSummaryTypeNames(){
        return BrowserUtils.getElementsText(accountSummaryTypes);
    }
}
