package my_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Alerts
		
		/*
		 * Alert is a small message box which displays on-screen notification to give
		 * the user some kind of information or ask for permission to perform certain
		 * kind of operation. It may be also used for warning purpose.
		 * 
		 * It has 3 types
		 * 
		 * simple Alerts (only 2 actions "accept" and read the message)
		 * confirmation alert
		 * prompt alert
		 */
		
		// simple alert example
		
		WebElement simple_alert = driver.findElementByXPath("(//button[text()='Click me!'])[1]");
		simple_alert.click();
		
		// Alert is an interface
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		// read the message using .getText() method
		
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		// accept the alert using .accept() method
		alert.accept();
		
		
		// confirmation alert
		
		WebElement confirmation_alert = driver.findElementByXPath("(//button[text()='Click me!'])[2]");
		confirmation_alert.click();
		
		//String text = driver.switchTo().alert().getText();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert2.dismiss();
		
		WebElement result = driver.findElementById("confirm-demo");
		System.out.println(result.getText());
		
		
		
		// prompt box
		
		WebElement prompt_box = driver.findElementByXPath("//button[text()='Click for Prompt Box']");
		prompt_box.click();
		
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);

		alert3.sendKeys("ramprasa");
		Thread.sleep(3000);

		alert3.accept();
		
		
		
		
		

	}

}
