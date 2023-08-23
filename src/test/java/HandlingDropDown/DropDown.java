package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		
		select.selectByVisibleText("Mar");
	}
}
