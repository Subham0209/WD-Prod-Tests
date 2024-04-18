package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage extends TestBase{

    public ProductDisplayPage() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(className= "addToCartBtn")
    WebElement addToCartbtn;

    @FindBy(xpath = "//a[text()='#specifications']")
    WebElement specslink;

    @FindBy(xpath="//a[text()='#resources']")
    WebElement resourcelink;

    @FindBy(xpath="//a[text()='#disclosures']")
    WebElement disclosurelink;

    @FindBy(xpath = "//button[@aria-label='Decrease the quantity']")
    WebElement qtydecrease;

    @FindBy(xpath = "//button[@aria-label='Increase the quantity']")
    WebElement qtyincrease;

    @FindBy(xpath = "//span[@aria-hidden='true']")
    WebElement priceofelementinpdp;

    @FindBy(xpath = "//input[@name='Data Recovery Plan - 2 Year']")
    WebElement dataservicecheckbox2yr;

    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement service;

    @FindBy(xpath = "//input[@name='Data Recovery Plan - 3 Year']")
    WebElement dataservicecheckbox3yr;

    // This element is for the Mini-Cart Add to Cart button when User clicks Add to Cart from PDP Page and view the Mini-Cart
    @FindBy(xpath = "//a[aria-label='View Shopping Cart']")
    WebElement viewcartbutton;

    @FindBy(xpath = "//button[aria-label='No Thanks']")
    WebElement nothanksbutton;

    @FindBy(xpath = "//button[aria-label='Upgrade']")
    WebElement upgradebutton;

    @FindBy(xpath = "//a[@aria-label='Checkout Cart']")
    WebElement checkoutbtn;

    // This is the Cart Icon in the Header of the Page
    @FindBy(xpath = "//div[@class='hidden newCartIcon']")
    WebElement carticon;

    @FindBy(xpath = "//button[@aria-label='close cart']")
    WebElement closecartbtn;

    public void addtoCartfrompdp() throws InterruptedException {
        Thread.sleep(2000);
        addToCartbtn.click();
    }

    public void closecart()
    {
        closecartbtn.click();
    }

    public void AddDataRecovery()
    {
        //dataservicecheckbox2yr.click();
        service.click();
    }

    public void AddToCart()
    {
        viewcartbutton.click();
    }





}
