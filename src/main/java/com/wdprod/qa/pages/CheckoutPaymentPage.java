package com.wdprod.qa.pages;

import com.google.j2objc.annotations.Weak;
import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPaymentPage extends TestBase{

    @FindBy(id = "number")
    WebElement cardnum;

    @FindBy(id = "exp-month")
    WebElement cardmonth;

    @FindBy(id = "exp-year")
    WebElement cardyear;

    @FindBy(id = "cvc")
    WebElement cvv;

    @FindBy(xpath = "//button[@id='ord-submit-btn']")
    WebElement ordsubmitbtn;

    @FindBy(xpath = "//span[@class='underline']")
    WebElement returntodelivery;

    public void checkoutpaymentpageclick()
    {

    }



}
