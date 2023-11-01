package org.FacebookTest;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPomPg2 extends BaseClassTestng  {
public FacebookPomPg2 () {
	PageFactory.initElements(driver,this);
	
}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newAccount;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	@FindBy(xpath="//input[@name='birthday_age']")
	private WebElement age;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUp;
	
	public WebElement getnewAccount() {
		return newAccount;
	}
	
	public WebElement getfirstName() {
		return firstName;
	}
	public WebElement getlastName() {
		return lastName;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getage() {
		return age;
	}
	public WebElement getgender() {
		return gender;
	}
	public WebElement getsignUp() {
		return signUp;
	}

	
	
}
	
	
	
	
	

