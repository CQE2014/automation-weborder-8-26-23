package com.academy.techcenture.end2end;


import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.ListOfAllOrders;
import com.academy.techcenture.pages.LoginPage;

import org.testng.annotations.Test;

public class ListOfAllOrdersPageTest extends BaseTest {
    @Test
    public void validateMainHeaderTest() {
        extentTest = reports.startTest("Validation Of Main Header.");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);

        listOfAllOrders.validateListOfAllOrders();
    }

    @Test
    public void validateListOfAllOrdersTest() {
        extentTest = reports.startTest("Validation Of List Of All Orders Is Displayed");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.validateListOfAllOrders();
    }

    @Test
    public void checkAllOrdersTest() {
        extentTest = reports.startTest("Validation Of  All Checked Orders Are Displayed.");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.checkAllOrders();
    }

    @Test
    public void uncheckAllOrdersTest() {
        extentTest = reports.startTest("Validation Of All Orders Can Be Selected");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.uncheckAllOrders();
    }

    @Test
    public void deleteAllOrdersTest() {
        extentTest = reports.startTest("Validation Of All Orders Can Be Deleted");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.checkAllOrders();
        listOfAllOrders.deleteAllOrders();
    }

    @Test
    public void logOutTest() {
        extentTest = reports.startTest("Validation Of Logout Functionality");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.logoutBtn();

    }

    @Test
    public void getTableDataTest() {
        extentTest = reports.startTest("Validation Of Table Contains Data/Orders");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.getTableData();

    }

    @Test
    public void goToAllProductsLink() {
        extentTest = reports.startTest("Validation Of Functionality Of Link To The Next Page");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.correctLoginCredentials();
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        listOfAllOrders.goToViewAllProducts();
    }

}

