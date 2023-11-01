package org.FlipkardTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.Base.BaseClassTestng;
import org.FacebookTest.PageManagerFb;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkard extends BaseClassTestng{
	static String name;
	static Workbook workBook;
	static PageManagerFlipkard managerFlipkard;

	@BeforeClass
	public void fk1() throws IOException {
		browser("chrome");
		windowMax();
		loadUrl("https://www.flipkart.com/");
		FileInputStream fileInputStream = accessFileStream("C:\\Users\\Hp\\eclipse-workspace\\TestNgMaven"
				+ "\\src\\test\\resources\\Data for testng.xlsx"); 
		workBook=accessWorkBook("xlsx", fileInputStream);
		managerFlipkard = new PageManagerFlipkard();
			
		}
		
		@AfterMethod
		public void fb4() throws IOException {
			screenshot(new File("C:\\Users\\Hp\\eclipse-workspace\\"
					+ "TestNgMaven\\target\\"+name+".png"));
		}
		
		@Test(priority = 1)
		public void fk3 () {
			managerFlipkard = new PageManagerFlipkard();
			 FlipkardPomPg1 search = managerFlipkard.getSearch();
			WebElement getsearchProduct = search.getsearchProduct();
			passValue(getsearchProduct, "pixel 7 pro");
			WebElement findingElement = findingElement("xpath", "//button[@class='_2KpZ6l _2doB4z']");
			try {
				 String windowHandle = driver.getWindowHandle();
					Set<String> windowHandles = driver.getWindowHandles();
					for(String window1 :windowHandles) {
						if(!window1.equals(windowHandle)) {
							driver.switchTo().window(window1);
						}
					}Click(findingElement);
			 }
				catch (Exception e) {
					
				}
			WebElement getsearchButton = search.getsearchButton();
			Click(getsearchButton);
		}
		@Test(priority = 2)
		public void fk4() throws InterruptedException {
			FlipkardProduct1 product = managerFlipkard.getProduct();
			Thread.sleep(3000);
			WebElement getselectProduct = product.getselectProduct();
			Click(getselectProduct);
			windowHandles("window");
			WebElement getselectCompare = product.getselectCompare();
			Click(getselectCompare);
		}
			@Test(priority = 3,groups = "fbprodut" )
			public void fk5() throws InterruptedException {
			FlipkardProduct2 product1 = managerFlipkard.getProduct1();
			WebElement getsearchProduct = product1.getsearchProduct();
			passValue(getsearchProduct, "onepluse 11r 5G");
			WebElement getclickProduct = product1.getclickProduct();
			Click(getclickProduct);
			Thread.sleep(2000);
			WebElement getselectProduct1 = product1.getselectProduct1();
			Click(getselectProduct1);
			windowHandles("window");
			WebElement getselectCompare1 = product1.getselectCompare1();
			Click(getselectCompare1);
			WebElement findingElement = findingElement("xpath","//span[text()='COMPARE']");
			Click(findingElement);
	
		}
}
