package automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://www.google.com/search?q=Gym&rlz=1C1GCEU_en-GBIN1059IN1059&oq=GYM&gs_lcrp=EgZjaHJvbWUqDwgAEEUYOxixAxjJAxiABDIPCAAQRRg7GLEDGMkDGIAEMg0IARAAGJIDGIAEGIoFMg0IAhAAGJIDGIAEGIoFMgoIAxAAGLEDGIAEMg0IBBAuGNQCGLEDGIAEMg0IBRAuGNQCGLEDGIAEMgoIBhAAGLEDGIAEMgoIBxAAGLEDGIAEMg0ICBAAGIMBGLEDGIAEMgcICRAAGIAE0gEIMzYzMWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.name("q")).sendKeys("Gym"); // finding xpath for the text
		List<WebElement> ele = driver.findElements(By.xpath("//*[contains(text(),'Gym') or contains(text(),'gym')]"));
		WebElement g = ele.get(70);
		System.out.println(g.getText());
		System.out.println(ele.size());
		Thread.sleep(3000);
		driver.quit();
	}

}
