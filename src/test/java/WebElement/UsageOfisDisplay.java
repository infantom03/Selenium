package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisDisplay {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		List<WebElement> alldropdown = driver.findElements(By.tagName("select"));
		System.out.println(alldropdown.size());
		for (WebElement dropdown : alldropdown) {
			if (dropdown.isDisplayed()) {
				System.out.println("boolea Ture");
			} else {
				System.out.println("boolean false");
			}
		}
		driver.manage().window().minimize();
	}
}
