package loginFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLocator {
	@Test
	public void locator() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h2[text()='Car & bike essentials | Up to 60% off']//parent::div//following-sibling::div[@class='a-cardui-footer']//child::a[text()='See more']")).click();
		Thread.sleep(7000);
		System.out.println("Title is :" + driver.getTitle() );
		
		driver.close();

	}
}
