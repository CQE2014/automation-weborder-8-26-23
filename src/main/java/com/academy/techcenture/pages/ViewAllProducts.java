package com.academy.techcenture.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ViewAllProducts  {
    protected WebDriver driver;

    public ViewAllProducts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//h1[text()='Web Orders']")
    protected WebElement mainHeader;

    @FindBy(xpath = "//div[@class='login_info' and contains(text(),' Welcome, Tester!')]")
    protected WebElement loginInfo;

    @FindBy(id = "ctl00_logout")
    protected WebElement logoutLink;

    @FindBy(xpath = "//a[@href='Products.aspx']")
    protected WebElement viewAllProductsLink;

    @FindBy(linkText = "//a[@href='Process.aspx']")
    protected WebElement ordersLink;

    @FindBy(tagName = "h2")
    protected WebElement listOfAllProductsHeader;

    @FindBy(className = "ProductsTable")
    protected WebElement tableOfProducts;

    @FindBy(xpath = "//th[text()='Product name']")
    protected WebElement productNameHeader;
    @FindBy(xpath = "//th[text()='Price']")
    protected WebElement priceNameHeader;

    @FindBy(xpath = "//th[text()='Discount']")
    protected WebElement discountNameHeader;

    @FindBy(xpath = "//td[text()='MyMoney']")
    protected WebElement myMoneyProduct;

    @FindBy(xpath = "//td[text()='FamilyAlbum']")
    protected WebElement familyAlbumProduct;

    @FindBy(xpath = "//td[text()='ScreenSaver']")
    protected WebElement screenSaverProduct;

    @FindBy(xpath = "//td[text()='$100']")
    protected WebElement priceOfMyMoney;

    @FindBy(xpath = "//td[text()='$80']")
    protected WebElement priceOfFamilyAlbum;

    @FindBy(xpath = "//td[text()='$20']")
    protected WebElement priceOfScreenSaverProduct;

    @FindBy(xpath = "//td[text()='8%']")
    protected WebElement discountForMyMoneyProduct;

    @FindBy(xpath = "//td[text()='15%']")
    protected WebElement discountForFamilyAlbumProduct;

    @FindBy(xpath = "//td[text()='10%']")
    protected WebElement discountScreenSaverProduct;

    public void validateMainHeader() {
        Assert.assertTrue(mainHeader.isDisplayed(), "Main Header Is Not Displayed.");
        Assert.assertEquals(mainHeader.getText().trim(), "Web Orders", "Incorrect Header.");

    }
    public void validateListOfProducts() {
        Assert.assertTrue(listOfAllProductsHeader.isDisplayed(), "List Of Products Header Is Not Displayed.");
        Assert.assertEquals(listOfAllProductsHeader.getText().trim(), "List of Products", "Incorrect Page.");
    }
    public void getTableData(){
        List<WebElement> tableData = tableOfProducts.findElements(By.xpath("//table[@class='ProductsTable']"));
        for (int i = 0; i < tableData.size(); i++) {
            WebElement tableContents = tableData.get(i);
            Assert.assertTrue(tableContents.isDisplayed());

        }

    }
    public void validateContentOfTable(){
        Assert.assertEquals(productNameHeader.getText().trim(),"Product name","Incorrect Product Name Header");
        Assert.assertEquals(priceNameHeader.getText().trim(),"Price","Incorrect Price Header");
        Assert.assertEquals(discountNameHeader.getText().trim(),"Discount","Incorrect Discount Header");
        Assert.assertEquals(myMoneyProduct.getText().trim(),"MyMoney","Incorrect Product Name");
        Assert.assertEquals(familyAlbumProduct.getText().trim(),"FamilyAlbum","Incorrect Product Name");
        Assert.assertEquals(screenSaverProduct.getText().trim(),"ScreenSaver","Incorrect Product Name");
        Assert.assertEquals(priceOfMyMoney.getText().trim(),"$100","Incorrect Price");
        Assert.assertEquals(priceOfFamilyAlbum.getText().trim(),"$80","Incorrect Price");
        Assert.assertEquals(priceOfScreenSaverProduct.getText().trim(),"$20","Incorrect Price");
        Assert.assertEquals(discountForMyMoneyProduct.getText().trim(),"8%","Incorrect Discount For My Money");
        Assert.assertEquals(discountForFamilyAlbumProduct.getText().trim(),"15%","Incorrect Discount For Family Album");
        Assert.assertEquals(discountScreenSaverProduct.getText().trim(),"10%","Incorrect Discount For Screen Saver");
    }
    public void goToOrderPage(){
        viewAllProductsLink.click();
    }
}
