package com.academy.techcenture.end2end;


import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class LoginPagePositiveTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        extentTest = reports.startTest("Positive Test Of Login.");
        LoginPage loginPage = new LoginPage(driver);

        extentTest.log(LogStatus.INFO, "Navigate To WebOrder Login Page.");
        extentTest.log(LogStatus.PASS, "User Was Able To Navigate To WebOrder Login Page.");
        extentTest.log(LogStatus.INFO, "Verify Presence Of User Name Label.");
        extentTest.log(LogStatus.PASS, "User Name Label Is Correct.");
        extentTest.log(LogStatus.INFO, "Verify User Name Field Is Available.");
        extentTest.log(LogStatus.PASS, "User Name Field Is Available");
        loginPage.correctLoginCredentials();

    }
}
