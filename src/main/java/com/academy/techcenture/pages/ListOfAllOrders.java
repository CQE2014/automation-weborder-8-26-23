package com.academy.techcenture.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ListOfAllOrders {
    protected WebDriver driver;


    public ListOfAllOrders(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//h1[text()='Web Orders']")
    protected WebElement mainHeader;

    @FindBy(linkText = "//a[@href='Default.aspx']")
    protected WebElement viewAllOrdersLink;

    @FindBy(xpath = "//a[@href='Products.aspx']")
    protected WebElement viewAllProductsLink;

    @FindBy(linkText = "//a[@href='Process.aspx']")
    protected WebElement ordersLink;

    @FindBy(tagName = "h2")
    protected WebElement listOfAllOrders;

    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    protected WebElement checkAllBtn;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    protected WebElement uncheckAllBtn;

    @FindBy(xpath = "//div[@class='login_info' and contains(text(),' Welcome, Tester!')]")
    protected WebElement loginInfo;

    @FindBy(id = "ctl00_logout")
    protected WebElement logoutLink;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    protected WebElement deleteBtn;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']")
    protected WebElement tableOfAllOrders;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    protected WebElement firstCheckBox;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl03_OrderSelector")
    protected WebElement secondCheckBox;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl05_OrderSelector")
    protected WebElement forthCheckBox;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl07_OrderSelector")
    protected WebElement sixCheckBox;

    public void validateMainHeader() {
        Assert.assertTrue(mainHeader.isDisplayed(), "Main Header Is Not Displayed.");
        Assert.assertEquals(mainHeader.getText().trim(), "Web Orders", "Incorrect Header.");

    }

    public void validateListOfAllOrders() {
        Assert.assertTrue(listOfAllOrders.isDisplayed(), "Header Is Not Displayed.");
        assertEquals(listOfAllOrders.getText().trim(), "List of All Orders", "Incorrect Page.");

    }
    public void checkAllOrders() {
        checkAllBtn.click();
    }

    public void uncheckAllOrders() {
        Assert.assertTrue(uncheckAllBtn.isDisplayed(), "Uncheck Button Is Not Displayed.");
        Assert.assertTrue(uncheckAllBtn.isEnabled(), "Uncheck Button Is Not Enabled.");
        uncheckAllBtn.click();
    }

    public void deleteAllOrders() {
        Assert.assertTrue(deleteBtn.isDisplayed(), "Delete Button Is Not Displayed.");
        Assert.assertTrue(deleteBtn.isEnabled(), "Delete Button Is Not Enabled.");
        deleteBtn.click();
    }

    public void logoutBtn() {
        Assert.assertTrue(logoutLink.isDisplayed(), "Logout Link Is Not Displayed.");
        Assert.assertTrue(logoutLink.isEnabled(), "Logout Link Is Not Enabled.");
        logoutLink.click();
    }

    public void getTableData() {
        List<WebElement> tableRows = tableOfAllOrders.findElements(By.tagName("tr"));
        for (int i = 1; i < tableRows.size(); i++) {
            WebElement row = tableRows.get(i);

        }
        List<WebElement> tableCells = tableOfAllOrders.findElements(By.tagName("th"));
        WebElement cell1 = tableCells.get(1);
        WebElement cell2 = tableCells.get(2);
        WebElement cell4 = tableCells.get(4);
        WebElement cell6 = tableCells.get(6);


        firstCheckBox.click();
        secondCheckBox.click();
        forthCheckBox.click();
        sixCheckBox.click();

    }
    public void goToViewAllProducts(){
        viewAllProductsLink.click();
    }

}

