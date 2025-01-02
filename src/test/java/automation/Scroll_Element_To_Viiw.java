package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll_Element_To_Viiw {

	@Test
	public void scrollElementIntoView() throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "E:\\\\Webdriver\\\\chromedriver_win32\\\\chromedriver.exe";
		String url = "https://www.youtube.com";
		String xpath_Search = "//form/input[@placeholder=\"Search\" and @name=\"search_query\"]";
		String xpath_Search_btn = "//button[@class=\"ytSearchboxComponentSearchButton\"]";
		String xpath_video = "//a[@title=\"काय करू बाई गं जीव हा वेडावला गोड आवाजातील सुंदर गौळण नेहाताई भोसले l kay karu bai g jiv vedavala\"]";
		
		System.setProperty(key,value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		Thread.sleep(2000);
		WebElement Search_ele = driver.findElement(By.xpath(xpath_Search));
		Search_ele.sendKeys("काय करू बाई ग जीव");
		Thread.sleep(2000);
		WebElement Search_btn_ele = driver.findElement(By.xpath(xpath_Search_btn));
		Search_btn_ele.click();
		Thread.sleep(2000);
		WebElement Video_ele = driver.findElement(By.xpath(xpath_video));
		
		
		
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		
		sc.executeScript("arguments[0].scrollIntoView(true)",Video_ele);
		
		Thread.sleep(2000);
		WebElement img_xpath = driver.findElement(By.xpath("//a[@title=\"काय करू बाई गं जीव हा वेडावला गोड आवाजातील सुंदर गौळण नेहाताई भोसले l kay karu bai g jiv vedavala\"]//ancestor::div[@id=\"dismissible\"]//a[@id=\"thumbnail\"]"));
//		sc.executeScript("arguments[0].click",img_xpath);
		img_xpath.click();
//		Actions a = new Actions(driver);
//		
//		a.doubleClick(Video_ele).perform();
		
	}
}
