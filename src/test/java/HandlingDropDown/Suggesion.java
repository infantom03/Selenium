package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggesion {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> options = driver.findElements(By.xpath("//ul//li[@class='sbct']"));
		System.out.println(options.size());
		for (WebElement sug : options) {
			if (sug.getText().contains("testing")) {
				sug.click();
				break;
			}
		}
	}
}
