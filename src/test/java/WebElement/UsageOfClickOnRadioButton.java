package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickOnRadioButton {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
	maleradiobutton.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
