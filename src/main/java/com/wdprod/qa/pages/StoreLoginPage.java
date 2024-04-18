package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLoginPage extends TestBase

{
    HomePage homePage = new HomePage();

    @FindBy(xpath = "//a[normalize-space()='']//img[@title='Western Digital Logo']")
    WebElement StoreWDLogo;

    @FindBy(xpath = "//span[normalize-space()='Sign In']")
    WebElement SignInLink;

    @FindBy(xpath = "//a[@href='/store/registration']")
    WebElement CreateAccountLink;

    @FindBy(xpath = "//a[@href='/us/en/login']")
    WebElement LoginButton;

    @FindBy(id = "j_username")
    WebElement Username;

    @FindBy(id = "j_password")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Sign In']")
    WebElement StoreSignInButton;

    @FindBy(xpath="//a[@id='newRegsCreateCounsumerAccount']")
    WebElement Sign_In_Button;

    // WebElements for Forget Password Feature

    @FindBy(id = "forgetPassLink")
    WebElement forgetpwdlink;

    @FindBy(id ="forgottenPwd.email")
    WebElement email;

    @FindBy(xpath = "//button[@class='defaultBtn bg-blue hover:bg-dark-blue active:bg-darker-blue text-white w-full']")
    WebElement submit;

    @FindBy(xpath = "//button[@data-target='#forgetPassModal' and contains(@class, 'defaultBtn') and contains(@class, 'bg-blue')]")
    WebElement okbtn1;

    @FindBy(xpath = "//p[@class='text-black mb-0']")
    WebElement errormessage;

    public StoreLoginPage()
    {
        PageFactory.initElements(driver,this);
    }


    public boolean validateWDLogo() {

        return StoreWDLogo.isDisplayed();

    }

    public void StoreLoginTest() {

        SignInLink.click();
        CreateAccountLink.click();
        Sign_In_Button.click();
        Username.sendKeys("subhamdas7+15@gmail.com");
        Password.sendKeys("West@12345678");
        StoreSignInButton.click();


    }


    public void InvalidCredStoreLoginTest() throws InterruptedException {

        homePage.AccountsLink.click();
        homePage.logoutlink.click();
        Thread.sleep(2000);
        SignInLink.click();
        CreateAccountLink.click();
        Sign_In_Button.click();
        Username.sendKeys("subhamdas7+15@gmail.com");
        Password.sendKeys("West@123456780");
        StoreSignInButton.click();
    }

    public void setForgetpwdlink() throws InterruptedException {
        forgetpwdlink.click();
        Thread.sleep(1000);
        email.clear();
        email.sendKeys("subhamdas7+15@gmail.com");
        submit.click();
        Thread.sleep(3000);
        okbtn1.click();
        Thread.sleep(2000);
    }

    public void setForgetpwdlink01() throws InterruptedException {
        forgetpwdlink.click();
        Thread.sleep(1000);
        email.clear();
        email.sendKeys("subhamdas7+15@gmail.com");
        submit.click();
        Thread.sleep(4000);
    }

    public void setForgetpwdlinkb2b() throws InterruptedException {
        forgetpwdlink.click();
        Thread.sleep(1000);
        email.clear();
        email.sendKeys("subhamdas7+9000@gmail.com");
        submit.click();
        Thread.sleep(3000);
        okbtn1.click();
        Thread.sleep(2000);
    }

    public void setForgetpwdlinkb2b01() throws InterruptedException {
        forgetpwdlink.click();
        Thread.sleep(1000);
        email.clear();
        email.sendKeys("subhamdas7+9000@gmail.com");
        submit.click();
        Thread.sleep(3000);

    }

    public String getErrorMessage()
    {
        // Get the text content of the error message element
        String errorMessage = errormessage.getText();
        return errorMessage;

    }
}