package seleniumApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./resource/sampleProperties.properties");
		Properties f1=new Properties();
		f1.load(file);
		WebDriver driver=new ChromeDriver();
		driver.get(f1.getProperty("url"));
	}

}
