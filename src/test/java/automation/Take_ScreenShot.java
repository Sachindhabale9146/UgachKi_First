package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_ScreenShot {

	static String path = "F:\\TekeScreenShot\\youtube.png";
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		TakesScreenshot sc = (TakesScreenshot)driver;

		File store = sc.getScreenshotAs(OutputType.FILE);

		File f = new File(path);
		
		try {
			FileHandler.copy(store, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

	public static void take_ScreenShot() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TakesScreenshot sc = (TakesScreenshot)driver;

		File store = sc.getScreenshotAs(OutputType.FILE);

		File f = new File(path);

	}
}
