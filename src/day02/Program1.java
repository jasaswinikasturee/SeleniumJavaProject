package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver; 
		driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html"); 
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("testA");
		driver.findElement(By.xpath("//input[@placeholder='Lastst Name']")).sendKeys("testB");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("chennai");
					
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	
							
	}

}
