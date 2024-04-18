package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.ProductDisplayPage;
import com.wdprod.qa.pages.ProductLandingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.WatchEvent;

public class ProductDisplayPageTest extends TestBase {

    ProductDisplayPage productDisplayPage;
    AEM_B2C_LoginTest loginTest;
    ProductLandingPage productLandingPage;

    public ProductDisplayPageTest()
    {
        super();
        productDisplayPage = new ProductDisplayPage();
        productLandingPage = new ProductLandingPage();

    }

    @BeforeClass
    public void setUp(ITestContext context)
    {
        initialization();

        loginTest = new AEM_B2C_LoginTest();
        productLandingPage = new ProductLandingPage();
        productDisplayPage = new ProductDisplayPage();
        setDriver(context);
    }

    @Test(priority = 1)
    public void validatePDPageDisplay() throws InterruptedException, IOException {

        loginTest.AEMLoginTest();
        productLandingPage.navigatetopdp();
        productDisplayPage.addtoCartfrompdp();
        Thread.sleep(4000);

    }

    @Test(priority = 2)
    public void validateDataRecoveryaddtoCart() throws IOException, InterruptedException {

        productDisplayPage.closecart();
        Thread.sleep(2000);
        productDisplayPage.AddDataRecovery();
        Thread.sleep(2000);
        productDisplayPage.addtoCartfrompdp();
        Thread.sleep(4000);
        productDisplayPage.AddToCart();
        Thread.sleep(3000);

    }



    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
