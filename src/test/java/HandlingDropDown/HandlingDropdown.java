package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		dropDown(skill,"C");
		WebElement lang = driver.findElement(By.xpath("//select[contains(@class,'form-control ng-pristine ng-in')]"));
		dropDown(lang,"India");
		
	}
	public static void dropDown(WebElement ele,String value) {
	
		Select select=new Select(ele);
		
		List<WebElement> alloption = select.getOptions();
		for (WebElement dropdowns : alloption) {
			if (dropdowns.getText().equals(value)) {
				dropdowns.click();
				break;
		}
		
	}
}
}