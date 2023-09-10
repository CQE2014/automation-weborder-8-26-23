package com.academy.techcenture.pages;

import com.academy.techcenture.constant.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Constant {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//label[@for='ctl00_MainContent_username']")
    protected WebElement textUserName;

    @FindBy(id = "ctl00_MainContent_username")
    protected WebElement userNameInput;

    @FindBy(xpath = "//label[@for='ctl00_MainContent_password']")
    protected WebElement textPassWord;

    @FindBy(id = "ctl00_MainContent_password")
    protected WebElement passWordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    protected WebElement loginBtn;

    @FindBy(xpath = "//span[@id='ctl00_MainContent_status' and text()='Invalid Login or Password.']")
    protected WebElement invalidUserNameOrPassword;

    @FindBy(xpath = "//h2[normalize-space()='List of All Orders']")
    protected WebElement listOfAllOrders;

    public void correctLoginCredentials() {
        Assert.assertEquals(textUserName.getText().trim(), "Username:", "User Name Label Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "User Name Label Is Not Displayed.");
        Assert.assertTrue(userNameInput.isDisplayed(), "User Name Is Not Displayed.");
        userNameInput.sendKeys(USERNAME);
        Assert.assertEquals(textPassWord.getText().trim(), "Password:", "Password Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "Password Label Is Not Displayed.");
        Assert.assertTrue(passWordInput.isDisplayed(), "Password Is Not Displayed.");
        passWordInput.sendKeys(PASSWORD);
        Assert.assertTrue(loginBtn.isDisplayed() && loginBtn.isEnabled(), "Login Button Either Is Not Displayed Or Enabled.");
        loginBtn.click();
       Assert.assertEquals(listOfAllOrders.getText().trim(), "List of All Orders");


    }

    public void incorrectUserName() {
        Assert.assertEquals(textUserName.getText().trim(), "Username:", "User Name Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "User Name Label Is Not Displayed.");
        Assert.assertTrue(userNameInput.isDisplayed(), "User Name Is Not Displayed.");
        userNameInput.sendKeys(INCORRECT_USERNAME);
        Assert.assertEquals(textPassWord.getText().trim(), "Password:", "Password Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "Password Label Is Not Displayed.");
        Assert.assertTrue(passWordInput.isDisplayed(), "Password Is Not Displayed.");
        passWordInput.sendKeys(PASSWORD);
        Assert.assertTrue(loginBtn.isDisplayed() && loginBtn.isEnabled(), "Login Button Either Is Not Displayed Or Enabled.");
        loginBtn.click();
        Assert.assertEquals(invalidUserNameOrPassword.getText().trim(), "Invalid Login or Password.", "Error Message Is Not Displayed.");


    }

    public void incorrectPassWord() {
        Assert.assertEquals(textUserName.getText().trim(), "Username:", "User Name Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "User Name Label Is Not Displayed.");
        Assert.assertTrue(userNameInput.isDisplayed(), "User Name Is Not Displayed.");
        userNameInput.sendKeys(USERNAME);
        Assert.assertEquals(textPassWord.getText().trim(), "Password:", "Password Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "Password Label Is Not Displayed.");
        Assert.assertTrue(passWordInput.isDisplayed(), "Password Is Not Displayed.");
        passWordInput.sendKeys(INCORRECT_PASSWORD);
        Assert.assertTrue(loginBtn.isDisplayed() && loginBtn.isEnabled(), "Login Button Either Is Not Displayed Or Enabled.");
        loginBtn.click();
        Assert.assertEquals(invalidUserNameOrPassword.getText().trim(), "Invalid Login or Password.", "Error Message Is Not Displayed.");
    }

    public void emptyUserName() {
        Assert.assertEquals(textUserName.getText().trim(), "Username:", "User Name Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "User Name Label Is Not Displayed.");
        Assert.assertTrue(userNameInput.isDisplayed(), "User Name Is Not Displayed.");
        userNameInput.sendKeys(EMPTY_USERNAME);
        Assert.assertEquals(textPassWord.getText().trim(), "Password:", "Password Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "Password Label Is Not Displayed.");
        Assert.assertTrue(passWordInput.isDisplayed(), "Password Is Not Displayed.");
        passWordInput.sendKeys(PASSWORD);
        Assert.assertTrue(loginBtn.isDisplayed() && loginBtn.isEnabled(), "Login Button Either Is Not Displayed Or Enabled.");
        loginBtn.click();
        Assert.assertEquals(invalidUserNameOrPassword.getText().trim(), "Invalid Login or Password.", "Error Message Is Not Displayed.");
    }

    public void emptyPassWord() {
        Assert.assertEquals(textUserName.getText().trim(), "Username:", "User Name Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "User Name Label Is Not Displayed.");
        userNameInput.sendKeys(USERNAME);
        Assert.assertEquals(textPassWord.getText().trim(), "Password:", "Password Is Incorrect.");
        Assert.assertTrue(textUserName.isDisplayed(), "Password Label Is Not Displayed.");
        Assert.assertTrue(passWordInput.isDisplayed(), "Password Is Not Displayed.");
        passWordInput.sendKeys(EMPTY_PASSWORD);
        Assert.assertTrue(loginBtn.isDisplayed() && loginBtn.isEnabled(), "Login Button Either Is Not Displayed Or Enabled.");
        loginBtn.click();
        Assert.assertEquals(invalidUserNameOrPassword.getText().trim(), "Invalid Login or Password.", "Error Message Is Not Displayed.");
    }
}
