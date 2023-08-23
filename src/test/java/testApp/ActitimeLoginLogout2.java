package testApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActitimeLoginLogout2 {
public static WebDriver driver;
public static void main(String[] args) {
	String browser="chrome";
	if (browser.equals("edge")){
		driver=new EdgeDriver();
	}
	else if (browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if (browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	
	//step no 2 pass the mainn URLal
	driver.get("https://demo.actitime.com/");
	
	String expectedloginpagetitle = "actiTIME - Login";
	System.out.println("expectedloginpagetitle ="+expectedloginpagetitle);
	String expectedloginpageURL = "login.do";
	System.out.println("expectedloginpageURL="+expectedloginpageURL);
	
	if (wait.until(ExpectedConditions.titleIs(expectedloginpagetitle))) {
		String actualloginpagetitle = driver.getTitle();
		System.out.println("actualloginpagetitle ="+actualloginpagetitle);
		System.out.println("Login page Title found and correct");
		if (wait.until(ExpectedConditions.urlContains(expectedloginpageURL))) {
			String actualloginpageURL = driver.getCurrentUrl();
			System.out.println("actualloginpageURL ="+actualloginpageURL);
			System.out.println("Login page URL found and correct");
			System.out.println("Pass login is displayed and it is verified");
	// step 03 Enter the valid username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("admin");
	// step 04 Enter the valid password
			WebElement password = driver.findElement(By.name("pwd"));
			password.sendKeys("manager");
	// step 05 click on login button
			WebElement loginButton = driver.findElement(By.id("loginButton"));
			loginButton.click();
			
			String expectedhomepagetitle = "actiTIME - Enter Time-Track";
			System.out.println("expectedhomepagetitle ="+expectedhomepagetitle);
			String expectedhomepageURL = "user/submit_tt.do";
			System.out.println("expectedhomepageURL ="+expectedhomepageURL);
			WebElement logoutoption = driver.findElement(By.id("logoutLink"));
		if (wait.until(ExpectedConditions.titleIs(expectedhomepagetitle))) {
			String actualhomepagetitle = driver.getTitle();
			System.out.println("actualhomepagetitle ="+actualhomepagetitle);
			System.out.println("Home page title found and it is correct");
		if (wait.until(ExpectedConditions.urlContains(expectedhomepageURL))) {
			String actualhomepageURL = driver.getCurrentUrl();
			System.out.println("actualhomepageURL ="+actualhomepageURL);
			System.out.println("Homepage URL found and it is correct");
		if (wait.until(ExpectedConditions.visibilityOf(logoutoption)).isDisplayed()) {
			System.out.println("Logout option is visbile");
			System.out.println("Pass: The homeage is displayed pon clicking on login button and it is verified");
		//step 06 click on logout option
			logoutoption.click();
			if (driver.getTitle().equals(expectedloginpagetitle)) {
				System.out.println("Login page title found corect after logout");
			if (driver.getCurrentUrl().contains(expectedloginpageURL)) {
				System.out.println("Login page URL found correct after logout");
				System.out.println("Pass: The Login page is displayed after logout and it is verified");
			}else {
				System.out.println("Fail : The Login page URL is found incorrect after logout");
			}
			}else {
				System.out.println("Fail : Login page title is found incorrect after logout");
			}
		}else {
			System.out.println("Fail : The logout option is not displayed");
		}
		}else {
			System.out.println("Fail : The Homepage URL is found incorrect");
		}
		}else {
			System.out.println("Fail : Homepage thitle is found incorrect");
		}
		}else {
			System.out.println("Fail : The loginn page URL is found incorrect and it is verified");
		}
	}else {
		System.out.println("Fail : The login page title is found incorret and it is verified");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
