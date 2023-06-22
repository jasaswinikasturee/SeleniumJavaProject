package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action= new Actions(driver);
		WebElement  src;
		src= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		WebElement cpy =driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		action.contextClick(src).click(cpy).build().perform();
		
		driver.switchTo().alert().accept();

	}

}
