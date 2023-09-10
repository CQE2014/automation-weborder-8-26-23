package com.academy.techcenture.pages;

import com.academy.techcenture.constant.Constant;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Order extends BaseCommonElements {
    protected WebDriver driver;

    public Order(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);


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
    protected WebElement orderHeader;

    @FindBy(xpath = "//h3[text()='Product Information']")
    protected WebElement productInfoHeader;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_ddlProduct']")
    protected WebElement productLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    protected WebElement productDropDownOpt;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    protected WebElement selectTable;

    @FindBy(xpath = "//option[@value='MyMoney']")
    protected WebElement myMoneyOpt;

    @FindBy(xpath = "//option[@value='FamilyAlbum']")
    protected WebElement familyAlbumOpt;

    @FindBy(xpath = "//option[@value='ScreenSaver']")
    protected WebElement screenSaverOpt;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtQuantity']")
    protected WebElement qtyLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    protected WebElement qtyInput;

    @FindBy(xpath = "//em[text()=\"Field 'Quantity' cannot be empty.\"]")
    protected WebElement errorForZeroQty;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    protected WebElement pricePerUnitLabel;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    protected WebElement pricePerUnitInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtDiscount']")
    protected WebElement discountLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    protected WebElement discountInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtTotal']")
    protected WebElement totalLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    protected WebElement totalInput;

    @FindBy(xpath = "//input[@value='Calculate']")
    protected WebElement calculateBtn;

    @FindBy(xpath = "//h3[text()='Address Information']")
    protected WebElement addressInfoHeader;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_txtName']")
    protected WebElement customerNameLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    protected WebElement customerNameInput;


    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    protected WebElement streetInput;
    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox2']")
    protected WebElement streetLabel;


    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox3']")
    protected WebElement cityLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    protected WebElement cityInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox4']")
    protected WebElement stateLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    protected WebElement stateInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox5']")
    protected WebElement zipLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    protected WebElement zipInput;

    @FindBy(xpath = "//h3[text()='Payment Information']")
    protected WebElement paymentInfoHeader;

    @FindBy(xpath = "//label[contains(text(),'Card:')]")
    protected WebElement cardLabel;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_cardList_0']")
    protected WebElement visaLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    protected WebElement visaBtn;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_cardList_1']")
    protected WebElement masterCardLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    protected WebElement masterCardBtn;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_cardList_2']")
    protected WebElement americanExpressLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    protected WebElement americanExpressBtn;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox6']")
    protected WebElement cardNumberLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    protected WebElement cardNumberInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_fmwOrder_TextBox1']")
    protected WebElement expireDateLabel;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    protected WebElement expDateInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    protected WebElement processBtn;

    @FindBy(xpath = "(//strong)")
    protected WebElement orderConfirmation;

    @FindBy(xpath = "//input[@value='Reset']")
    protected WebElement resetBtn;

    public void validateMainHeader() {
        Assert.assertTrue(mainHeader.isDisplayed(), "Main Header Is Not Displayed.");
        Assert.assertEquals(mainHeader.getText().trim(), "Web Orders", "Incorrect Header.");

    }

    public void validateOrderHeader() {
        Assert.assertTrue(orderHeader.isDisplayed(), "Order Header Is Not Displayed.");
        Assert.assertEquals(orderHeader.getText().trim(), "Order", "Incorrect Page.");
    }

    public void validateProductInfoHeader() {
        Assert.assertTrue(productInfoHeader.isDisplayed(), "Product Information Header Is Not Available.");
        Assert.assertEquals(productInfoHeader.getText().trim(), "Product Information", "Incorrect Name For American Express Label .");
    }

    public void checkProductInfoSection() throws Exception {
        productDropDownOpt.click();
        Select select = new Select(selectTable);
        select.selectByValue("MyMoney");
        select.selectByValue("FamilyAlbum");
        select.selectByValue("ScreenSaver");
        Assert.assertTrue(qtyInput.isDisplayed(), "Quantity Field Is Not Displayed.");
        qtyInput.clear();
        Thread.sleep(300);
        qtyInput.sendKeys("10");
        Assert.assertTrue(calculateBtn.isDisplayed(), "Calculate Button Is Not Displayed.");
        Assert.assertTrue(calculateBtn.isEnabled(), "Calculate Button Is Not Enabled.");
        calculateBtn.click();
        String textOfQty = qtyInput.getText();
        String textOfPricePerUnit = pricePerUnitInput.getText();
        String textOfDiscount = discountInput.getText();
        String textOfTotal = totalInput.getText();
//        int qtyNumber = Integer.parseInt(textOfQty);
//        int priceNumber = Integer.parseInt(textOfPricePerUnit);
//        int discountNumber = Integer.parseInt(textOfDiscount);
//        int totalNumber = Integer.parseInt(textOfTotal);


    }

    public void validateAllLabelsOfOrderPage() {
        Assert.assertTrue(productLabel.isDisplayed(), "Product Label Is Not Available.");
        Assert.assertEquals(productLabel.getText().trim(), "Product:*", "Incorrect Name For Product Label.");
        Assert.assertTrue(qtyLabel.isDisplayed(), "Quantity Label Is Not Available.");
        Assert.assertEquals(qtyLabel.getText().trim(), "Quantity:*", "Incorrect Name For Quantity Label.");
        Assert.assertTrue(pricePerUnitLabel.isDisplayed(), "Price Label Is Not Available.");
        Assert.assertEquals(pricePerUnitInput.getText().trim(), "Price per unit:", "Incorrect Name For Price Per Unit Label.");
        Assert.assertTrue(discountLabel.isDisplayed(), "Discount Label Is Not Available.");
        Assert.assertEquals(discountLabel.getText().trim(), "Discount:", "Incorrect Name For Discount Label .");
        Assert.assertTrue(totalLabel.isDisplayed(), "Total Label Is Not Available.");
        Assert.assertEquals(totalLabel.getText().trim(), "Total:", "Incorrect Name For Total Label .");
        Assert.assertTrue(customerNameLabel.isDisplayed(), "Customer Label Is Not Available.");
        Assert.assertEquals(customerNameLabel.getText().trim(), "Customer name:*", "Incorrect Name For Customer Name Label .");
        Assert.assertTrue(streetLabel.isDisplayed(), "Street Label Is Not Available.");
        Assert.assertEquals(streetLabel.getText().trim(), "Street:*", "Incorrect Name For Street Label .");
        Assert.assertTrue(cityLabel.isDisplayed(), "City Label Is Not Available.");
        Assert.assertEquals(cityLabel.getText().trim(), "City:*", "Incorrect Name For City Label .");
        Assert.assertTrue(stateLabel.isDisplayed(), "State Label Is Not Available.");
        Assert.assertEquals(stateLabel.getText().trim(), "State:", "Incorrect Name For State Label .");
        Assert.assertTrue(zipLabel.isDisplayed(), "Zip Label Is Not Available.");
        Assert.assertEquals(zipLabel.getText().trim(), "Zip:*", "Incorrect Name For Zip Label .");
        Assert.assertTrue(cardLabel.isDisplayed(), "Card Label Is Not Available.");
        Assert.assertEquals(cardLabel.getText().trim(), "Card:*", "Incorrect Name For Card Label .");
        Assert.assertTrue(visaLabel.isDisplayed(), "Visa Label Is Not Available.");
        Assert.assertEquals(visaLabel.getText().trim(), "Visa", "Incorrect Name For Visa Label .");
        Assert.assertTrue(masterCardLabel.isDisplayed(), "Master Card Label Is Not Available.");
        Assert.assertEquals(masterCardLabel.getText().trim(), "MasterCard", "Incorrect Name For Master Card Label .");
        Assert.assertTrue(americanExpressLabel.isDisplayed(), "American Express Is Not Available.");
        Assert.assertEquals(americanExpressLabel.getText().trim(), "American Express", "Incorrect Name For American Express Label .");
        Assert.assertTrue(cardLabel.isDisplayed(), "Card Label Is Not Available.");
        Assert.assertEquals(cardLabel.getText().trim(), "Card:*", "Incorrect Name For Card Number Label .");
        Assert.assertTrue(expireDateLabel.isDisplayed(), "Expire Date Label Is Not Available.");
        Assert.assertEquals(expireDateLabel.getText().trim(), "Expire date (mm/yy):*", "Incorrect Name For American Express Label .");

    }

    public void checkAddressInfo() {
        Faker faker = new Faker();
        Assert.assertTrue(customerNameInput.isDisplayed(), "Customer Name Input Is Not Displayed.");
        customerNameInput.sendKeys(faker.name().fullName());
        Assert.assertTrue(streetInput.isDisplayed(), "Street Input Is Not Displayed.");
        streetInput.sendKeys(faker.address().streetAddressNumber());
        Assert.assertTrue(cityInput.isDisplayed(), "Street Input Is Not Displayed.");
        cityInput.sendKeys(faker.address().cityName());
        Assert.assertTrue(stateInput.isDisplayed(), "State Input Is Not Displayed.");
        stateInput.sendKeys(faker.address().state());
        Assert.assertTrue(zipInput.isDisplayed(), "Zip Input Is Not Displayed.");
        zipInput.sendKeys(ZIPCODE);
    }

    public void checkPaymentInfo() {
        Random random = new Random();
        List<WebElement> listOpt = Arrays.asList(visaBtn, masterCardBtn, americanExpressBtn);
        int index = listOpt.size();
        int randomCardOpt = random.nextInt(index);
        listOpt.get(randomCardOpt).click();
        cardNumberInput.sendKeys(CREDIT_CARD_NUMBER);
        expDateInput.sendKeys(EXPIRATION_DATE);
        Assert.assertTrue(processBtn.isDisplayed(),"Process Button Is Not Displayed.");
        Assert.assertTrue(processBtn.isEnabled(),"Process Button Is Not Enabled.");
        Assert.assertEquals(processBtn.getText().trim(),"Process","Incorrect Name Of Button.");
        processBtn.click();
        Assert.assertTrue(orderConfirmation.isDisplayed(),"Order Confirmation Is Not Displayed.");
        Assert.assertEquals(orderConfirmation.getText().trim(),"New order has been successfully added.","Incorrect Message Is Displayed.");

    }


    public void goToOrder() {
        ordersLink.click();


    }

}

