package sikuli_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Sample {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse WorkSpace\\AutoIT_Sample\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		WebElement chooseFileBtn = driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
		chooseFileBtn.click();
		
//		tests done with image screenshots
		Screen s = new Screen();
		Pattern downloads = new Pattern("D:\\AutoIT_Scripts\\SikuliScreenshots\\downloads.png");
		Pattern QCimages = new Pattern("D:\\AutoIT_Scripts\\SikuliScreenshots\\qc_images.png");
		Pattern image = new Pattern("D:\\AutoIT_Scripts\\SikuliScreenshots\\image.png");
		
		s.doubleClick(downloads);
		s.doubleClick(QCimages);
		s.doubleClick(image);
		
		Thread.sleep(2000);
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='file-submit']"));
		uploadBtn.click();

		Thread.sleep(2000);
		driver.quit();
	}
}
