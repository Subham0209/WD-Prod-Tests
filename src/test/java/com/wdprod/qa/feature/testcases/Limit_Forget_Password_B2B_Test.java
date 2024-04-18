package com.wdprod.qa.feature.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.HomePage;
import com.wdprod.qa.pages.StoreLoginPage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Limit_Forget_Password_B2B_Test extends TestBase {

    int n = 4;
    HomePage homepage;
    StoreLoginPage storeLoginPage;

    public Limit_Forget_Password_B2B_Test() {
        super();
        // This homepage object will be used for other classes to call Homepage Elements.
        homepage = new HomePage();
        storeLoginPage = new StoreLoginPage();

    }

    @BeforeClass
    public void beforeMethod(ITestContext context)
    {
        initialization();
        // This homepage object will be used for the same class to call Homepage Elements.
        homepage = new HomePage();
        storeLoginPage = new StoreLoginPage();
        setDriver(context); // Set the driver object in the TestBase class
    }

    @Test(priority=1)
    public void validateForgetPassword_EN_US_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/store/business/login");
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();

        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=2)
    public void validateForgetPassword_EN_GB_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-gb/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=3)
    public void validateForgetPassword_EN_IE_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-ie/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=4)
    public void validateForgetPassword_EN_SE_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-se/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=5)
    public void validateForgetPassword_EN_CA_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-ca/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=6)
    public void validateForgetPassword_FR_CA_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/fr-ca/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Nous avons reçu trop de demandes de réinitialisation de mot de passe. Veuillez patienter et réessayer plus tard.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }


    @Test(priority=7)
    public void validateForgetPassword_FR_FR_STORE_B2B() throws InterruptedException, IOException

    {

        navigateToURL("https://www.westerndigital.com/fr-fr/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Nous avons reçu trop de demandes de réinitialisation de mot de passe. Veuillez patienter et réessayer plus tard.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=8)
    public void validateForgetPassword_DE_DE_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/de-de/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Wir haben zu viele Anfragen zum Zurücksetzen des Passworts erhalten. Bitte warten Sie und versuchen Sie es später erneut.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=9)
    public void validateForgetPassword_NL_NL_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/nl-nl/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "We hebben te veel verzoeken ontvangen om het wachtwoord opnieuw in te stellen. Even geduld en probeer het later opnieuw.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=10)
    public void validateForgetPassword_PL_PL_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/pl-pl/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Otrzymaliśmy zbyt wiele próśb o zresetowanie hasła. Poczekaj i spróbuj ponownie później.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=11)
    public void validateForgetPassword_ES_ES_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/es-es/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Recibimos demasiadas solicitudes de restablecimiento de contraseña. Espere y vuelva a intentarlo más tarde.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }
    @Test(priority=12)
    public void validateForgetPassword_CS_CZ_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/cs-cz/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Obdrželi jsme příliš mnoho žádostí o resetování hesla. Počkejte prosím a zkuste to znovu později.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }
    @Test(priority=13)
    public void validateForgetPassword_EL_GR_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/el-gr/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Λάβαμε πάρα πολλά αιτήματα για επαναφορά κωδικού πρόσβασης. Περιμένετε και δοκιμάστε ξανά αργότερα.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=14)
    public void validateForgetPassword_DE_AT_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/de-at/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Wir haben zu viele Anfragen zum Zurücksetzen des Passworts erhalten. Bitte warten Sie und versuchen Sie es später erneut.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @Test(priority=15)
    public void validateForgetPassword_IT_IT_STORE_B2B() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/it-it/store/business/login");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1;i<=n;i++)
        {
            storeLoginPage.setForgetpwdlinkb2b();
            Thread.sleep(1000);

        }
        storeLoginPage.setForgetpwdlinkb2b01();
        String expectedErrorMessage = "Abbiamo ricevuto troppe richieste di reimpostazione della password. Attendere e riprovare più tardi.";
        String actualErrorMessage = storeLoginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

}
