package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutDeliveryPage extends TestBase{

    @FindBy(id = "deliveryMethodSubmit")
    WebElement deliverybtn1;

    @FindBy(xpath = "//span[@class='underline']")
    WebElement returntoaddressbtn;

    @FindBy(className = "text-sm font-normal text-right underline mb-3 leading-tight")
    WebElement returntoCartbtn;







}
