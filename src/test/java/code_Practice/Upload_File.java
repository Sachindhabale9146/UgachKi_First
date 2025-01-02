package code_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	@Test
	public void updaload_File() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		upload.sendKeys("C:\\Users\\Admin\\Downloads\\Maven POM.pdf");
		
	}
}
