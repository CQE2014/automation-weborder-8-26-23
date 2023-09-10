package com.academy.techcenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

 class BaseCommonElements {
    protected WebDriver driver;

    protected BaseCommonElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.driver);
    }

    @FindBy(xpath = "//h1[text()='Web Orders']")
    protected WebElement mainHeader;

    @FindBy(linkText = "//a[@href='Default.aspx']")
    protected WebElement viewAllOrdersLink;

    @FindBy(xpath = "//a[@href='Products.aspx']")
    protected WebElement viewAllProductsLink;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    protected WebElement ordersLink;

    @FindBy(xpath = "//div[@class='login_info' and contains(text(),' Welcome, Tester!')]")
    protected WebElement loginInfo;

    @FindBy(id = "ctl00_logout")
    protected WebElement logoutLink;
    @FindBy(tagName = "h2")
    protected WebElement listOfAllOrders;

    @FindBy(tagName = "h2")
    protected WebElement listOfAllProductsHeader;

    @FindBy(tagName = "h2")
    protected WebElement orderHeader;

    public void validateMainHeader() {
        Assert.assertTrue(mainHeader.isDisplayed(), "Main Header Is Not Displayed.");
        Assert.assertEquals(mainHeader.getText().trim(), "Web Orders", "Incorrect Header.");
    }

    public void validateListOfAllOrders() {
        Assert.assertTrue(listOfAllOrders.isDisplayed(), "Header Is Not Displayed.");
        assertEquals(listOfAllOrders.getText().trim(), "List of All Orders", "Incorrect Page.");
    }


    public void validateListOfAllProducts() {
        Assert.assertTrue(listOfAllProductsHeader.isDisplayed(), "List Of Products Header Is Not Displayed.");
        Assert.assertEquals(listOfAllProductsHeader.getText().trim(), "List of Products", "Incorrect Page.");
    }

    public void validateOrderHeader() {
        Assert.assertTrue(orderHeader.isDisplayed(), "Order Header Is Not Displayed.");
        Assert.assertEquals(orderHeader.getText().trim(), "Order", "Incorrect Page.");
    }
     public static final String USERNAME = "Tester";
     public static final String PASSWORD = "test";

     public static final String URL = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders";

     public static final String INCORRECT_USERNAME = "Tester10";
     public static final String INCORRECT_PASSWORD = "Tester";

     public static final String EMPTY_USERNAME = "";
     public static final String EMPTY_PASSWORD = "";
     public static final String CREDIT_CARD_NUMBER ="1200445565524112";
     public static final String EXPIRATION_DATE = "01/25";
     public static final String ZIPCODE = "27409";
}