package org.Hotel;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAdactinPg1 extends BaseClassTestng {
	public  HotelAdactinPg1 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement login;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement loginButton;

	public WebElement getuserName() {
		return login;
	}
	public WebElement getpassword() {
	return password;
	}
	public WebElement getloginButton() {
		return loginButton;
		
	}

}
