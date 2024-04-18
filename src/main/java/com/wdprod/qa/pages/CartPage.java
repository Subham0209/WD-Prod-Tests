package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends TestBase{

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement qtyincart;

    @FindBy(xpath = "//a[@input='checkoutnowBtn']")
    WebElement checkoutbtn;

    @FindBy(xpath = "//button[@class='wd-modal-btn editvariant cursor-pointer underline']")
    WebElement editCartbtn;

    @FindBy(xpath = "//span[@class='mb-4 wd-modal-btn underline']")
    WebElement saveforlaterbtn;

    @FindBy(xpath = "//span[@class='underline']")
    WebElement removebtn;

    @FindBy(name = "voucherCode")
    WebElement couponcodetxt;

    }
