package testApp;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sam klinton");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("infantom123@gamil.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tcs_tom003");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7394720298");
//		WebElement radio = driver.findElement(By.className("//input[@id='currentCity']"));
//		
//		if (radio.isSelected()) {
//			System.out.println("outside india option is selected");
//		} else
//			System.out.println("outside india option is not selected");
//		driver.findElement(By.xpath("//input[@id='currentCity']")).sendKeys("ben");
//
//		List<WebElement> suggesition = driver.findElements(By.xpath(" //li[@aria-checked='false']//span"));
//
//		System.out.println("size of auto suggestion" + suggesition.size());
		 WebElement file = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",file);
		 
		Robot rob=new Robot();
		rob.delay(1000);
		StringSelection ss=new StringSelection("C:\\Users\\US\\Documents\\English.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
