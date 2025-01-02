package code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_Automation {

	@Test
	public void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(frame);
		String xpath = "//div[@id=\"blue\"]//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]";
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(xpath));
		Thread.sleep(3000);
		a.clickAndHold(ele).moveByOffset(342, 550).build().perform();
		
	}
}
