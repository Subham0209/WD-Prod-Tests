package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.StoreRegistrationPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2B_Registration_Test extends TestBase {

    StoreRegistrationPage storeRegistrationPage;
    List<String> emails = new ArrayList<>();
    List<String> businessname = new ArrayList<>();
    int count = -1;
    int count_bname =-1;

    public B2B_Registration_Test() throws IOException {
        super();
        storeRegistrationPage = new StoreRegistrationPage();
    }

    public List<String> getEmailData() throws IOException {
        FileInputStream file = null;
        Workbook workbook = null;
        List<String> arrayList = new ArrayList<>();
        try {
            file = new FileInputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\email_b2b.xlsx");
            workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("Sheet1");

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

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
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\email_b2b.xlsx");
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

    public List<String> getBusinessName() throws IOException {

        FileInputStream file = null;
        Workbook workbook = null;
        List<String> arrayList = new ArrayList<>();
        try {
            file = new FileInputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\businessname_b2b.xlsx");
            workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("Sheet1");

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0);
                String bname = cell.getStringCellValue();

                if (!bname.isEmpty() && !arrayList.contains(bname)) {
                    arrayList.add(bname);
                }
            }

            // Delete the used business-names from the Excel sheet
            if (!arrayList.isEmpty()) {
                Row row = sheet.getRow(0);
                Cell cell = row.getCell(0);
                cell.setCellValue(""); // Clear the value of the cell

                // Shift the remaining business-names to the top
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
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\7344755\\Desktop\\Automation\\excel\\businessname_b2b.xlsx");
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
        businessname = getBusinessName();
    }

    public String getemailaddress(int testnum)
    {
        return emails.get(testnum);
    }
    public String getBusinessName(int testbnum)
    {
        return businessname.get(testbnum);
    }

    @BeforeMethod
    public void increment_count()
    {
        count++;
        count_bname++;
    }

    @Test(priority=1)
    public void validateB2Bregistration_EN_US_Manufacturer_Integrate() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/store/registration");
        //driver.findElement(By.xpath("//div[@class='truste-icon-box']")).click();
        storeRegistrationPage.validateRegistrationb2b_01(getemailaddress(count), getBusinessName(count_bname));

    }

   @Test(priority=2)
    public void validateB2Bregistration_EN_US_Office_DataCenter() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/store/registration");
        storeRegistrationPage.validateRegistrationb2b_02(getemailaddress(count), getBusinessName(count_bname));

    }
     @Test(priority=3)
    public void validateB2Bregistration_EN_US_Reseller() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/store/registration");
        storeRegistrationPage.validateRegistrationb2b_03(getemailaddress(count), getBusinessName(count_bname));

    }

    @Test(priority=4)
    public void validateB2Bregistration_EN_CA_Manufacturer_Integrate() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/en-ca/store/registration");
        storeRegistrationPage.validateRegistrationb2b_01(getemailaddress(count), getBusinessName(count_bname));

    }

    @Test(priority=5)
    public void validateB2Bregistration_EN_CA_Office_DataCenter() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/en-ca/store/registration");
        storeRegistrationPage.validateRegistrationb2b_02(getemailaddress(count), getBusinessName(count_bname));

    }
    @Test(priority=6)
    public void validateB2Bregistration_EN_CA_Reseller() throws InterruptedException, IOException {

        navigateToURL("https://www.westerndigital.com/en-ca/store/registration");
        storeRegistrationPage.validateRegistrationb2b_03(getemailaddress(count), getBusinessName(count_bname));

    }

    @AfterClass
    public void tearDown() throws IOException
    {
        driver.quit();

    }
}
