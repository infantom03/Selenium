package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrent {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
