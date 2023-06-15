package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select dropDownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropDownSkill.selectByIndex(6);
		
		Select dropDownYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		dropDownYear.selectByValue("1966");
		
		Select dropDownMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		dropDownMonth.selectByVisibleText("June");
		
		
		
	}

}
