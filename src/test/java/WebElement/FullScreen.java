package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl"+currenturl);
		String titleofthecurrentwebpage = driver.getTitle();
		System.out.println("titleofthecurrentwebpage"+titleofthecurrentwebpage);
//		String sorcecodeofthewebpage = driver.getPageSource();
//		System.out.println("sorcecodeofthewebpage "+sorcecodeofthewebpage);
		String handle = driver.getWindowHandle();
		System.out.println("handle "+handle);
		driver.manage().window().minimize();
		driver.close();
	}

}