package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadtheDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		String data=".\\resource\\sampleProperties.properties";
		FileInputStream file= new FileInputStream(data);
		Properties pro = new Properties();
		
		pro.load(file);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
	}
}
