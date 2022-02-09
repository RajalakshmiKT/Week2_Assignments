package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rajalakshmi231623@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("TestLeaf123");
		Thread.sleep(2000);
		String append = driver.findElement(By.xpath("//input[@value ='TestLeaf']")).getAttribute("value");
		System.out.println(append);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Boolean result = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
		if (result == true) {
			System.out.println("Is Disabled");
		}
		else {
			System.out.println("Is Enabled");
		}
	}
}



