package automate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling{

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// WindowHandling.Window();
		WindowHandling.Multiwindow();
		driver.quit();
	}
	public static void Window() throws InterruptedException {
		System.out.println("Mission Start");
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> WinHand = new ArrayList<String>(windowhandle);
		driver.switchTo().window(WinHand.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(WinHand.get(0));
		driver.close();
		Set<String> windowhandle1 = driver.getWindowHandles();
		WinHand.clear();
		WinHand.addAll(windowhandle1);
		driver.switchTo().window(WinHand.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println("Mission Complete");
		Thread.sleep(2000);
		driver.close();
	}
	public static void Multiwindow() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//*[@id=\"multi\"]")).click();
		Thread.sleep(2000);
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> WinHand = new ArrayList<String>(windowhandle);
		driver.switchTo().window(WinHand.get(0));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(WinHand.get(2));
		Alerthandling.simplealert(driver);
		Alerthandling.confirmalert(driver);
		Alerthandling.promptalert(driver);
		driver.switchTo().window(WinHand.get(1));
		Thread.sleep(2000);
		Dropdownshandling.dropdowns(driver);	
	}

}
