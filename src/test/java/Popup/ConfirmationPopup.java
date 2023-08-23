package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			driver.get("https://pib.gov.in/indexd.aspx");
		} catch (WebDriverException e) {
			String alertmessage = driver.switchTo().alert().getText();
			System.out.println("alertmessage " + alertmessage);
			// handle the popup by clicking on button
			driver.switchTo().alert().accept();
		}
		WebElement minOFsefence = driver.findElement(By.linkText("Ministry of Defence"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(minOFsefence).pause(2000).click(minOFsefence).build().perform();
		System.out.println("confimationMessage " + driver.switchTo().alert().getText());
		// click on cancel button
		driver.switchTo().alert().dismiss();
		actions.pause(3000).click(minOFsefence).build().perform();
		// click on ok Button
		driver.switchTo().alert().accept();
	}
}
