package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesignSubmintCondition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement parentelement = driver.findElement(By.id("loginFormDiv"));
		WebElement signbutton = parentelement.findElement(By.cssSelector("button[class='button buttonBlue']"));
		WebElement formtag = parentelement.findElement(By.tagName("form"));
		if (formtag.getTagName().equals("form")) {
			if (signbutton.getAttribute("type").isEmpty()) {
				System.out.println("Fail att criteria is not matching...");
			}
			else if (signbutton.getAttribute("type").equals("button")) {
				signbutton.submit();
			}
			else if (signbutton.getAttribute("type").equals("input")) {
				signbutton.submit();
			}
			else
				 signbutton.click();
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
