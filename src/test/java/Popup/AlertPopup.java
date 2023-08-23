package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	public static void main(String[] args) {
		//create a chromeDriver Option
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			driver.get("https://pib.gov.in/indexd.aspx");
		} catch (WebDriverException e) {
			String alermessage = driver.switchTo().alert().getText();
			System.out.println("alermessage" + alermessage);
			// handle the popup by clicking on ok button
			driver.switchTo().alert().accept();
		}
	}
}
