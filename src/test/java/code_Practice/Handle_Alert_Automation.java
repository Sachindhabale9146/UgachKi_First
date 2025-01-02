package code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert_Automation {

	String url ="https://the-internet.herokuapp.com/javascript_alerts";
	String xpath_Alert = "//button[text()=\"Click for JS Alert\"]";
	String xpath_Confirm ="//button[text()=\"Click for JS Confirm\"]";
	String xpath_Prompt ="//button[text()=\"Click for JS Prompt\"]";
	
	
	@Test
	public void main() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		sleep_two_Second();
		
		WebElement Alert = driver.findElement(By.xpath(xpath_Alert));
		
		Alert.click();
		
		sleep_two_Second();
		
		String text_Alert = driver.switchTo().alert().getText();
		sleep_two_Second();
		driver.switchTo().alert().accept();
		System.out.println("Alert Msg : "+text_Alert);
		sleep_two_Second();
		WebElement success_Msg = driver.findElement(By.xpath("//*[text()=\"You successfully clicked an alert\"]"));
		boolean result =success_Msg.isDisplayed();
		
		if(result==true) {System.out.println("successfully click on alert");}
		else {System.out.println("Fail to click on alert");}
		driver.close();
	}
	
	@Test	
	public void handle_Alert_Confirm() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		sleep_two_Second();
		
		WebElement alert_Confirm = driver.findElement(By.xpath(xpath_Confirm));
		alert_Confirm.click();		
		sleep_two_Second();
		String text_Alert = driver.switchTo().alert().getText();
		System.out.println("Confirm Alert Text : "+text_Alert);
		driver.switchTo().alert().accept();
		sleep_two_Second();
		WebElement ele_msg = driver.findElement(By.xpath("//p[@id=\"result\"]"));
		String Result_msg = ele_msg.getText();
		String std_msg_Cansel = "You clicked: Cancel";
		String std_msg_Ok = "You clicked: Ok";
		if(Result_msg.equals(std_msg_Cansel)) {
			System.out.println("successfully clicked on cancel button");
		}
		else if(Result_msg.equals(std_msg_Ok)) {
			System.out.println("successfully clicked on Ok button");
		}
		else {
			System.out.println("Failed to click on Ok/Cancel button");
		}
		
		driver.close();
		
	}
	@Test
	public void prompt_Alert() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		sleep_two_Second();
		
		WebElement prompt_btn = driver.findElement(By.xpath(xpath_Prompt));
		prompt_btn.click();
		sleep_two_Second();
		driver.switchTo().alert().sendKeys("sachin madhukar dhabale");
		sleep_two_Second();
		driver.switchTo().alert().dismiss();
		
		sleep_two_Second();
		WebElement ele_msg = driver.findElement(By.xpath("//p[@id=\"result\"]"));
		String Result_msg = ele_msg.getText();
		
		String std_msg_Cansel = "You entered: sachin madhukar dhabale";
		String std_msg_null = "You entered: null";
		boolean result =Result_msg.equals(std_msg_null);
		System.out.println("result msg : "+Result_msg+"\n"+result);
		if(Result_msg.equals(std_msg_Cansel)) {
			System.out.println("text entered and successfully clicked on Ok button");
		}
		else if(Result_msg.equals(std_msg_null)) {
			System.out.println("successfully clicked on Cancel button");
		}
		else {
			System.out.println("Failed to click on Ok/Cancel button");
		}
		
		driver.close();

	}
	
	public void sleep_two_Second() {
		try {
			Thread.sleep(3000);
		}
		catch(Throwable e) {
			System.out.println("Error Print For More Understanding : " +e.getMessage());
		}
	}
	
}
