package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		 WebElement password = driver.findElement(By.name("pwd"));
		Point usernameplace = username.getLocation();
		System.out.println("usernameplace :"+usernameplace);
		int usernameXvalue = usernameplace.getX();
		System.out.println("usernameXvalue :"+usernameXvalue);
		int usernameYvalue = usernameplace.getY();
		System.out.println("usernameYvalue :"+usernameYvalue);
		Point passwordplace = password.getLocation();
		System.out.println("passwordplace :"+passwordplace);
		int passwordXvalue = passwordplace.getX();
		System.out.println("passwordXvalue :"+passwordXvalue);
		int passwordYvalue = passwordplace.getY();
		System.out.println("passwordYvalue :"+passwordYvalue);
		driver.manage().window().minimize();
		driver.quit();
	}
}
