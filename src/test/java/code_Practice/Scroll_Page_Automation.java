package code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Page_Automation {
	
	@Test
	public void scroll_Page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		String url = "https://the-internet.herokuapp.com/infinite_scroll";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0,1000)");
		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
//		js.executeScript("arguments[0].scrollIntoView(true)",ele_txt);
		
		Actions a = new Actions(driver);
		
		
		int count =0;
		while(count<=9) {
			Thread.sleep(3000);
//			a.sendKeys(Keys.PAGE_DOWN);
			a.sendKeys(Keys.ARROW_DOWN);
			count++;
		}
//		WebElement ele_txt = driver.findElement(By.xpath("(//div[@class=\"jscroll-inner\"]//div)[7]"));
//
//		boolean visible  = ele_txt.isDisplayed();
//		System.out.println("page visibility : "+visible);
	}
}
