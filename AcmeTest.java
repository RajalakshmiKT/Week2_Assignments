package week2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://acme-test.uipath.com/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("Kumar.testleaf@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("leaf@12");
	    driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.linkText("Log Out")).click();
	    driver.close();
	}
}
