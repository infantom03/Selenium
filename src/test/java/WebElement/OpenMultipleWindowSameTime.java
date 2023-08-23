package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleWindowSameTime {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().newWindow(WindowType.WINDOW);
	}
}
