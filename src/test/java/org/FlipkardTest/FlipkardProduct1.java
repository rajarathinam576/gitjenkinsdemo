package org.FlipkardTest;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkardProduct1 extends BaseClassTestng{
 public FlipkardProduct1() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//div[contains(text(),'Google Pixel 7 Pro (Snow, 128 GB)')]")
 private WebElement selectProduct;
 @FindBy (xpath="(//div[@class='_24_Dny'])[1]")
 private WebElement selectCompare;
 public WebElement getselectProduct() {
	 return selectProduct;
 }
 public WebElement getselectCompare() {
	 return selectCompare;

}
}