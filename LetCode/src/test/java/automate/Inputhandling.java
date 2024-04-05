package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inputhandling {

	public static void Goinputspace(WebDriver driver) {

		driver.findElement(By.xpath("//a[@href='/edit']")).click();
	}

	public static void Input(WebDriver driver, String name) throws InterruptedException {

		// Enter name
		System.out.println(driver.findElement(By.xpath("(//label[@for='name'])[1]")).getText());
		WebElement username = driver.findElement(By.xpath("//input[@id='fullName']"));
		username.sendKeys(name);
		System.out.println(username.getAttribute("value"));

		// Enter text and Tab key
		driver.findElement(By.xpath("//input[@id='join']")).sendKeys("What about You", Keys.TAB);

		// Get text field attribute
		String Attribute = driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("Value");
		System.out.println(Attribute);

		// Clear text
		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();

		// Enable button
		boolean isEdit = driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		System.out.println(isEdit);
		
		driver.navigate().back();
		
		
	}

}