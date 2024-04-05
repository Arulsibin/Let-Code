package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerthandling {

	// Alert
	public static void Goalertspace(WebDriver driver) {
		
		driver.findElement(By.xpath("//a[@href='/alert']")).click();

	}

	public static void simplealert(WebDriver driver) {
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		driver.switchTo().alert().accept();
		
	}

	public static void confirmalert(WebDriver driver) {

		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		driver.switchTo().alert().dismiss();
		
	}

	public static void promptalert(WebDriver driver) {

		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("Zodiac");
		System.out.println(alert.getText());
		alert.accept();
		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		driver.navigate().back();
		
	}
}
