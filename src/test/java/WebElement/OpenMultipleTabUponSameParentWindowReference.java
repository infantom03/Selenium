package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleTabUponSameParentWindowReference {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.TAB);
}
}
