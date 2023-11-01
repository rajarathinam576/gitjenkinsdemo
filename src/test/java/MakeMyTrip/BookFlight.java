package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BookFlight {
@Test
public void trip1 () {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
}
}
