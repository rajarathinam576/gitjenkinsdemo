package org.Hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.Base.BaseClassTestng;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelAdactin extends BaseClassTestng {
	static WebElement userName;
	static WebElement password;
	static WebElement loginButton;
	static Workbook workBook;
	 static String name;
	 static PageManagerHotel managerAdactin;
@BeforeClass

public static void initialSetup() throws IOException {
	browser("chrome");
        windowMax();
	loadUrl("https://adactinhotelapp.com/");
	managerAdactin =new PageManagerHotel();
	
	
//AdactinPomPg1 login1 =new AdactinPomPg1();

	
FileInputStream fileInputStream = accessFileStream("C:\\Users\\Hp\\eclipse-workspace\\"
		+ "MavenProject\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");

workBook = accessWorkBook("xlsx",fileInputStream);

}

@AfterMethod
public void afterTestCase() throws  IOException {
	screenshot(new File("C:\\Users\\Hp\\eclipse-workspace\\"
			+ "MavenProject\\target\\"+name+".png"));
}
@AfterClass
public void tc5() {
quit();
}
@Test
	
	public void  tc1 () {
		
		name="hotel1";
		HotelAdactinPg1 login = managerAdactin.getLogin();
		userName = login.getuserName();
		  password = login.getpassword();
		  loginButton = login.getloginButton();
		
		String sheet = retriveDataFromSheet(workBook, "sheet1", 0, 1);
		passValue(userName, sheet);
		String sheet2 = retriveDataFromSheet(workBook, "sheet1", 1, 1);
			 passValue(password, sheet2);
			 Click(loginButton);
			 WebElement element = findingElement("name","username_show");
			 String attributeValue = getAttributeValue(element, "value");
			 Assert.assertEquals("Hello raju7002!",attributeValue);
			System.out.println("page load correctly");
	}
	@Test
	public void  tc2 () {
		
        name="hotel2";
		//AdactinPomPg2 searchHotel = new AdactinPomPg2();
        HotelAdactinPg2 searchHotel = managerAdactin.getsearchHotel();
		WebElement getlocation = searchHotel.getlocation();
		dropDownValue("Brisbane",getlocation);
		WebElement gethotel = searchHotel.gethotel();
		dropDownValue("Hotel Hervey",gethotel);
		WebElement getroomType = searchHotel.getroomType();
		dropDownValue("Super Deluxe", getroomType);
		WebElement getroomNo = searchHotel.getroomNo();
		dropDownValue("2", getroomNo);
		String retriveDataFromSheet = retriveDataFromSheet(workBook, "sheet1", 0,2);
		searchHotel.getcheckIn().sendKeys(retriveDataFromSheet);
		WebElement getadultRoom = searchHotel.getadultRoom();
		dropDownValue("1",getadultRoom);
		WebElement getchildRoom = searchHotel.getchildRoom();
		dropDownValue("0", getchildRoom);
		WebElement getsumitButton =searchHotel.getsumitButton();
		Click(getsumitButton);
	}
	@Test
	public void  tc3 () {
		name="hotel3";
		
		HotelAdactinPg3 getselectHotel = managerAdactin.getselectHotel();
		WebElement getradioButton = getselectHotel.getradioButton();
		Click(getradioButton);
		WebElement getclickContinue = getselectHotel.getclickContinue();
		Click(getclickContinue);
	}
	@Test
	public void  tc4 () throws InterruptedException {
		name="hotel3";
		
		//AdactinPomPg4 adactinPagefour = new AdactinPomPg4();
		HotelAdactinPg4 getbookHotel = managerAdactin.getbookHotel();
		String Sheet1 = retriveDataFromSheet(workBook, "sheet1", 3, 0);
		WebElement firstName = getbookHotel.getfirstName();
		passValue(firstName, Sheet1);
		String Sheetdata2 = retriveDataFromSheet(workBook, "Sheet1", 3, 1);
		WebElement lastName = getbookHotel.getlastName();
		passValue(lastName,Sheetdata2);
		String DataFromSheet1 = retriveDataFromSheet(workBook, "Sheet1", 4, 0);
		WebElement address = getbookHotel.getaddress();
		passValue(address, DataFromSheet1);
		String DataFromSheet2 = retriveDataFromSheet(workBook, "Sheet1", 5, 0);
		WebElement creditCard = getbookHotel.getcreditCard();
		passValue(creditCard, DataFromSheet2);
		String DataFromSheet3 = retriveDataFromSheet(workBook, "Sheet1", 5, 1);
		WebElement creditCardType = getbookHotel.getcreditCardType();
		passValue(creditCardType, DataFromSheet3);
		String DataFromSheet4 = retriveDataFromSheet(workBook, "Sheet1", 6, 0);
		WebElement creditCardExpMon = getbookHotel.getcreditCardExpMon();
		passValue(creditCardExpMon, DataFromSheet4);
		String DataFromSheet5 = retriveDataFromSheet(workBook, "Sheet1", 6,1);
		WebElement creditCardExpYear = getbookHotel.getcreditCardExpYear();
		passValue(creditCardExpYear, DataFromSheet5);
		String DataFromSheet6 = retriveDataFromSheet(workBook, "Sheet1", 4,1);
		WebElement creditCardCvv = getbookHotel.getcreditCardCvv();
		passValue(creditCardCvv, DataFromSheet6);
		WebElement bookNowButton = getbookHotel.getbookNowButton();
		Click(bookNowButton);
		Thread.sleep(5000);
		WebElement findingElement = findingElement("xpath","//input[@name='order_no']");
		String attributeValue = getAttributeValue(findingElement, "value");
		System.out.println(attributeValue);
	}

}
