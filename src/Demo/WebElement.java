package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/shubham/Setup/selenium/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 8");
		Thread.sleep(5000);
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText("ACM")).click();
		driver.navigate().to("https://shubh573.github.io/ReactJS-blog");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.quit();
	}
}
