package org.Hotel;

import org.Base.BaseClassTestng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAdactinPg2 extends BaseClassTestng{
	public  HotelAdactinPg2 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement value;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomNo;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultRoom;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childRoom;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement sumit;
	public WebElement getlocation() {
		return value;
	}
    public WebElement gethotel() {
			return hotel;
}
    public WebElement getroomType() {
		return roomType;
    }
    public WebElement getroomNo() {
		return roomNo;
    }
    public WebElement getcheckIn() {
		return checkIn;
    }
    public WebElement getcheckOut() {
		return checkOut;
    }
    public WebElement getadultRoom() {
		return adultRoom;
    }
    public WebElement getchildRoom() {
		return childRoom;
    }
    public WebElement getsumitButton() {
		return sumit;
    }


}
