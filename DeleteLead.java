package week2.assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

		
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement findElement = driver.findElement(By.id("username"));
			findElement.sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']/../..")).click();
			Thread.sleep(2);
			String name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a[1]")).getText();
			System.out.println(name);
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a[1]")).click();
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']/../..")).click();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			
			
			
		

	}
}