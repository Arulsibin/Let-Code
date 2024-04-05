package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownshandling {

	public static void dropdowns(WebDriver driver) {

		//driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
		// select fruits
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select myfruits = new Select(fruits);
		myfruits.selectByIndex(3);
		String text = driver.findElement(By.className("subtitle")).getText();
		System.out.println(text);

		// select coding lang
		WebElement codelan = driver.findElement(By.id("lang"));
		Select s = new Select(codelan);
		s.selectByIndex(3);
		WebElement scode = s.getFirstSelectedOption();
		System.out.println(scode.getText());
		driver.navigate().back();

	}

	public static void multiselect(WebDriver driver) {

		driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
		WebElement superheros = driver.findElement(By.id("superheros"));
		Select mysuperhero = new Select(superheros);
		mysuperhero.selectByIndex(17);
		mysuperhero.selectByIndex(28);
		System.out.println("Task completed");

	}

}
