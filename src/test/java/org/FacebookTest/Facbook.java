package org.FacebookTest;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facbook extends BaseClassTestng {
	static WebElement userName;
	static WebElement password;
	static WebElement loginButton;
	static PageManagerFb manager;
	static String name;
	static Workbook workBook;

@BeforeClass
public void ini() throws IOException {
	browser("chrome");
	windowMax();
     manager=new PageManagerFb();
FileInputStream fileInputStream = accessFileStream("C:\\Users\\Hp\\eclipse-workspace1\\"
		+ "TestNgMaven\\src\\test\\resources\\Data for testng.xlsx"); 
workBook=accessWorkBook("xlsx", fileInputStream);
	
}

@BeforeMethod
public void fb3() {
	loadUrl("https://www.facebook.com/");
	
}
@AfterMethod
public void fb4() throws IOException {
	screenshot(new File("C:\\Users\\Hp\\eclipse-workspace\\"
			+ "TestNgMaven\\target\\"+name+".png"));
}
@AfterClass
public void quitFacebook() {
	quit();
}

@Test(priority = 2)
public void login() {
	name="loginfb";
	FacebookPomPg1 login = manager.getLogin();	
	
userName = login.getuserName();
String retriveDataFromSheet = retriveDataFromSheet(workBook, "sheet1", 0, 0);
passValue(userName, retriveDataFromSheet);
password = login.getpassword();
String retriveDataFromSheet2 = retriveDataFromSheet(workBook,"sheet1", 0, 1);
passValue(password,retriveDataFromSheet2);
loginButton = login.getloginButton();
Click(loginButton);
}
@Test(priority = 1)
public void signUp() throws InterruptedException {
	name ="sigupfb";
	FacebookPomPg2 signUp1 = manager.getSignUp();
	WebElement getnewAccount = signUp1.getnewAccount();
	Click(getnewAccount);
	Thread.sleep(2000);
WebElement getfirstName = signUp1.getfirstName();
passValue(getfirstName, "raj");
WebElement getlastName = signUp1.getlastName();
passValue(getlastName, "a");
WebElement getpassword = signUp1.getpassword();
passValue(getpassword, "euhjkh");
WebElement getgender = signUp1.getgender();
Click(getgender);
WebElement getsignUp = signUp1.getsignUp();
Click(getsignUp);
WebElement findingElement = findingElement("xpath","//div[text()='Sign Up']");
String text = findingElement.getText();
Assert.assertEquals("Sign Up", text);
}
@Test
public void password() {
	FacebookPomPg3 forgotPassword = manager.getforgotPassword();
	WebElement Password = forgotPassword.getforgotPassword();
	Click(Password);
	WebElement enterValue = forgotPassword.getenterValue();
passValue(enterValue, "4536363");
WebElement searchButton = forgotPassword.getsearchButton();
Click(searchButton);


}
}
