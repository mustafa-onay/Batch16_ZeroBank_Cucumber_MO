package com.zerobank.stepDefs;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    @Then("The user should verify page title: {string}")
    public void the_user_should_verify_page_title(String expectedPageTitle) {
        accountSummaryPage.verifyPageTitle(expectedPageTitle);  // islemi methodla BasePage de yapiyor

        String actualPageTitle = accountSummaryPage.getPageTitle(); //Verify islemini burda stepdefs de yapiyor
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
    @Then("The account summary page account types should be as follows")
    public void the_account_summary_page_account_types_should_be_as_follows(List<String > expectedAccountTypes) {
        List<String> actualAccountTypes = accountSummaryPage.getAccountSummaryTypeNames();
        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
    }
}
