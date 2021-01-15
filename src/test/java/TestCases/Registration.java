package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjects.AuthenticationPage;
import PageObjects.CreateAnAccountPage;
import PageObjects.HomePage;

public class Registration extends BaseClass {

	@Test()
	public void completeRegistraion() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getSigninLink().click();
		Thread.sleep(5000);

		AuthenticationPage ap = new AuthenticationPage(driver);
		//ap.writeEmail().sendKeys("test@testing.com");
		ap.writeEmail().sendKeys("test@testing" +generateRandomNum()+".com");
		ap.CreateAnAccount().click();
		Thread.sleep(5000);

		//* The below code is to read the data from excel
		ArrayList<String> inputData = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("F:\\Docs\\RegistrationData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int noOfSheet = workbook.getNumberOfSheets();
		for (int i = 0; i < noOfSheet; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("ValidData")) {
				XSSFSheet sheet = workbook.getSheetAt(i); // Got access to required sheet
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.iterator();
				int k = 0;
				int column = 0;

				while (cell.hasNext()) {
					Cell cellValue = cell.next();
					if (cellValue.getStringCellValue().equalsIgnoreCase("TestCaseData")) {

						while (cell.hasNext()) {
							Cell requiredCellValue = cell.next();
							if (requiredCellValue.getCellType() == CellType.STRING) {
								inputData.add(requiredCellValue.getStringCellValue());
							}

							else {
								inputData.add(NumberToTextConverter.toText(requiredCellValue.getNumericCellValue()));
								// inputData.add(requiredCellValue.getNumericCellValue());
							}

						}
						System.out.println(inputData);
						column = k;// getting the column index with this
					}

					k++;
				}
				System.out.println(column);
			}
		}
		//* The below code is to read the data from excel
		
		//entering values in account create page
		CreateAnAccountPage cap = new CreateAnAccountPage(driver);
		cap.getPhoneNumber().sendKeys(inputData.get(0));
		cap.getLastName().sendKeys(inputData.get(1));
		cap.getFirstname().sendKeys(inputData.get(2));
		cap.getPassword().sendKeys(inputData.get(3));		
		Thread.sleep(5000);
		
		cap.getAddress().sendKeys(inputData.get(4));
		cap.getCity().sendKeys(inputData.get(5));
		cap.getPostalCode().sendKeys(inputData.get(6));
		cap.getCountry().sendKeys(inputData.get(7));		
		Thread.sleep(5000);
		
		cap.getRegisterButton().click();
		Thread.sleep(5000);
		
		
	}

}
