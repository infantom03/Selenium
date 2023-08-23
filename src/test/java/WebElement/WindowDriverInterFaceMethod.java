package WebElement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDriverInterFaceMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		String pageurl=driver.getCurrentUrl();
		System.out.println("pageurl "+pageurl);
		if (pageurl.equals("https://www.facebook.com/signup")) {
			System.out.println("Facebook execution is pass");
		}
		else
		{
			System.out.println("FaceBook execution is fail");
		}
		String pgsrc=driver.getPageSource();
		if (pgsrc.contains("facebook")) {
			System.out.println("Facebook link is pass");
		}
		else {
			System.out.println("Facebook link is fail");
		}
		String title=driver.getTitle();
		System.out.println("title "+title);
		
		Thread.sleep(300);
		Dimension d=new Dimension(300,400);
	    driver.manage().window().setSize(d);
	     
	}
	

}
