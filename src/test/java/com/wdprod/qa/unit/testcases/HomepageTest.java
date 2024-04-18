package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;


public class HomepageTest extends TestBase {

    HomePage homepage;
    //protected WebDriver driver;

    public HomepageTest() {
        super();
    }

    @BeforeClass
    public void setUp(ITestContext context) {
        initialization();
        homepage = new HomePage();
        setDriver(context);

    }

    @Test(priority=1)
    public void WDLogoImageTest() throws IOException {

        navigateToURL("https://www.westerndigital.com");
        boolean flag1 = homepage.validateWDLogo();
        Assert.assertTrue(flag1);

    }

    @Test(priority=2)
    public void WDHeaderTest() throws IOException {

        homepage.validateHeaders();
    }

    @AfterClass
    public void tearDown()
    {

       driver.quit();
    }

}
