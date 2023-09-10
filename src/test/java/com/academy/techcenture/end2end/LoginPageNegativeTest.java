package com.academy.techcenture.end2end;

import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.LoginPage;
import org.testng.annotations.Test;
public class LoginPageNegativeTest extends BaseTest {
    @Test(priority = 1)
    public void incorrectUseName1Test() {
        extentTest = reports.startTest("Incorrect User Name");
        LoginPage loginPage = new LoginPage(driver);
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
