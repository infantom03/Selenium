package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploderPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.foundit.in/seeker/registration");
	WebElement resumeupload = driver.findElement(By.xpath("//input[@type='file']/preceding-sibling::div[@class='contentTitle']"));
	resumeupload.click();
	resumeupload.sendKeys("C:\\Users\\US\\Documents\\Infantom.resume.docx\\");
	//if you try this way youu will get complile time error.
}
}
