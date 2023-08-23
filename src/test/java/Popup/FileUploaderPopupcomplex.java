package Popup;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploaderPopupcomplex {
public static void main(String[] args) throws Throwable {
	//Store the file address ln the string container
	String addresstoconsider = "C:\\Users\\US\\Documents\\Infantom.resume.docx\\";
	//create the object forstrinngselectionn calss with the file path
	StringSelection fileContect = new StringSelection(addresstoconsider);
	//initialize the TOOLKIT
	Toolkit initializedToolkit = Toolkit.getDefaultToolkit();
	//Get the Access of clip board present in the tool kit
	Clipboard clipboard = initializedToolkit.getSystemClipboard();
	//transfer the content to the clip board virtually during run time
	clipboard.setContents(fileContect, null);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.foundit.in/seeker/registration");
	WebElement fileUploadButton = driver.findElement
			(By.xpath("//input[@type='file']/preceding-sibling::div[@class='contentTitle']"));
	fileUploadButton.click();
	Thread.sleep(2000);
	//create the object Robot
	Robot robot = new Robot();
	//paste the address
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);;
}
}
