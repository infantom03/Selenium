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

public class BluePrintClassOfActitime {
	public static WebDriver driver;

	public static void main(String[] args) {
// Step 01: Launch the browser
		String browserName = "edge";
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
//implement implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//it will be implemented for every invocation of findElement().
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	Step 02: Pass the main URL of the application
		driver.get("https://demo.actitime.com/");
		String expectedLoginPageTitle = "actiTIME - Login";
		System.out.println("expectedLoginPageTitle = " + expectedLoginPageTitle);
		String expectedLoginPageUrlcontains = "login.do";
		System.out.println("expectedLoginPageUrlcontains = " + expectedLoginPageUrlcontains);
		if (wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))) {
			String actualLoginpageTitle = driver.getTitle();
			System.out.println("actualLoginpageTitle = " + actualLoginpageTitle);
			System.out.println("Login page Title found correct.");
			if (wait.until(ExpectedConditions.urlContains(expectedLoginPageUrlcontains))) {
				String actualLoginPageUrl = driver.getCurrentUrl();
				System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
				System.out.println("Login page Url is found correct.");
				System.out.println("Pass: Login is displayed and it is verfied");
//			Step: 03 Enter the valid username
				WebElement usernameTextField = driver.findElement(By.id("username"));
				usernameTextField.sendKeys("admin");
//			Step: 04 Enter the valid  password
				WebElement passwordTextField = driver.findElement(By.name("pwd"));
				passwordTextField.sendKeys("manager");
//			Step 05: Click on Login Button
				WebElement loginButton = driver.findElement(By.id("loginButton"));
				loginButton.click();
				String expectedHomePageTitle = "actiTIME - Enter Time-Track";
				System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
				String expectedHomePageUrlContains = "user/submit_tt.do";
				System.out.println("expectedHomePageUrlContains = " + expectedHomePageUrlContains);
				WebElement logoutLink = driver.findElement(By.id("logoutLink"));
				if (wait.until(ExpectedConditions.titleIs(expectedHomePageTitle))) {
					String actualHomePageTitle = driver.getTitle();
					System.out.println("actualHomePageTitle = " + actualHomePageTitle);
					System.out.println("HomePage title is found correct.");
					if (wait.until(ExpectedConditions.urlContains(expectedHomePageUrlContains))) {
						String actualHomePageUrl = driver.getCurrentUrl();
						System.out.println("actualHomePageUrl = " + actualHomePageUrl);
						System.out.println("Home Page URL is found correct.");
						if (wait.until(ExpectedConditions.visibilityOf(logoutLink)).isDisplayed()) {
							System.out.println("Logout Option is visible.");
							System.out.println(
									"Pass: The HomePage is displayed upon clicking on Login button and it is verified.");
//						Step 06: Click on Logout Option
							logoutLink.click();
							if (driver.getTitle().equals(expectedLoginPageTitle)) {
								System.out.println("Login Page Title is found correct after logout.");
								if (driver.getCurrentUrl().contains(expectedLoginPageUrlcontains)) {
									System.out.println("Login Page URL is found correct after logout.");
									System.out.println(
											"Pass: The Login Page is displayed after Logout and it is verified.");
								} else {
									System.out.println("Fail: The Login page URL is found incorrect after logout.");
								}
							} else {
								System.out.println("Fail: Login Page title is found Incorrect after logout.");
							}
						} else {
							System.out.println("Fail: The Logout option is not displayed.");
						}
					} else {
						System.out.println("Fail: The Home Page URL is found incorrect.");
					}
				} else {
					System.out.println("Fail: HomePage title is found incorrect.");
				}
			} else {
				System.out.println("Fail: The Login Page URL is found incorrect and it is verified.");
			}
		} else {
			System.out.println("Fail: The Login Page title is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}