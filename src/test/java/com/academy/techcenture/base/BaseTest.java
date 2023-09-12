package com.academy.techcenture.base;

import com.academy.techcenture.config.ConfigureReader;
import com.academy.techcenture.driver.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static ExtentReports reports;
    protected static ExtentTest extentTest;

    @BeforeTest
    public void beforeTest() {
        reports = new ExtentReports(System.getProperty("user.dir") + "/test-report/ExtentReport.html", true);
        reports.addSystemInfo("OS Name", System.getProperty("os.name"));
        reports.addSystemInfo("Engineer", System.getProperty("user.name"));
        reports.addSystemInfo("Environment", "QA");
        reports.addSystemInfo("Java Version", System.getProperty("java.version"));
    }

    @AfterTest
    public void afterTest() {
        reports.flush();
        reports.close();
    }

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.get(ConfigureReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(LogStatus.FAIL, "Test Case Failed" + result.getName());
            extentTest.log(LogStatus.FAIL, "Error Message" + result.getThrowable());
            String screenshotPath = getScreenshot(driver, result.getName());
            extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));

        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(LogStatus.SKIP, "Test Case Skipped" + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(LogStatus.PASS, "Test Case Passed" + result.getName());
        }
        reports.endTest(extentTest);
        Driver.quitDriver();

    }

    private static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/test-report/" + screenshotName + dateName + ".png";
        File finalDestination = new File(path);
        FileUtils.copyFile(source, finalDestination);
        return path;
    }

}






