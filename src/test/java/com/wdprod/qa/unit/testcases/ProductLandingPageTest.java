package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.ProductLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;

public class ProductLandingPageTest extends TestBase  {

    ProductLandingPage productLandingPage;
    AEM_B2C_LoginTest loginTest;



    public ProductLandingPageTest()
    {
        super();
        productLandingPage = new ProductLandingPage();


    }

    @BeforeClass
    public void setUp(ITestContext context)
    {
        initialization();

        loginTest = new AEM_B2C_LoginTest();
        productLandingPage = new ProductLandingPage();
        setDriver(context);
    }

    @Test (priority = 1)
    public void validatePLPPageDisplay_SSD() throws InterruptedException, IOException {

        loginTest.AEMLoginTest();
        productLandingPage.CLPPage_SSD();

    }

    @Test (priority = 2)
    public void validatePLPPageDisplay_HDD() throws InterruptedException
    {
        Thread.sleep(8000);
        productLandingPage.CLPPage_HDD();
    }

    @Test (priority = 3)
    public void validatePLPPageDisplay_USB() throws InterruptedException
    {
        Thread.sleep(8000);
        productLandingPage.CLPPage_USB();
    }

    @Test (priority = 4)
    public void validatePLPPageDisplay_MemoryCards() throws InterruptedException
    {

        Thread.sleep(3000);
        productLandingPage.CLPPage_MemoryCards();
    }

    @Test (priority = 5)
    public void validatePLPPageDisplay_DataStorage() throws InterruptedException
    {

        Thread.sleep(3000);
        productLandingPage.CLPPage_DataStorage();
    }

    @Test (priority = 6)
    public void validatePLPPageDisplay_NAS() throws InterruptedException
    {

        Thread.sleep(3000);
        productLandingPage.CLPPage_NAS();
    }

    @Test (priority = 7)
    public void validatePLPPageDisplay_EmbeddedFlash() throws InterruptedException
    {

        Thread.sleep(3000);
        productLandingPage.CLPPage_EmbeddedFlash();
    }

    @Test (priority = 8)
    public void validatePLPPageDisplay_Accessories() throws InterruptedException
    {

        Thread.sleep(3000);
        productLandingPage.CLPPage_Accessories();
    }

    @Test(priority = 10)
    public void validatesortingascend() throws InterruptedException {

        Thread.sleep(3000);
        productLandingPage.CLP_Sorting_Ascend();
    }

    @Test(priority = 11)
    public void validatesortingdescend() throws InterruptedException {

        Thread.sleep(3000);
        productLandingPage.CLP_Sorting_Descend();
    }

    @Test(priority = 12)
    public void validatesortingpriceascend() throws InterruptedException {

        Thread.sleep(3000);
        productLandingPage.CLP_Price_Sorting_Ascend();
    }

    @Test(priority = 13)
    public void validatesortingpricedescend() throws InterruptedException {

        Thread.sleep(3000);
        productLandingPage.CLP_Price_Sorting_Descend();
    }

    /*@Test(priority = 14)
    public void validateproductsinplptest() throws InterruptedException{

        Thread.sleep(3000);
        productLandingPage.validateproductsinplp();
    }*/

    @Test(priority = 14)
    public void validateloadproductsinplp()
    {

    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }


}
