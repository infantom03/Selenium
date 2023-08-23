package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetSize {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	  WebElement username = driver.findElement(By.id("username"));
	 WebElement password = driver.findElement(By.name("pwd"));
	 //find the both text field 
	 Dimension usernamedimention = username.getSize();
	 System.out.println("usernamedimention :"+usernamedimention);
	int usernamewidth = usernamedimention.getWidth();
	System.out.println("usernamewidth size :"+usernamewidth);
	int usernamehight = usernamedimention.getHeight();
	System.out.println("usernamehight :"+ usernamehight);
	Dimension passworddimention = password.getSize();
	System.out.println("passworddimention :"+passworddimention);
	int passwordwidhtsize = passworddimention.getWidth();
	System.out.println("passwordwidhtsize :"+passwordwidhtsize);
	int passwordHight = passworddimention.getHeight();
	System.out.println("passwordHight :" +passwordHight);
	driver.manage().window().minimize();
	//driver.quit();
}
}
