package com.academy.techcenture.end2end;

import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.ListOfAllOrders;
import com.academy.techcenture.pages.LoginPage;
import com.academy.techcenture.pages.Order;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {
    @Test
    public void accessOfOrderPageTest() {
        extentTest = reports.startTest("Validation Of Order Page");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();

    }

    @Test
    public void validateOrderHeaderTest() {
        extentTest = reports.startTest("Validation Of Order Page Header");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();
        order.validateOrderHeader();
    }

    @Test
    public void validateAllLabelsOfOrderTest() {
        extentTest = reports.startTest("Validation Of Label Of Order Page");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();
        order.validateAllLabelsOfOrderPage();

    }

    @Test
    public void checkProductInfoSectionTest() throws Exception {
        extentTest = reports.startTest("Validation Of Info Section");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();
        order.validateAllLabelsOfOrderPage();
        order.checkProductInfoSection();

    }

    @Test
    public void checkAddressInfoTest() throws Exception {
        extentTest = reports.startTest("Validation Of Address Section");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();
        order.validateAllLabelsOfOrderPage();
        order.checkProductInfoSection();
        order.checkAddressInfo();
    }
    @Test
    public void checkPaymenttInfoTest() throws Exception {
        extentTest = reports.startTest("Validation Of Payment Info Section");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        Order order = new Order(driver);
        loginPage.correctLoginCredentials();
        listOfAllOrders.goToViewAllProducts();
        order.goToOrder();
        order.validateAllLabelsOfOrderPage();
        order.checkProductInfoSection();
        order.checkAddressInfo();
        order.checkPaymentInfo();
    }
}