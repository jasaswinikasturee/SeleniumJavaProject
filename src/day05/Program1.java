package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions action= new Actions(driver);
		WebElement  src;
		WebElement des;
		
		src= driver.findElement(By.xpath("//li[@id='credit2']"));
		des = driver.findElement(By.xpath("//ol[@id='bank']"));
		action.dragAndDrop(src, des).build().perform();
		

		src= driver.findElement(By.xpath("//li[@id='fourth']"));
		des = driver.findElement(By.xpath("//ol[@id='amt7']"));
		action.dragAndDrop(src, des).build().perform();
		
		src= driver.findElement(By.xpath("//li[@id='credit1']"));
		des = driver.findElement(By.xpath("//ol[@id='loan']"));
		action.dragAndDrop(src, des).build().perform();

		src= driver.findElement(By.xpath("//li[@id='fourth']"));
		des = driver.findElement(By.xpath("//ol[@id='amt8']"));
		action.dragAndDrop(src, des).build().perform();

	}

}
