package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingclass {
	WebDriver driver;
	@Test
	public void m() {
		System.out.println("good");
		WebDriverManager.chromedriver().setup(); 
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("minhaz");
	}
}
