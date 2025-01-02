package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///E:/velocityNotes/FinalNotes/Advanced_Selenium_All.pdf");
	
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.close();
	}
}
