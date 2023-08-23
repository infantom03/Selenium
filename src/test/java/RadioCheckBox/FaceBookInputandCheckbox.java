package RadioCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookInputandCheckbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement facebookicon = driver.findElement(By.cssSelector("img[class='fb_logo _agiv img']"));
		// capture the alternative name
		String altnameoffacebook = facebookicon.getAttribute("alt");
		if (altnameoffacebook.equals("Facebook")) {
			System.out.println("Pass the facebook image alternativetext is fount and its in correct");
		} else {
			System.out.println("Fail: the facebook image alternativetext is fount and its incorrext");
		}
		List<WebElement> inputtags = driver.findElements(By.tagName("input"));
		System.out.println("Total inputtags : " + inputtags.size());
		for (WebElement input : inputtags) {
			if (input.isDisplayed()) {
				if (input.getAttribute("type").equals("text")) {
					String stringattvalue = input.getAttribute("aria-label");
					System.out.println("stringattvalue :" + stringattvalue);
				} else if (input.getAttribute("type").equals("password")) {
					String stringattvalueofpsw = input.getAttribute("aria-label");
					System.out.println("stringattvalue :" + stringattvalueofpsw);
				}
			}
		}
		List<WebElement> checkbox = driver.findElements(By.tagName("select"));
		System.out.println("Total select tag : " + checkbox.size());
		for (WebElement check : checkbox) {
			if (check.isDisplayed()) {
				if (check.getAttribute("id").equals("day")) {
					if (check.getAttribute("title").equals("Day")) {
						System.out.println("Day Pass");
					} else {
						System.out.println("Day Fail");
					}
				} else if (check.getAttribute("id").equals("month")) {
					if (check.getAttribute("title").equals("Month")) {
						System.out.println("Months pass");
					} else {
						System.out.println("Month Fail");
					}
				} else if (check.getAttribute("id").equals("year")) {
					if (check.getAttribute("title").equals("Year")) {
						System.out.println("Year pass");
					} else {
						System.out.println("Year Fail");
					}
				}
			}

		}
		driver.manage().window().minimize();
		driver.quit();
	}
}