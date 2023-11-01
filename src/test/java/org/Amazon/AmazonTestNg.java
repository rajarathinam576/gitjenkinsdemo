package org.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Base.BaseClassTestng;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestNg extends BaseClassTestng {
 static PageManagerAmazon managerAmazon;
 static Workbook workBook;
 static String name;

	@BeforeClass
	public void az1 () throws IOException {
		browser("chrome");
		windowMax();
		managerAmazon=new PageManagerAmazon();
		FileInputStream fileInputStream = accessFileStream("C:\\Users\\Hp\\eclipse-workspace1\\"
				+ "TestNgMaven\\src\\test\\resources\\Data for testng.xlsx"); 
		workBook=accessWorkBook("xlsx", fileInputStream);
	}
	@BeforeMethod
	public void fb3() {
		loadUrl("https://www.amazon.in/");
		
	}
	@AfterMethod
	public void fb4() throws IOException {
		screenshot(new File("C:\\Users\\Hp\\eclipse-workspace\\"
				+ "TestNgMaven\\target\\"+name+".png"));
	}
	@AfterClass
	public void quitAmazon () {
		quit();
	}

	@Test(groups = {"search"})
	public void product() {
	     AmazonPomPg2 getsearchProduct = managerAmazon.getsearchProduct();
		WebElement getsearch = getsearchProduct.getsearch();
		passValue(getsearch, "onepluse11r");
		WebElement getsearchButton = getsearchProduct.getsearchButton();
		Click(getsearchButton);
		WebElement getclickProduct = getsearchProduct.getclickProduct();
		Click(getclickProduct);
			}
	@Test
	public void product2 () {
		AmazonPomPg3 getaddCard = managerAmazon.getaddCard();
		windowHandles("window");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		scrollDown(800, 600);
	WebElement getaddCard2 = getaddCard.getaddCard();
	    Click(getaddCard2);
	
		
	
		

		
		
		
		
	}
	
	
	
}
