package week2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lakshmi");
        driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("rajalakshmi1993@ymail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rajalakshmi1993@ymail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("TestLeaf@123");

		WebElement day = driver.findElement(By.id("day"));
		Select ss = new Select(day);
		ss.selectByVisibleText("11");

		WebElement month = driver.findElement(By.id("month"));
		Select ss1 = new Select(month);
		ss1.selectByValue("10");

		WebElement year = driver.findElement(By.id("year"));
		Select ss2 = new Select(year);
		ss2.selectByValue("1993");

		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}

