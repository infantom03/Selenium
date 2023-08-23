package testApp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kalki");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[text()='Kalki 2898 AD Glimpse | Prabhas | Amitabh Bachchan | Kamal Haasan | Deepika Padukone | Nag Ashwin']")).click();
		//driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Kalki 2898 AD Glimpse | Prabhas | Amitabh Bachchan | Kamal Haasan | Deepika Padukone | Nag Ashwin by Vyjayanthi Network 2 days ago 1 minute, 16 seconds 17,895,670 views']")).click();
		
	}
}
