package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.close();
}
}
