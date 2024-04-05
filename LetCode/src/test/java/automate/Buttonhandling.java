package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttonhandling {

	public static void GObuttonspace(WebDriver driver) {

		driver.findElement(By.xpath("//a[@href='/buttons']")).click();

		driver.findElement(By.xpath("//button[@id='home']")).click();

		driver.navigate().back();

		Point point = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("Xvalue:" +   point.getX());
		System.out.println("Yvalue:" +   point.getY());

		String color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("border-color");
		System.out.println("color:" +   color);

		Rectangle rec = driver.findElement(By.xpath("//button[@id='property']")).getRect();
		System.out.println("Button Width:" +   rec.getWidth());
		System.out.println("Button Height:" +   rec.getHeight());
//		driver.findElement(By.xpath(""));
//		WebElement Hold = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]"));
//		Hold.sendKeys(Keys.RIGHT);
		driver.navigate().back();
		driver.close();
		//driver.quit();
		
	}

}
