package RadioCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChickFbMaleRadioButton {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement clickmalebox = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
	Thread.sleep(5000);
	clickmalebox.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
//label[text()='Male']/following-sibling::input