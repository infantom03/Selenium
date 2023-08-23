package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	String currentwindowid = driver.getWindowHandle();
	System.out.println(currentwindowid);
	driver.close();
}

}
