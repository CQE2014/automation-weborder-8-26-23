package com.academy.techcenture.end2end;

import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
public class LoginPageNegativeTest extends BaseTest {
    @Test(priority = 1)
    public void incorrectUseName1Test() {
        extentTest = reports.startTest("Incorrect User Name");
        LoginPage loginPage = new LoginPage(driver);
        extentTest.log(LogStatus.INFO," Is User Name Label Displayed?");
        extentTest.log(LogStatus.PASS,"User Name Label Is Displayed.");
        extentTest.log(LogStatus.INFO,"Is User Name Text Correct?");
        extentTest.log(LogStatus.PASS,"Text Of User Name Is Correct.");
        extentTest.log(LogStatus.INFO,"User Enters Incorrect User Name.");
        extentTest.log(LogStatus.PASS,"Error Message Emerges:Invalid Login or Password.");
        extentTest.log(LogStatus.INFO,"Is Password Label Displayed?");
        extentTest.log(LogStatus.PASS,"Password Label Is Displayed.");
        extentTest.log(LogStatus.INFO,"Is Password Text Correct?");
        extentTest.log(LogStatus.PASS,"Text Of Password Is Correct.");
        extentTest.log(LogStatus.INFO,"User Enters Correct Password.");
        extentTest.log(LogStatus.PASS,"Login Failed.");
        loginPage.incorrectUserName();
    }

    @Test(priority = 2)
    public void incorrectUseName2Test() {
        extentTest = reports.startTest("Empty User Name Field");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emptyUserName();
    }

    @Test(priority = 3)
    public void incorrectPassWord1Test() {
      extentTest = reports.startTest("Incorrect Password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.incorrectPassWord();
    }
    @Test(priority = 4)
    public void incorrectPassWord2Test() {
        extentTest = reports.startTest("Empty Password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emptyPassWord();
    }

}
