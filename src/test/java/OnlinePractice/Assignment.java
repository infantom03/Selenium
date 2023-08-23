package OnlinePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Infantom");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("tom");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("hi this is infantom, i would your link to say one think to you thank you for giveing this opertunity to interduce my self");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("infantom03@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7358802213");
		System.out.println(driver.findElement(By.xpath("//input[@value='Male']")).isSelected());//false
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		//check box selection
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("checkbox3")).click();

		//dropdown
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select select = new Select(dropdown);
		select.selectByIndex(11);
		select.selectByVisibleText("Backup Management");
		System.out.println(select.getOptions().size());
		
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		
		/*WebElement country = driver.findElement(By.className("select2-selection select2-selection--single"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");
		System.out.println("size of the country"+s1.getOptions().size());
		driver.close();*/
		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		}

}
