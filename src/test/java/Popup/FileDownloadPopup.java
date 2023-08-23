package Popup;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.selenium.dev/downloads/");
	WebElement seleniumdownload = driver.findElement(By.linkText("4.9.0"));
	seleniumdownload.click();
	Thread.sleep(2000);
	driver.get("chrome://downloads/");
	WebElement shadowhost1 = driver.findElement(By.tagName("downloads-manager"));
	WebElement shadowhost2 = shadowhost1.getShadowRoot().findElement(By.cssSelector("downloads-item[id='frb0']"));
	WebElement keepbutton = shadowhost2.getShadowRoot().findElement(By.cssSelector("cr-button[focus-type='save']"));
	Thread.sleep(2000);
	keepbutton.click();
	Robot	robot= new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(100);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(100);
	driver.navigate().back();
	}
}
