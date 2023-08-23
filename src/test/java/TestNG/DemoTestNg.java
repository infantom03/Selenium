package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestNg {
	public static WebDriver driver ;
	
	@BeforeClass
	public void preCondition() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterClass
	public void postCondtion() {
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test
	public void actiTime() {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test
	public void faceBook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("infantom03@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tcs_tom0333");
		driver.findElement(By.name("login")).submit();
	}
}
