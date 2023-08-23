package seleniumApp;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsraelDoodle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		for (;;) {
			try {
				WebElement israel = driver.findElement(By.linkText("Returns Centre"));
				israel.click();
				break;
			} catch (NoSuchElementException e) {
				action.scrollByAmount(0, 300).pause(1000).build().perform();
				action.click().perform();
			}
		}
	}
}
