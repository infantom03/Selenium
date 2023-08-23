package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemwithGetText {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgotpassword = driver.findElement(By.xpath("//div[@class='_6ltj']"));
		String subtext = forgotpassword.getText();
		System.out.println(subtext);
		driver.manage().window().minimize();
		driver.quit();
	}
}
