package WebElement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowHandleit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://selenium.com/");
	//String url = driver.getCurrentUrl();
	//System.out.println(url);
	Set<String> allwindowid = driver.getWindowHandles();
	System.out.println(allwindowid);
	for (String windowid : allwindowid) {
		String actualurl = driver.switchTo().window(windowid).getCurrentUrl();
		if (actualurl.equals("https://www.youtube.com/")) {
			System.out.println(driver.getTitle());
		}
		else if(actualurl.equals("https://selenium.com/"));{
			driver.close();
	}
}
}
}