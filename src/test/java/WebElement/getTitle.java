package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String titlepage = driver.getTitle();
	System.out.println(titlepage);
}
}
