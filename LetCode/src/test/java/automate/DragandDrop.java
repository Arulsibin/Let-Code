package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void DragAndDrop(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='/dropable']")).click();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement location = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, location).perform();
		Thread.sleep(3000);
		driver.navigate().back();
	}


	public static void DragAndDropBy(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='/draggable']")).click();
		WebElement draggable = driver.findElement(By.id("sample-box"));
		Actions a = new Actions(driver);
		int x = draggable.getLocation().getX();
		int y = draggable.getLocation().getY();
		a.dragAndDropBy(draggable,  90,  100).perform();
		Thread.sleep(3000);
		driver.navigate().back();

	}
}
