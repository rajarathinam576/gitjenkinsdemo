package org.FlipkardTest;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkardProduct2 extends BaseClassTestng {
public FlipkardProduct2() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='q']")
private WebElement searchProduct;
@FindBy(xpath="(//button[@type='submit'])[1]")
private WebElement clickProduct;

@FindBy(xpath="(//div[text()='OnePlus 11R 5G (Sonic Black, 256 GB)'])[1]")
private WebElement selectProduct;
@FindBy(xpath="(//div[@class='_24_Dny'])[1]")
private WebElement selectCompare;
public WebElement getselectProduct1() {
	 return selectProduct;
}
public WebElement getselectCompare1() {
	 return selectCompare;

}
public WebElement getsearchProduct() {
	 return searchProduct;

}
public WebElement getclickProduct() {
	 return clickProduct;
}
}