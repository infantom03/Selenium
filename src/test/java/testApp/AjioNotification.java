package testApp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioNotification {
public static void main(String[] args) {
	//crate the chromeOptions object
	ChromeOptions options = new ChromeOptions();
	//call the addArguments talk to the browser API
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/");
}
}
