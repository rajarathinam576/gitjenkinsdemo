package org.Amazon;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPomPg2 extends BaseClassTestng {
	public  AmazonPomPg2( ) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchButton;
	@FindBy(xpath="//span[contains(text(), '5G (Sonic Black, 8GB RAM')]")
	private WebElement clickProduct;
	public WebElement getsearch() {
		return search;
	}
	public WebElement getsearchButton() {
		return searchButton;
	}
	public WebElement getclickProduct() {
		return clickProduct;
}

}
