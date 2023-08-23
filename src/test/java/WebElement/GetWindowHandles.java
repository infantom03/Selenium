package WebElement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	TargetLocator whatdidretirned = driver.switchTo();
	whatdidretirned.newWindow(WindowType.WINDOW);
	whatdidretirned.newWindow(WindowType.WINDOW);
	whatdidretirned.newWindow(WindowType.WINDOW);
	Set<String> allwindowid = driver.getWindowHandles();
	int countodids=allwindowid.size();
	System.out.println(countodids);
	System.out.println(allwindowid);
}
}
