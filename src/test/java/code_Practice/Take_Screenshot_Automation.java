package code_Practice;

import java.io.File;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshot_Automation {
	
	@Test
	public void takeScreenshot() {
		WebDriverManager.chromedriver().setup();
		Random r = new Random();
		long n = r.nextLong(100);
		
		Date d = new Date();
		long a = d.getTime();
		String save_path ="F:\\TekeScreenShot\\screenshot_"+n+".png";
		String url = "https://the-internet.herokuapp.com/drag_and_drop";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		 File store = tk.getScreenshotAs(OutputType.FILE);
		 
		 File f = new File(save_path);
		 try {
		 FileHandler.copy(store, f);
		 }
		 catch(Throwable e){
			 e.printStackTrace();
		 }finally {
			 driver.close();
		 }
	}
}
