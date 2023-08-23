package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisSelector {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	//Before selection
	if (checkbox.isSelected()) {
		System.out.println("Boolean True");
		System.out.println("Check unSelected True");
		System.out.println("Fail: The KeepLoggedinchebox by default even before seletion");
	}
	else
	{
		System.out.println("Boolean False");
		System.out.println("Check box - unSelected - False");
		System.out.println("Pass: The KeepLoggedInCheckBox is not by default before selection");
	}
	//after selection
	if (checkbox.isSelected()) {
		System.out.println("Boolean True");
		System.out.println("Check Selected True");
		System.out.println("Pass: The KeepLoggedinchebox is selected after seletion");
	}
	else
	{
		System.out.println("Boolean False");
		System.out.println("Check box - Selected - True");
		System.out.println("Fail: The KeepLoggedInCheckBox is not selected after selection");
	}
	driver.manage().window().minimize();
	driver.quit(); 
}
}
