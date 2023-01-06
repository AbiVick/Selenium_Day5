package loginFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorExercise {
	
	@Test
	public void Locator() throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Helen')]//preceding-sibling::td/input[@type='checkbox']")).click();
		Thread.sleep(5000);
		System.out.println("Title is" + driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	
	}

}
