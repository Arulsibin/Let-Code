package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	 static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException{

		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Go to work-space
		driver.findElement(By.xpath("//a[@id='testing']")).click();
		
		
		
//		Inputhandling.Goinputspace(driver);
//		Inputhandling.Input(driver, "zodiac");
//		Buttonhandling.GObuttonspace(driver);
//		Dropdownshandling.dropdowns(driver);
//		Alerthandling.Goalertspace(driver);
//		Alerthandling.simplealert(driver);
//		Alerthandling.confirmalert(driver);
//		Alerthandling.Goalertspace(driver);
//      	DragandDrop.DragAndDrop(driver);
//		DragandDrop.DragAndDropBy(driver);
//		FrameHandling.Frame(driver);
		System.out.println("Mission completed");
		driver.quit();
	}

}




//driver.findElement(By.xpath("//a[@href='/signin']")).click();
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sibin@gmail.com");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("372002");
//driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//button[@class='button is-link is-light']")).click();
//driver.findElement(By.xpath("//input[@name='fgEmail']")).sendKeys("Sibin@gmail.com");
//// driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
////Alert alert = driver.switchTo().alert();
////alert.accept();
//driver.findElement(By.xpath("//button[@class='delete']")).click();
//driver.navigate().back();

//driver.findElement(By.xpath("//button[@id='accept']")).click();
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//wait.until(ExpectedConditions.alertIsPresent());
// wait.until(ExpectedConditions.visibilityOf(element));

// simple alert
//driver.switchTo().alert().accept();
//Thread.sleep(3000);
////confirm alert
//driver.findElement(By.id("confirm")).click();
//driver.switchTo().alert().dismiss();
// prompt alert
//driver.findElement(By.id("prompt")).click();
//Alert alert = driver.switchTo().alert();
//System.out.println(alert.getText());
//alert.sendKeys("Sibin");
//alert.accept();
//String name = driver.findElement(By.id("myName")).getText();
//System.out.println(name);
