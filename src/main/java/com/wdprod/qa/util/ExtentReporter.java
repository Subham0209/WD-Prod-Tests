package com.wdprod.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import java.io.File;

public class ExtentReporter {

    public static ExtentReports generateExtentReport()
    {

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\7344755\\Desktop\\Automation\\Results\\Report.html");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("Western Digital Automation Tests");
        sparkReporter.config().setDocumentTitle("Western-Digital Tests");
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");

        ExtentReports extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReporter);
        extentReport.setSystemInfo("Browser", "Chrome");
        extentReport.setSystemInfo("Operating System", "Microsoft Windows 10 Pro");
        extentReport.setSystemInfo("Author", "Shubham Das");
        extentReport.setSystemInfo("Category", "Smoke Test Suite");
        extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));
        extentReport.flush();
        return extentReport;


    }
}
