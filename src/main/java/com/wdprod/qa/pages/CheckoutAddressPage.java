package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutAddressPage extends TestBase{

    @FindBy(id = "address.country")
    WebElement addresscountry;

    @FindBy(id ="address.firstName")
    WebElement firstName;

    @FindBy(id = "address.surname")
    WebElement surName;

    @FindBy(id = "address.line1")
    WebElement address1;

    @FindBy(id = "address.phone")
    WebElement phoneNum;

    //WebElement.sendKeys(Keys.DOWN, Keys.RETURN);

    @FindBy(id = "js-voucher-code-text")
    WebElement vouchercode;

    @FindBy(id = "js-checkout-voucher-apply-btn")
    WebElement getVouchercodebtn;

    @FindBy(className = "shipmentAddressSubmit")
    WebElement deliverybtn;



}
