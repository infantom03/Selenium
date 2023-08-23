package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorChecking {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginbutton = driver.findElement(By.name("login"));
	String loginbuttoncolor = loginbutton.getCssValue("background-color");
	System.out.println("loginbuttoncolor :"+loginbuttoncolor);
	String hexacolor = Color.fromString(loginbuttoncolor).asHex();
	System.out.println("hexacolor of login :"+hexacolor);
	driver.manage().window().minimize();
	driver.quit();
}
}
