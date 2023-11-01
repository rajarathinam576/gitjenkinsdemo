package org.Hotel;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAdactinPg4 extends BaseClassTestng{
	public  HotelAdactinPg4 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCard;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditCardType;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement creditCardExpMon;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement creditCardExpYear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement creditCardCvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookNowButton;



	public WebElement getfirstName() {
		return firstName;
	}
	public WebElement getlastName() {
		return lastName;
	}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getcreditCard() {
		return creditCard;
	}
	public WebElement getcreditCardType() {
		return creditCardType;
	}
	
	public WebElement getcreditCardExpMon() {
		return creditCardExpMon;
	}
	public WebElement getcreditCardExpYear() {
		return creditCardExpYear;
	}
	public WebElement getcreditCardCvv() {
		return creditCardCvv;
	}
	public WebElement getbookNowButton() {
		return bookNowButton;
	}

	

}
