package loginFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTest {

	// @Test
	public void locator() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("Page Title is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());

		List<WebElement> option = driver.findElements(By.className("has-treeview"));
		System.out.println("Options are" + option.size());
		option.get(3).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']")).click();
		Thread.sleep(6000);

		driver.findElement(By.partialLinkText("ogout")).click();
		Thread.sleep(3000);

		driver.close();

	}

	@Test
	public void locatorTest() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("Page Title is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//a[contains(@href,'#')]//child::p[contains(text(),'Customers')]")).click();;
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(@href,'/Admin/Customer/List')]//child::p[contains(text(), 'Cus')]")).click();
		Thread.sleep(6000);
		System.out.println("Page Title is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());

		driver.findElement(By.partialLinkText("ogout")).click();
		Thread.sleep(3000);

		driver.close();

	}

}
