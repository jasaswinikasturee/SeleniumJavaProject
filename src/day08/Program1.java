package day08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program1 {
	
	public static void main(String[] args) throws Exception {
		
		setValue1("test1","abcabc");		
		setValue1("test","123456abc");	
	}

	private static void setValue1(String string, String string2) {
		
		
	}

	public static String getValue(String key) throws Exception
	{
		File src = new File("./application.properties");
		FileReader read = new FileReader(src);
		Properties prop =new Properties();
		prop.load(read);	
		return prop.get(key).toString();
		
	}
	
	public static void setValue(String key,String value) throws Exception
	{
		File src = new File("./application.properties");
		FileReader read = new FileReader(src);	
		Properties prop =new Properties();
		prop.load(read);	
		prop.setProperty(key, value);
		FileWriter write = new FileWriter(src);
		prop.store(write, "Test Data Uploaded in file");
	}

	

	
	}


