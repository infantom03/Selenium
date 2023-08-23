package seleniumApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonLoginFacebook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		//loginButton.sendKeys(null);
		loginButton.sendKeys(Keys.ENTER);
	}

}
