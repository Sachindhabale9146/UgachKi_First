package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukari_Page_Automation {

	@Test
	public static void fitPeo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.fitpeo.com/");
		
		Thread.sleep(9000);
		String maintab = driver.getWindowHandle();
		
		String cURL = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System.out.println("Current URL : "+cURL+ "\n" + "Web page Title : "+title);
		

		String Revenue_Loc = "//div[text()=\"Revenue Calculator\"]";
		
		WebElement Revenu_ele = driver.findElement(By.xpath(Revenue_Loc));
		
		Revenu_ele.click();
		
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		Actions a = new Actions(driver);
		js.executeScript("scrollBy(0,300)");

		String Slider_Loc = "//input";
		String Slider_Loc_Input = "//input[@aria-invalid=\"false\"]";
		Thread.sleep(2000);
		
		WebElement Slider_Ele = driver.findElement(By.xpath(Slider_Loc));
		WebElement Slider_Ele2 = driver.findElement(By.xpath(Slider_Loc_Input));
//		a.dragAndDropBy(Slider_Ele, 698, 712);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		
		String value = Slider_Ele2.getAttribute("value");
//		for string value
		String getexactvalue = "//p[text()=\"Total Individual Patient/Month\"]/following-sibling::p";
		WebElement getText = driver.findElement(By.xpath(getexactvalue));
		Thread.sleep(5000);
		String exact_value = getText.getText();
		System.out.println("Exact value get Text : " +exact_value);
		
		
		System.out.println("after scroll slider, the value of input box : "+value);
		
				
//		Thread.sleep(2000);
//		
//		Slider_Ele2.sendKeys("560");
//		Thread.sleep(9000);
//		String value2 = Slider_Ele.getAttribute("value");
//		
//		System.out.println("after set value in Input box, the value of slider : "+value2);
		
		
			}
}
