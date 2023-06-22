package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		Actions action= new Actions(driver);
		WebElement  src;
		src= driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
		
		action.moveToElement(src).build().perform();
		

	}

}
