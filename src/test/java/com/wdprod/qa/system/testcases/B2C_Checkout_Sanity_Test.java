package com.wdprod.qa.system.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.HomePage;
import com.wdprod.qa.pages.StoreRegistrationPage;
import com.wdprod.qa.unit.testcases.AEM_B2B_Login_Test;
import com.wdprod.qa.util.Email;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class B2C_Checkout_Sanity_Test extends TestBase
{

    HomePage homePage;
    public B2C_Checkout_Sanity_Test() throws IOException {
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
    public void validateB2Ccheckout_EN_US() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/store/checkout/multi/delivery-address/add");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();

    }



    @Test(priority=2)
    public void validateB2Ccheckout_EN_CA() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-ca/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/en-ca/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.className("addToCartBtn")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.westerndigital.com/en-ca/store/checkout/multi/delivery-address/add");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='shipmentAddressSubmit']/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("deliveryMethodSubmit")).click();
        Thread.sleep(3000);
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
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/en-ca/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();

    }

    @Test(priority=3)
    public void validateB2Ccheckout_EN_GB() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-gb/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/en-gb/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(10000);
        driver.get("https://www.westerndigital.com/en-gb/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/en-gb/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();




    }
    @Test(priority=4)
    public void validateB2Ccheckout_EN_SE() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/en-se/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/en-se/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/en-se/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/en-se/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }
    @Test(priority=5)
    public void validateB2Ccheckout_EN_IE() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/en-ie/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //     driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/en-ie/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/en-ie/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/en-ie/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }
    @Test(priority=6)
    public void validateB2Ccheckout_FR_FR() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/fr-fr/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //     driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/fr-fr/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/fr-fr/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/fr-fr/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }

    @Test(priority=7)
    public void validateB2Ccheckout_DE_DE() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/de-de");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //     driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/de-de/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/de-de/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/de-de/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();



    }

    @Test(priority=8)
    public void validateB2Ccheckout_PL_PL() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/pl-pl/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/pl-pl/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/pl-pl/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/pl-pl/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }

    @Test(priority=9)
    public void validateB2Ccheckout_NL_NL() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/nl-nl/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //     driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/nl-nl/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/nl-nl/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/nl-nl/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }

    @Test(priority=10)
    public void validateB2Ccheckout_EL_GR() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/el-gr/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/el-gr/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/el-gr/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/el-gr/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }

    @Test(priority=11)
    public void validateB2Ccheckout_CS_CZ() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/cs-cz/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/cs-cz/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/cs-cz/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/cs-cz/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }


    @Test(priority=12)
    public void validateB2Ccheckout_FR_CA() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/fr-ca/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/fr-ca/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/fr-ca/store/checkout/multi/delivery-address/add");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='shipmentAddressSubmit']/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("deliveryMethodSubmit")).click();
        Thread.sleep(3000);
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
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/fr-ca/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }

    @Test(priority=12)
    public void validateB2Ccheckout_DE_AT() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/de-at/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //   driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/de-at/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/de-at/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/de-at/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }
    /*
    @Test(priority=14)
    public void validateB2Ccheckout_JA_JP() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/ja-jp/");
        Thread.sleep(4000);
        homePage.Login();
        Thread.sleep(4000);
        driver.get("https://www.westerndigital.com/ja-jp/products/internal-drives/wd-red-pro-sata-hdd#WD2002FFSX");
        Thread.sleep(2000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(2000);
        driver.get("https://www.westerndigital.com/ja-jp/store/checkout/multi/delivery-address/add");
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
        Thread.sleep(7000);
        navigateToURL("https://www.westerndigital.com/ja-jp/store/logout");
        homePage.ClearBrowserCache();
        Thread.sleep(5000);
}

*/

    @Test(priority=13)
    public void validateB2Ccheckout_ES_ES() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/es-es/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/es-es/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/es-es/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/es-es/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();



    }
    @Test(priority=14)
    public void validateB2Ccheckout_IT_IT() throws IOException, InterruptedException {


        navigateToURL("https://www.westerndigital.com/it-it/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        //Thread.sleep(2000);
        homePage.Login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigateToURL("https://www.westerndigital.com/it-it/products/internal-drives/wd-red-pro-sata-hdd?sku=WD4005FFBX");
        Thread.sleep(5000);
        driver.findElement(By.className("addToCartBtn")).click();
        Thread.sleep(5000);
        driver.get("https://www.westerndigital.com/it-it/store/checkout/multi/delivery-address/add");
        Thread.sleep(2000);
        homePage.Checkout_Steps();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com/it-it/store/logout");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.ClearBrowserCache();


    }


    @AfterMethod
    public void tearDown() throws IOException, EmailException {
        //Email.sendEmail();
        driver.quit();

    }
}
