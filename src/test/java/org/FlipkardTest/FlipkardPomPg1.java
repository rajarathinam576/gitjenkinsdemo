package org.FlipkardTest;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkardPomPg1 extends BaseClassTestng{
 public FlipkardPomPg1 () {
	 PageFactory.initElements(driver, this);
	 
 }
 @FindBy(xpath="//input[@type='text']")
 private WebElement searchProduct;
 @FindBy(xpath="//button[@type='submit']")
 private WebElement searchButton;
 public WebElement getsearchProduct() {
		return searchProduct;
	}
 public WebElement getsearchButton() {
		return searchButton;
	}

 
 
 
}
