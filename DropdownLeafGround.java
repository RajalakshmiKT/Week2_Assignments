package week2.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLeafGround {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select d1=new Select(dropdown1);
		d1.selectByIndex(4);
		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select d2=new Select(dropdown2);
		d2.selectByVisibleText("Selenium");
		WebElement dropdown3= driver.findElement(By.name("dropdown3"));
		Select d3=new Select(dropdown3);
		d3.selectByValue("2");
		WebElement findElement = driver.findElement(By.xpath("(//option[text()='Select your programs']"));
		Select s=new Select(findElement);
		s.selectByVisibleText("Appium");

	}
}
