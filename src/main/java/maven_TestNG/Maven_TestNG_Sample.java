package maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Maven_TestNG_Sample {

	static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse WorkSpace\\AutoIT_Sample\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void testSomething() throws InterruptedException {
		WebElement AddRemove_Elements = driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']"));
		AddRemove_Elements.click();
		Thread.sleep(1000);
		WebElement addEle = driver.findElement(By.xpath("//button[normalize-space()='Add Element']"));
		addEle.click();
		Thread.sleep(1000);
		WebElement removeEle = driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
		removeEle.click();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}