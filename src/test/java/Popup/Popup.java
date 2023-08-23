package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
    public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert window with ok button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3003);
		Alert alert = driver.switchTo().alert();
		System.out.println("ALert text "+alert.getText());
		
		alert.sendKeys("wlcome");
		alert.accept();
	}
}
