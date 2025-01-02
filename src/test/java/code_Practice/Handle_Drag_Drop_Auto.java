package code_Practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Handle_Drag_Drop_Auto {

	WebDriver driver;
	
	String url = "https://the-internet.herokuapp.com/drag_and_drop";
	
	@FindBy(xpath = "//div[@id=\"column-a\" and @draggable=\"true\"]")
	WebElement drag_ele_A;
	
	@FindBy(xpath = "//div[@id=\"column-b\" and @draggable=\"true\"]")
	WebElement drag_ele_B;
	
	Handle_Drag_Drop_Auto() {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@Test
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		if(this.driver==null) {
			
			this.driver =new  ChromeDriver();
		}
	}
	@Test(priority=1)
	public void launch_url() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		sleep_two_Second();
		
		Actions a = new Actions(driver);
		sleep_two_Second();
		WebElement ele_A = driver.findElement(By.xpath("//div[@id=\"column-a\" and @draggable=\"true\"]"));
		sleep_two_Second();
		WebElement ele_B = driver.findElement(By.xpath("//div[@id=\"column-b\" and @draggable=\"true\"]"));

//		a.dragAndDrop(ele_A, ele_B).perform();
//		a.clickAndHold(ele_A).moveToElement(ele_B).release().build().perform();
		
		a.dragAndDropBy(ele_A, 100, 0);
		sleep_two_Second();
	}
	public void sleep_two_Second() {
		try {
			Thread.sleep(3000);
		}
		catch(Throwable e) {
			System.out.println("Error Print For More Understanding : " +e.getMessage());
		}
	}
	@Test
	public void closed_Broser() {
		if(driver!=null) {
		driver.close();
		}
	}
}
