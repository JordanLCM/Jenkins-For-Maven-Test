package autoIt_Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_Sample {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse WorkSpace\\AutoIT_Sample\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		WebElement chooseFileBtn = driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
		chooseFileBtn.click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\Upload_File.exe");
		
		Thread.sleep(2000);
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='file-submit']"));
		uploadBtn.click();

		Thread.sleep(2000);
		driver.quit();
	}
}
