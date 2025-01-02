package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Jenkins_ScreenShot {

	@Test
	public void takeScreenShot() throws InterruptedException {
		
		Date time = new Date();
		
		long ctime = time.getTime();
		System.out.println("this second time : "+ctime);
		
		
		
		String path = "F:\\TekeScreenShot\\JenkinsScreenshot_"+ctime+".png";
		String url = "http://localhost:8080/login";
		String driverpath = "E:\\Webdriver\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File f = new File(path);
		
		try {
			FileHandler.copy(scr, f);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("program Executed successfully.....sachin haar nahi manaychi, ladun maru pn palun nahi");
			driver.close();
		}
	}
}
