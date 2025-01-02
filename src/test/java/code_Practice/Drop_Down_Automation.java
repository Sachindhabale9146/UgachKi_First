package code_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Automation {

	@Test
	public void drop_down() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@rel-title=\"Select Country\"]//select"));
		
	    Select s = new Select(ele);
	    
//	    s.selectByIndex(2);
	    
	    Thread.sleep(3000);
	   
	    WebElement ele1 = driver.findElement(By.xpath("//option[text()=\"Greece\"]"));
//	    s.selectByValue("Greece");
	    s.selectByVisibleText("Greece");
	    List<WebElement> list = s.getOptions();
	    System.out.println(list);
	    Thread.sleep(3000);
	    
	    driver.close();
	}
}
