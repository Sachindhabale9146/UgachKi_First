package code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date_Picker {

	@Test
	public void date_Picker() throws InterruptedException {
		String input_xpath = "//input[@id=\"datepicker\"]";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(3000);
		WebElement framef = driver.findElement(By.xpath("//div[@rel-title=\"Simple Date Picker\"]//iframe"));
		driver.switchTo().frame(framef);
		Thread.sleep(3000);
		WebElement input = driver.findElement(By.xpath(input_xpath));
		
		input.click();
		Thread.sleep(3000);
		WebElement nextbtn = driver.findElement(By.xpath("//a[@title=\"Next\"]"));
		
		nextbtn.click();
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.xpath("//a[text()=\"15\"]/ancestor::td"));
		date.click();
		
		driver.switchTo().defaultContent();
		
//		driver.close();
	}
}
