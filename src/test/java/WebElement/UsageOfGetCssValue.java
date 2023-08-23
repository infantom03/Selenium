package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
    WebElement username = driver.findElement(By.id("email"));
    String fontsize = username.getCssValue("font-size");
    System.out.println("fontsize of username :"+fontsize);
    String fontweight = username.getCssValue("font-weight");
    System.out.println("fontweight of username :"+fontweight);
    String fontType = username.getCssValue("font-family");
    System.out.println("fontType of username :"+fontType);
    driver.manage().window().minimize();
    driver.quit();
}
}
