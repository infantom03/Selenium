package Popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.runtime.model.WebDriverValue.Type;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.nationalgeographic.com/animals");
	//create one more window with the same object reference
	driver.switchTo().newWindow(WindowType.WINDOW);
	//set the size of the window
	driver.manage().window().setSize(new Dimension(100,200));
	//this new window is the child window popup
	//capture all the windows ID
	Set<String> Allwindowsid = driver.getWindowHandles();
	//iterate one window id at a time
	Thread.sleep(2000);
	for (String wid : Allwindowsid) {
	String allwindowtitle=driver.switchTo().window(wid).getTitle();
		if (allwindowtitle.equals("animals")) {
			
		}else
			driver.close();
	}
}

}
