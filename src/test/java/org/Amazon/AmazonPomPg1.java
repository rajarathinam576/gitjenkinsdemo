package org.Amazon;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPomPg1 extends BaseClassTestng {
	public  AmazonPomPg1 ( ) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@type='email']")
private WebElement userName;
@FindBy(xpath="//input[@type='submit']")
private WebElement loginButton1;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="//input[@type='submit']")
private WebElement loginButton2;
public WebElement getuserName() {
	return userName;
}
public WebElement getloginButton1() {
	return loginButton1;
}

public WebElement getpassword() {
return password;
}
public WebElement getloginButton2() {
	return loginButton2;
}



}
