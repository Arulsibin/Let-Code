package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {

	public static void Frame(WebDriver dirver) throws InterruptedException {

		dirver.findElement(By.xpath("//a[@href='/frame']")).click();
		Thread.sleep(2000);
		WebElement uiframe = dirver.findElement(By.xpath("//iframe[@src='frameUI']"));
		dirver.switchTo().frame(uiframe);
		dirver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sibin");
		dirver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Sibin@gmail.com");
		dirver.switchTo().frame(0);
		dirver.findElement(By.xpath("//input[@name='email']")).sendKeys("arulsibin.j@gmail.com");
		dirver.switchTo().defaultContent();
		dirver.findElement(By.xpath("//a[@id='testing']")).click();
	}

}
 