package org.Amazon;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPomPg3 extends BaseClassTestng{
	public   AmazonPomPg3() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@value='Add to Cart']")
	private WebElement addCard;
	@FindBy(xpath="//input[@type='button']")
	private WebElement clickToAddCard;
	public WebElement getaddCard() {
		return addCard;
	}	
	public WebElement getclickToAddCard() {
		return clickToAddCard;
		
}

}
