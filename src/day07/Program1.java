package day07;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		if(fn.isDisplayed())
		{
			fn.click();
			fn.sendKeys("test FN");
		}
		else
		{
			System.out.println("Element is not displayed..");
		}

	}

}
