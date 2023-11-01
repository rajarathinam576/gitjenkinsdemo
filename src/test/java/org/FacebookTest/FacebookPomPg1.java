package org.FacebookTest;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPomPg1 extends BaseClassTestng {
	public  FacebookPomPg1() {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="email")
	private WebElement userName;

	@FindBy(id="pass")
	private WebElement password;

	@FindBy(name="login")
	private WebElement loginButton;
	
public WebElement getuserName() {
			return userName;
			
		}
		public WebElement getpassword() {
	return password;
	}
		public WebElement getloginButton() {
			return loginButton;
			
		}
		
}
