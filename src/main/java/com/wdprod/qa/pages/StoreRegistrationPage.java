package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.util.List;

public class StoreRegistrationPage extends TestBase{


    @FindBy(xpath = "//select[@id='accountType']")
    WebElement customertype;

    @FindBy(id = "contToRegs")
    WebElement continuebtn;

    @FindBy(xpath = "//input[@id='register.firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='register.lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='register.businessName']")
    WebElement businessname;

    @FindBy(xpath = "//select[@id='businessUse']")
    WebElement businessuse;

    @FindBy(xpath = "//select[@id='noOfEmployees']")
    WebElement noofemployees;

    @FindBy(xpath = "//input[@id='register.email']")
    WebElement emailaddress;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@data-target='#customerDiscountGrpValidationModal']")
    WebElement joinnowbtn;

    @FindBy(xpath = "//div[@class='truste-icon-box']")
    WebElement cookieclose;

    @FindBy(xpath = "//span[@class='hidden md:block underline']")
    WebElement My_Account_Link;

    @FindBy(linkText = "Logout")
    WebElement logoutlink;


    public StoreRegistrationPage() throws IOException {
        PageFactory.initElements(driver,this);

    }


public void validateRegistrationb2c(String email) throws InterruptedException {

        customertype.click();
        Thread.sleep(2000);
        Select se = new Select(customertype);
        // Select the option by index
        se.selectByIndex(0);
        Thread.sleep(2000);
        continuebtn.click();
        firstname.clear();
        firstname.sendKeys("John");
        lastname.clear();
        lastname.sendKeys("Right");
        emailaddress.clear();
        emailaddress.sendKeys(email);
        password.clear();
        password.sendKeys("West@12345678");
        joinnowbtn.click();
        Thread.sleep(15000);

    }

    public void validateRegistrationb2b_01(String email, String businessname1) throws InterruptedException {

        customertype.click();
        Thread.sleep(1000);
        Select se = new Select(customertype);
        // Select the option by index
        se.selectByIndex(1);
        Thread.sleep(2000);
        continuebtn.click();
        Thread.sleep(2000);
        firstname.clear();
        firstname.sendKeys("Subham");
        lastname.clear();
        lastname.sendKeys("Das");
        businessname.clear();
        businessname.sendKeys(businessname1);
        businessuse.click();
        Select se1 = new Select(businessuse);
        // Select the option by index
        se1.selectByIndex(1);
        noofemployees.click();
        Select se2 = new Select(noofemployees);
        // Select the option by index
        se2.selectByIndex(2);
        emailaddress.clear();
        emailaddress.sendKeys(email);
        password.clear();
        password.sendKeys("West@12345678.");
        //cookieclose.click();
        Thread.sleep(1000);
        joinnowbtn.click();
        Thread.sleep(12000);
        My_Account_Link.click();
        Thread.sleep(1000);
        logoutlink.click();
        Thread.sleep(6000);
    }

    public void validateRegistrationb2b_02(String email, String businessname1) throws InterruptedException {

        customertype.click();
        Thread.sleep(2000);
        Select se = new Select(customertype);
        // Select the option by index
        se.selectByIndex(1);
        Thread.sleep(2000);
        continuebtn.click();
        Thread.sleep(2000);
        firstname.clear();
        firstname.sendKeys("Subham");
        lastname.clear();
        lastname.sendKeys("Das");
        businessname.clear();
        businessname.sendKeys(businessname1);
        businessuse.click();
        Select se1 = new Select(businessuse);
        // Select the option by index
        se1.selectByIndex(2);
        noofemployees.click();
        Select se2 = new Select(noofemployees);
        // Select the option by index
        se2.selectByIndex(4);
        emailaddress.clear();
        emailaddress.sendKeys(email);
        password.clear();
        password.sendKeys("West@12345678.");
        //cookieclose.click();
        Thread.sleep(1000);
        joinnowbtn.click();
        Thread.sleep(12000);
        My_Account_Link.click();
        Thread.sleep(1000);
        logoutlink.click();
        Thread.sleep(6000);
    }

    public void validateRegistrationb2b_03(String email, String businessname1) throws InterruptedException {

        customertype.click();
        Thread.sleep(2000);
        Select se = new Select(customertype);
        // Select the option by index
        se.selectByIndex(1);
        Thread.sleep(2000);
        continuebtn.click();
        Thread.sleep(2000);
        firstname.clear();
        firstname.sendKeys("Subham");
        lastname.clear();
        lastname.sendKeys("Das");
        businessname.clear();
        businessname.sendKeys(businessname1);
        businessuse.click();
        Select se1 = new Select(businessuse);
        // Select the option by index
        se1.selectByIndex(3);
        noofemployees.click();
        Select se2 = new Select(noofemployees);
        // Select the option by index
        se2.selectByIndex(4);
        emailaddress.clear();
        emailaddress.sendKeys(email);
        password.clear();
        password.sendKeys("West@12345678.");
        //cookieclose.click();
        Thread.sleep(1000);
        joinnowbtn.click();
        Thread.sleep(12000);

    }


}
