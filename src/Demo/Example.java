package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/shubham/Setup/selenium/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement day1 = driver.findElement(By.id("day"));
		Select oSelect = new Select(day1);
		Thread.sleep(3000);
		oSelect.selectByIndex(21);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month_m1 = new Select(months);
		Thread.sleep(3000);
		month_m1.selectByVisibleText("June");
		
		WebElement year_y = driver.findElement(By.id("year"));
		Select year_y1 = new Select(year_y);
		Thread.sleep(3000);
		year_y1.selectByValue("1995");
		
	}	
}
