package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Mouse_Hover_On_Element {

	static WebDriver driver;
	public Mouse_Hover_On_Element() {
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath = "//a[text()=\"Login\"]")
	static	WebElement login_button;
		@FindBy(xpath = "//input[@placeholder=\"Enter your active Email ID / Username\"]")
	static WebElement Email;
		@FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
	static WebElement pass;	
		@FindBy(xpath = "//button[text()=\"Login\"]")
	static WebElement subutton;
		@FindBy(xpath = "//span[@class=\"ni-gnb-icn ni-gnb-icn-bell\"]")
	static WebElement ganti;
		
		@Test
		public static void main() throws InterruptedException {
			
//			Mouse_Hover_On_Element dr = new Mouse_Hover_On_Element();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.naukri.com/");
			Thread.sleep(2000);
			login_button.click();
			
			Thread.sleep(2000);
			Email.sendKeys("sachindhabale9146@gmail.com");
			
			Thread.sleep(2000);
			pass.sendKeys("Sachin@123");
			
			subutton.click();
			
			Thread.sleep(3000);
			Actions a = new Actions(driver);
			Thread.sleep(3000);
			a.moveToElement(ganti).build().perform();
		}
}
