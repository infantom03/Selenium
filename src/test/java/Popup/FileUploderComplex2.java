package Popup;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploderComplex2 {
public static void main(String[] args) {
	//pass the url in the system in the form of string
	String filelocation="C:\\Users\\US\\Documents\\Infantom.resume.docx\\";
	//create the object for stringselection class with the file path
	StringSelection filecontent=new StringSelection(filelocation);
	//initilize the Toolkit
	Toolkit initilizetoolkit = Toolkit.getDefaultToolkit();
	//get the access of clipbord
	Clipboard clipBoard = initilizetoolkit.getSystemClipboard();
	clipBoard.setContents(filecontent, null);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.foundit.in/seeker/registration");
	WebElement resumeupload = driver.findElement(By.xpath("//input[@type='file']/preceding-sibling::div[@class='contentTitle']"));
	resumeupload.click();
	
}
}
