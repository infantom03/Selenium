package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSettingPopup {
	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--diable-notification");  
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}
}
