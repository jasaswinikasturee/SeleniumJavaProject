package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getWindowHandles());//id1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
		System.out.println(driver.getWindowHandles());//[id1,id2]
		System.out.println(driver.getWindowHandle());//current page id
		
		for(String id:driver.getWindowHandles())
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("https://resume.naukri.com/"))
			{
				System.out.println(driver.getWindowHandle());
				driver.findElement(By.xpath("//a[@id='login']")).click();
				
				Thread.sleep(5000);
				
				
				if(driver.findElement(By.xpath("//div[@id='iFrameHolder']")).isDisplayed())
				{
					driver.findElement(By.xpath("//div[@class='closeBot']")).click();
				}
				
				driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("test@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("test@123");
				driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
			}
		}

	}

}
