package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadfromPropertyFile {
public static void main(String[] args) throws IOException {
 FileInputStream file=new  FileInputStream ("./resource/sampleProperties.properties");
 Properties pro=new Properties();
 pro.load(file);
 String value= pro.getProperty("browser");
 String value1 = pro.getProperty("url");
 String value2 = pro.getProperty("name");
 String value3 = pro.getProperty("password");
 System.out.println(value);
 System.out.println(value1);
 System.out.println(value2);
 System.out.println(value3);
}
}
