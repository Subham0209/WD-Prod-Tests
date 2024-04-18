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

public class Limit_Forget_Password_AEM_Test extends TestBase {

    HomePage homepage;
    StoreLoginPage storeLoginPage;

    int n = 4;

    public Limit_Forget_Password_AEM_Test() {
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
    public void validateForgetPassword_EN_US_AEM() throws InterruptedException, IOException

    {
        ClearBrowserCache();
        Thread.sleep(2000);
        navigateToURL("https://www.westerndigital.com");
        Thread.sleep(3000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();

        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=2)
    public void validateForgetPassword_EN_GB_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-gb");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=3)
    public void validateForgetPassword_EN_IE_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-ie");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=4)
    public void validateForgetPassword_EN_SE_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-se");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=5)
    public void validateForgetPassword_EN_CA_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/en-ca");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "We received too many requests for password resets. Please wait and try again later.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=6)
    public void validateForgetPassword_FR_CA_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/fr-ca");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Nous avons reçu trop de demandes de réinitialisation de mot de passe. Veuillez patienter et réessayer plus tard.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }


    @Test(priority=7)
    public void validateForgetPassword_FR_FR_AEM() throws InterruptedException, IOException

    {

        navigateToURL("https://www.westerndigital.com/fr-fr");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Nous avons reçu trop de demandes de réinitialisation de mot de passe. Veuillez patienter et réessayer plus tard.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=8)
    public void validateForgetPassword_DE_DE_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/de-de");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Wir haben zu viele Anfragen zum Zurücksetzen des Passworts erhalten. Bitte warten Sie und versuchen Sie es später erneut.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=9)
    public void validateForgetPassword_NL_NL_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/nl-nl");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "We hebben te veel verzoeken ontvangen om het wachtwoord opnieuw in te stellen. Even geduld en probeer het later opnieuw.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=10)
    public void validateForgetPassword_PL_PL_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/pl-pl");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Otrzymaliśmy zbyt wiele próśb o zresetowanie hasła. Poczekaj i spróbuj ponownie później.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=11)
    public void validateForgetPassword_ES_ES_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/es-es");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Recibimos demasiadas solicitudes de restablecimiento de contraseña. Espere y vuelva a intentarlo más tarde.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }
    @Test(priority=12)
    public void validateForgetPassword_CS_CZ_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/cs-cz");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Obdrželi jsme příliš mnoho žádostí o resetování hesla. Počkejte prosím a zkuste to znovu později.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }
    @Test(priority=13)
    public void validateForgetPassword_EL_GR_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/el-gr");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Λάβαμε πάρα πολλά αιτήματα για επαναφορά κωδικού πρόσβασης. Περιμένετε και δοκιμάστε ξανά αργότερα.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @Test(priority=14)
    public void validateForgetPassword_IT_IT_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/it-it");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Abbiamo ricevuto troppe richieste di reimpostazione della password. Attendere e riprovare più tardi.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }
    @Test(priority=15)
    public void validateForgetPassword_DE_AT_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/de-at");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "Wir haben zu viele Anfragen zum Zurücksetzen des Passworts erhalten. Bitte warten Sie und versuchen Sie es später erneut.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }
    @Test(priority=16)
    public void validateForgetPassword_JA_JP_AEM() throws InterruptedException, IOException

    {
        navigateToURL("https://www.westerndigital.com/ja-jp");
        ClearBrowserCache();
        Thread.sleep(100000);
        for (int i = 1; i <= n; i++) {
            homepage.AEM_ForgetPassword();
            Thread.sleep(1000);
        }
        homepage.getForgetpasswordlink();
        String expectedErrorMessage = "パスワードのリセットリクエストが多すぎます。しばらく待ってから、もう一度試してください.";
        String actualErrorMessage = homepage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mismatch.");

    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

}
