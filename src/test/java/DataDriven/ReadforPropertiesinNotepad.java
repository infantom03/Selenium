package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadforPropertiesinNotepad {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./resource/sampleProperties.properties");
		Properties pro = new Properties();
		pro.load(file);
		String value = pro.getProperty("browser");
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(pro.getProperty("name"));
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(pro.getProperty("password"));
		WebElement logbutton = driver.findElement(By.id("loginButton"));
		logbutton.click();
		System.out.println(value);

	}
}
   