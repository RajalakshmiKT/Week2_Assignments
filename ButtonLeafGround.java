package week2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X-Coordinate= "+x);
		System.out.println("Y-Coordinate= "+y);

		WebElement color = driver.findElement(By.id("color"));
		String style = color.getAttribute("style");
		System.out.println("Color of the button is " + style);

		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Height :" + height);
		System.out.println("Width :" + width);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	}

}
