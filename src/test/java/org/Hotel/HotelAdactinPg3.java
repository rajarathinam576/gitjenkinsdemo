package org.Hotel;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAdactinPg3 extends BaseClassTestng {
	public  HotelAdactinPg3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement clickContinue;
	 public WebElement getradioButton() {
			return radioButton;
}
	 public WebElement getclickContinue() {
			return clickContinue;

	 }



}
