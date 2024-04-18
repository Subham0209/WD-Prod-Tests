package com.wdprod.qa.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.wdprod.qa.util.ExtentReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class TestListeners implements ITestListener {

    ExtentReports extentReport;
    ExtentTest extentTest;

    @Override
    public void onStart(ITestContext context) {

        extentReport = ExtentReporter.generateExtentReport();
    }
    @Override
    public void onTestStart(ITestResult result)

    {

        String testName = result.getName();
        extentTest = extentReport.createTest(testName);
        extentTest.log(Status.INFO,testName+" Test Stated Executing");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testName = result.getName();
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        if (driver != null) {

            File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destinationScreenshot = "C:\\Users\\7344755\\Desktop\\Automation\\Screenshots\\" + System.currentTimeMillis() + ".png";

            try {
                FileHandler.copy(srcScreenshot, new File(destinationScreenshot));
                extentTest.addScreenCaptureFromPath(destinationScreenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        extentTest.log(Status.PASS, testName + " Successfully Executed");

    }
    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");

        File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationScreenshot = "C:\\Users\\7344755\\Desktop\\Automation\\Screenshots\\" + System.currentTimeMillis() + ".png";
        try {
            FileHandler.copy(srcScreenshot, new File(destinationScreenshot));
            extentTest.fail(result.getThrowable());
            extentTest.addScreenCaptureFromPath(destinationScreenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }

        extentTest.log(Status.FAIL, testName + " Test Got Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        String testName = result.getName();
        extentTest.log(Status.SKIP, testName + " Test Got Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReport.flush();
    }

}