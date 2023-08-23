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

public class ActitimeLoginLogout {
	public static WebDriver driver;

	public static void main(String[] args) {
		// step No 1
		String browser = "chrome";
		if (browser == "chrome") {
			driver = new ChromeDriver();
		} else if (browser == "edge") {
			driver = new EdgeDriver();
		} else if (browser == "firefox") {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		// implement implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// it will be implemented for every innvocation of findElemnt();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// step 2 pass the main URL
		driver.get("https://demo.actitime.com/login.do");

		String expectedloginpagetitle = "actiTIME - Login";
		System.out.println("expectedloginpagetitle :" + expectedloginpagetitle);

		String expectedloginpageURL = "login.do";
		System.out.println("expectedloginpageURL =" + expectedloginpageURL);
		if (wait.until(ExpectedConditions.titleIs(expectedloginpagetitle))) {
			String actualloginTitle = driver.getTitle();
			System.out.println("actualloginTitle =" + actualloginTitle);
			System.out.println("Login Page Title found Correct");
			if (wait.until(ExpectedConditions.titleIs(expectedloginpageURL))) {
				String actualloginpageURL = driver.getCurrentUrl();
				System.out.println("actualloginpageURL =" + actualloginpageURL);
				System.out.println("Login page URL found Correct");
				System.out.println("Pass:Login is displayed and it is verfied");

				// step 03 pass the user name
				WebElement usernametextfield = driver.findElement(By.id("username"));
				usernametextfield.sendKeys("admin");
				// step 04 enter the password
				WebElement passwordtextfield = driver.findElement(By.name("pwd"));
				passwordtextfield.sendKeys("manager");

				// step 05 click on login button
				WebElement loginbutton = driver.findElement(By.id("loginButton"));
				loginbutton.click();

				String expectedhomepagetitle = "actiTIME - Enter Time-Track";
				System.out.println("expectedhomepagetitle =" + expectedhomepagetitle);

				String expectedhomepageURL = "user/submit_tt.do";
				System.out.println("expectedhomepageURL =" + expectedhomepageURL);

				WebElement logoutbutton = driver.findElement(By.id("logoutLink"));
				if (wait.until(ExpectedConditions.titleIs(expectedhomepagetitle))) {
					String actualhomepagetitle = driver.getTitle();
					System.out.println("actualhomepagetitle =" + actualhomepagetitle);
					System.out.println("Home page title found correct");
					if (wait.until(ExpectedConditions.titleIs(expectedhomepageURL))) {
						String actualhomepageURL = driver.getCurrentUrl();
						System.out.println("actualhomepageURL =" + actualhomepageURL);
						System.out.println("Home page URL fouund correct");
						if (wait.until(ExpectedConditions.visibilityOf(logoutbutton)).isDisplayed()) {
							System.out.println("logout opetion is visible");
							System.out.println(
									"Pass: THe homepage is displayed upon clickig on login button and it is verified");

							// step 06 clock logout option
							logoutbutton.click();
							if (driver.getTitle().equals(expectedloginpagetitle)) {
								System.out.println("Login page title is found correct after logout");
								if (driver.getCurrentUrl().equals(expectedloginpageURL)) {
									System.out.println("login page url is found correct after logout");
									System.out.println(
											"Pass: The login page is displayed after logout and it is verified");
								} else {
									System.out.println("Fail: THe login page URl is found incorrect after logout");
								}
							} else {
								System.out.println("Fail: Login page title is found incorrect after logout");
							}
						} else {
							System.out.println("Fail: The logout option is not displayed");
						}
					} else {
						System.out.println("Fail: The home page URL is found incorrect");
					}
				} else {
					System.out.println("Fail: Homepage title is found incorrect");
				}
			} else {
				System.out.println("Fail: The loginn page URL is found incorrect and it is verified");
			}
		} else {
			System.out.println("Fail: the login page title is found incorrect and it is verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}