package com.wdprod.qa.unit.testcases;

import com.beust.ah.A;
import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.StoreRegistrationPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class B2C_Registration_Test extends TestBase {

    StoreRegistrationPage storeRegistrationPage;
    List<String> emails = new ArrayList<>();
    int count = -1;

    public B2C_Registration_Test() throws IOException {
        super();
        storeRegistrationPage = new StoreRegistrationPage();
    }

    //@DataProvider(name = "emailData")
    public List<String> getEmailData() throws IOException {

        FileInputStream file = null;
        Workbook workbook = null;
        List<String> arrayList = new ArrayList<>();
        try{
            file = new FileInputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\email_b2c.xlsx");
            workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("Sheet1");

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            //Object[][] data = new Object[rowCount][1];

            for (int i = 0; i < rowCount + 1; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0);
                String email = cell.getStringCellValue();

                if (!email.isEmpty() && !arrayList.contains(email)) {
                    arrayList.add(email);
                }
            }

            // Delete the used email address from the Excel sheet
            if (!arrayList.isEmpty()) {
                Row row = sheet.getRow(0);
                Cell cell = row.getCell(0);
                cell.setCellValue(""); // Clear the value of the cell

                // Shift the remaining email addresses to the top
                for (int i = 1; i <= rowCount; i++) {
                    Row currentRow = sheet.getRow(i);
                    Row previousRow = sheet.getRow(i - 1);
                    Cell currentCell = currentRow.getCell(0);
                    Cell previousCell = previousRow.getCell(0);
                    previousCell.setCellValue(currentCell.getStringCellValue());
                    currentCell.setCellValue(""); // Clear the value of the current cell
                }
            }

            // Save the modified Excel sheet
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\email_b2c.xlsx");
            workbook.write(outputStream);
            outputStream.close();
        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (file != null) {
                file.close();
            }
        }
        return arrayList;
    }

    @BeforeClass
    public void setUp(ITestContext context) throws IOException {
        initialization();
        storeRegistrationPage = new StoreRegistrationPage();
        setDriver(context);
        emails = getEmailData();
    }

    public String getemailaddress(int testnum)
    {
        return emails.get(testnum);
    }

    @BeforeMethod
    public void increment_count()
    {
        count++;
    }

    @Test(priority=1)
    public void validateB2Cregistration_EN_US() throws InterruptedException {


        navigateToURL("https://www.westerndigital.com/store/registration");
       // driver.findElement(By.xpath("//button[@id='truste-consent-close']")).click();
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));


    }

    @Test(priority=2)
    public void validateB2Cregistration_EN_CA() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-ca/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=3)
    public void validateB2Cregistration_EN_GB() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-gb/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }
    @Test(priority=4)
    public void validateB2Cregistration_EN_SE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-se/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }
    @Test(priority=5)
    public void validateB2Cregistration_EN_IE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/en-ie/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }
    @Test(priority=6)
    public void validateB2Cregistration_FR_FR() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/fr-fr/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=7)
    public void validateB2Cregistration_DE_DE() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/de-de/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=8)
    public void validateB2Cregistration_PL_PL() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/pl-pl/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=9)
    public void validateB2Cregistration_NL_NL() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/nl-nl/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=10)
    public void validateB2Cregistration_EL_GR() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/el-gr/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=11)
    public void validateB2Cregistration_CS_CZ() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/cs-cz/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    /*@Test(priority=12)
    public void validateB2Cregistration_JA_JP() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/ja-jp/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }

    @Test(priority=13)
    public void validateB2Cregistration_FR_CA() throws IOException, InterruptedException {

        navigateToURL("https://www.westerndigital.com/fr-ca/store/registration");
        storeRegistrationPage.validateRegistrationb2c(getemailaddress(count));

    }*/

    @AfterClass
    public void tearDown() throws IOException
    {
        driver.quit();

    }
}
