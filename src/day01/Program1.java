package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		

		WebDriver driver; //calling selenium in program
		driver = new ChromeDriver(); //download driver and open your browser
		driver.get("https://www.flipkart.com"); //open application---URL Application

	   // driver.manage().window().maximize();
	   
		//driver.manage().window().minimize();
	   
		//driver.manage().window().fullscreen();
	   
		/*
	     driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().forward();
	    */
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	
	}

}
