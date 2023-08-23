package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithGetTexted {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement tagname = driver.findElement(By.xpath("//div[@class='_6ltj']"));
	String tagnameofdiv = tagname.getText();
	System.out.println("tagnameofdiv :"+tagnameofdiv);
	driver.manage().window().minimize();
	driver.quit();
}
}
