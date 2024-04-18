package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.devtools.v111.page.Page.navigate;

public class ProductLandingPage extends TestBase {

    int temp = 0;
    public ProductLandingPage() {

        PageFactory.initElements(driver, this);


    }


    @FindBy(xpath = "//button[normalize-space()='Products']")
    WebElement Product;

    @FindBy(xpath = "//a[@aria-label='See All Products']")
    WebElement SeeAllProductLink;

    // ELements of Categories

    @FindBy(xpath = "//a[normalize-space()='Solid State Drives (SSD)']")
    WebElement SSDLink;

    @FindBy(xpath = "//button[@aria-label='Close button']")
    WebElement closebutton;

    @FindBy(xpath = "//span[normalize-space()='NEXT']")
    WebElement nextpagenumber;

    @FindBy(xpath = "//a[normalize-space()='Hard Drives (HDD)']")
    WebElement HDDLink;

    @FindBy(xpath = "(//a[normalize-space()='USB Flash Drives'])[2]")
    WebElement USBLink;

    @FindBy(xpath = "(//a[normalize-space()='Memory Cards'])[2]")
    WebElement MemoryCardsLink;

    @FindBy(xpath = "(//a[normalize-space()='Data Center Storage'])[3]")
    WebElement DataStorageLink;

    @FindBy(xpath = "(//a[normalize-space()='Network Attached Storage (NAS)'])[2]")
    WebElement NASLink;

    @FindBy(xpath = "(//a[normalize-space()='Embedded Flash'])[3]")
    WebElement EMFlashLink;

    @FindBy(xpath = "(//a[normalize-space()='Accessories'])[2]")
    WebElement accessorieslink;

    //Sorting Element

    @FindBy(xpath = "//select[@aria-label='Sort By']")
    WebElement sort;

    @FindBy(xpath = "//option[@value='name-asc']")
    WebElement ascending_sort;

    @FindBy(xpath = "//option[@value='name-desc']")
    WebElement descending_sort;

    @FindBy(xpath = "//option[@value='price-asc']")
    WebElement price_ascending;

    @FindBy(xpath = "//option[@value='price-desc']")
    WebElement price_descending;

    @FindBy(xpath = "//a[normalize-space()='Shop by Brand']")
    WebElement shop_by_brand_link;

    @FindBy(xpath = "//a[normalize-space()='Shop by Use Case']")
    WebElement shop_by_Use_Case_link;

    @FindBy(xpath = "//a[normalize-space()='Shop by Featured']")
    WebElement shop_by_featured_link;

    //Filters

    @FindBy(xpath = "//span[normalize-space()='Brand']")
    WebElement brand;

    @FindBy(xpath = "//span[normalize-space()='Capacity Range']")
    WebElement capacity_range;

    @FindBy(xpath = "//span[normalize-space()='Device']")
    WebElement device;

    @FindBy(xpath = "//span[normalize-space()='Form Factor']")
    WebElement form_factor;

    @FindBy(xpath = "//span[normalize-space()='Use Case']")
    WebElement use_case;

    @FindBy(xpath = "//span[normalize-space()='Color']")
    WebElement color;

    @FindBy(xpath = "//span[normalize-space()='Connector Type']")
    WebElement connector_type;

    @FindBy(xpath = "//span[normalize-space()='Price']")
    WebElement price;

    @FindBy(xpath = "//a[@class=\"flex flex-col h-auto\"]")
    List <WebElement> productsinplp;


    public void PageLoadDownwards() throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        nextpagenumber.click();
        Thread.sleep(8000);


    }

    public void CLPPage_SSD() throws InterruptedException {


        Product.click();
        Thread.sleep(2000);
        //closebutton.click();
        SeeAllProductLink.click();
        SSDLink.click();
        Thread.sleep(5000);
        PageLoadDownwards();
        PageLoadDownwards();
        PageLoadDownwards();
        PageLoadDownwards();


    }

    public void CLPPage_HDD() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        //closebutton.click();
        HDDLink.click();
        Thread.sleep(5000);
        PageLoadDownwards();
        PageLoadDownwards();
        PageLoadDownwards();
        PageLoadDownwards();
    }

    public void CLPPage_USB() throws InterruptedException {
        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
       //closebutton.click();
        USBLink.click();
        Thread.sleep(5000);
        PageLoadDownwards();

    }

    public void CLPPage_MemoryCards() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        //closebutton.click();
        MemoryCardsLink.click();
        Thread.sleep(5000);
        PageLoadDownwards();

    }

    public void CLPPage_DataStorage() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
       // closebutton.click();
        DataStorageLink.click();
        Thread.sleep(5000);
        PageLoadDownwards();

    }

    public void CLPPage_NAS() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
       // closebutton.click();
        NASLink.click();
        Thread.sleep(5000);
        //PageLoadDownwards();

    }

    public void CLPPage_EmbeddedFlash() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
       // closebutton.click();
        EMFlashLink.click();
        Thread.sleep(5000);
        //PageLoadDownwards();

    }

    public void CLPPage_Accessories() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
      //  closebutton.click();
        accessorieslink.click();
        Thread.sleep(5000);
        PageLoadDownwards();

    }

    public void CLP_Sorting_Ascend() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        sort.click();
        ascending_sort.click();
        Thread.sleep(8000);

    }
    public void CLP_Sorting_Descend() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        Thread.sleep(2000);
        sort.click();
        descending_sort.click();
        Thread.sleep(8000);


    }

    public void CLP_Price_Sorting_Ascend() throws InterruptedException {

        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        Thread.sleep(2000);
        sort.click();
        price_ascending.click();
        Thread.sleep(8000);

    }

    public void CLP_Price_Sorting_Descend() throws InterruptedException {
        Thread.sleep(2000);
        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        Thread.sleep(2000);
        sort.click();
        price_descending.click();
        Thread.sleep(8000);


    }

    public void validateproductsinplp() throws InterruptedException {


        Product.click();
        Thread.sleep(2000);
        SeeAllProductLink.click();
        Thread.sleep(2000);

       int count = 0;
            for (int i = 1; i <= productsinplp.size();i++)
            {
                driver.findElement(By.xpath("(//a[@class=\"flex flex-col h-auto\"])["+String.valueOf(i)+"]")).click();
                Thread.sleep(5000);
                count++;
                driver.navigate().back();
                Thread.sleep(5000);

            }

        int expectedProductCount = productsinplp.size();
        int actualProductCount = count;

        Assert.assertEquals(actualProductCount, expectedProductCount, (actualProductCount));
        }

        public void navigatetopdp() throws InterruptedException {
            Product.click();
            Thread.sleep(2000);
            SeeAllProductLink.click();
            Thread.sleep(2000);

            for (int i = 1; i <= productsinplp.size();i++)
            {
                driver.findElement(By.xpath("(//a[@class=\"flex flex-col h-auto\"])["+String.valueOf(i)+"]")).click();
                Thread.sleep(5000);
                break;

            }


        }



    }

