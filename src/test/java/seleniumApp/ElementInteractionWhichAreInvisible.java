package seleniumApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInteractionWhichAreInvisible {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
	}
}
