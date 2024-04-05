package activeelement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement {

	//facebook login
	public static void activelement(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement username =	driver.switchTo().activeElement();
		username.sendKeys("zodiac",Keys.TAB , "12323213",Keys.ENTER);
//		WebElement password = driver.switchTo().activeElement();
//		password.sendKeys();
		//Thread.sleep(3000);
		//driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		HandlingActiveElement.activelement(driver);
	}
	
}
