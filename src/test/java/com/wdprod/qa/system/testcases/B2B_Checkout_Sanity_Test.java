package com.wdprod.qa.system.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.HomePage;
import com.wdprod.qa.pages.StoreRegistrationPage;
import com.wdprod.qa.unit.testcases.AEM_B2B_Login_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class B2B_Checkout_Sanity_Test extends TestBase
{

    HomePage homePage;
    public B2B_Checkout_Sanity_Test() throws IOException {
        super();
        homePage = new HomePage();
    }

    @BeforeMethod
    public void beforeMethod(ITestContext context)throws IOException {
        initialization();
        homePage = new HomePage();
        setDriver(context);
        }


   @Test(priority=1)
    public void validateB2Bcheckout_EN_US() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        navigateToURL("https://www.westerndigital.com/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(10000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(10000);
        driver.get("https://www.westerndigital.com/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
       Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

        }


    /*@Test(priority=2)
    public void validateB2Bcheckout_EN_CA() throws IOException, InterruptedException {

        //navigateToURL("https://www.westerndigital.com/en-ca/");
        driver.get("https://www.westerndigital.com/en-ca/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/en-ca/store/business/checkout/multi/delivery-address/add");
        driver.findElement(By.xpath("//button[@id='shipmentAddressSubmit']/span")).click();
        driver.findElement(By.id("deliveryMethodSubmit")).click();

        driver.findElement(By.id("number")).click();
        driver.findElement(By.id("number")).clear();
        driver.findElement(By.id("number")).sendKeys("4111111111111111");
        driver.findElement(By.id("exp-month")).click();
        new Select(driver.findElement(By.id("exp-month"))).selectByVisibleText("08");
        driver.findElement(By.xpath("//option[@value='08']")).click();
        driver.findElement(By.id("exp-year")).click();
        new Select(driver.findElement(By.id("exp-year"))).selectByVisibleText("2028");
        driver.findElement(By.xpath("//option[@value='2028']")).click();
        driver.findElement(By.id("cvc")).click();
        driver.findElement(By.id("cvc")).clear();
        driver.findElement(By.id("cvc")).sendKeys("555");
        driver.findElement(By.xpath("//*[@id=\"ord-submit-btn\"]")).click();
        // driver.findElement(By.xpath("//h1")).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(7000);

    }
*/
    @Test(priority=2)
    public void validateB2Bcheckout_EN_GB() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-gb/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/en-gb/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/en-gb/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/en-gb/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();



    }
    @Test(priority=3)
    public void validateB2Bcheckout_EN_SE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-se/");
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/en-se/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/en-se/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/en-se/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }
    @Test(priority=4)
    public void validateB2Bcheckout_EN_IE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-ie/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/en-ie/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/en-ie/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/en-ie/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }
    @Test(priority=5)
    public void validateB2Bcheckout_FR_FR() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/fr-fr/");
        Thread.sleep(5000);
      //  driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/fr-fr/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/fr-fr/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/fr-fr/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();


    }

    @Test(priority=6)
    public void validateB2Bcheckout_DE_DE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/de-de/");
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/de-de/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/de-de/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/de-de/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }

    @Test(priority=7)
    public void validateB2Bcheckout_PL_PL() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/pl-pl/");
        Thread.sleep(5000);
      //  driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/pl-pl/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/pl-pl/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/pl-pl/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }

    @Test(priority=8)
    public void validateB2Bcheckout_NL_NL() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/nl-nl/");
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/nl-nl/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/nl-nl/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/nl-nl/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }

    @Test(priority=9)
    public void validateB2Bcheckout_EL_GR() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/el-gr/");
        Thread.sleep(5000);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/el-gr/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/el-gr/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/el-gr/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();

    }

    @Test(priority=10)
    public void validateB2Bcheckout_CS_CZ() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/cs-cz/");
        Thread.sleep(5000);
      //  driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/cs-cz/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/cs-cz/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/cs-cz/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();
    }

/*
    @Test(priority=11)
    public void validateB2Bcheckout_FR_CA() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/fr-ca/");
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/fr-ca/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/fr-ca/store/business/checkout/multi/delivery-address/add");
        driver.findElement(By.xpath("//button[@id='shipmentAddressSubmit']/span")).click();
        driver.findElement(By.id("deliveryMethodSubmit")).click();
        driver.findElement(By.id("number")).click();
        driver.findElement(By.id("number")).clear();
        driver.findElement(By.id("number")).sendKeys("4111111111111111");
        driver.findElement(By.id("exp-month")).click();
        new Select(driver.findElement(By.id("exp-month"))).selectByVisibleText("08");
        driver.findElement(By.xpath("//option[@value='08']")).click();
        driver.findElement(By.id("exp-year")).click();
        new Select(driver.findElement(By.id("exp-year"))).selectByVisibleText("2028");
        driver.findElement(By.xpath("//option[@value='2028']")).click();
        driver.findElement(By.id("cvc")).click();
        driver.findElement(By.id("cvc")).clear();
        driver.findElement(By.id("cvc")).sendKeys("555");
        driver.findElement(By.xpath("//*[@id=\"ord-submit-btn\"]")).click();
        // driver.findElement(By.xpath("//h1")).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(7000);
        homePage.logout();
        Thread.sleep(5000);


    }

 */

    @Test(priority=11)
    public void validateB2Bcheckout_DE_AT() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/de-at/");
        Thread.sleep(5000);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/de-at/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/de-at/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/de-at/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();


    }

    @Test(priority=12)
    public void validateB2Bcheckout_ES_ES() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/es-es/");
        Thread.sleep(5000);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        Thread.sleep(2000);
        homePage.B2BLogin();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/es-es/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/es-es/store/business/checkout/multi/delivery-address/add");
        homePage.Checkout_Steps();
        Thread.sleep(5000);
        navigateToURL("https://www.westerndigital.com/es-es/store/business/logout");
        Thread.sleep(10000);
        homePage.ClearBrowserCache();


    }

    @AfterMethod
    public void tearDown() throws IOException
    {
        driver.quit();

    }
}
