package my_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Frame_concept {
	
		
		public static void main(String[] args) throws InterruptedException {
			
	
			System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/frame.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	
			WebElement switch_to_frame1 = driver.findElementByXPath("//iframe[@src='default.html']");
	
			driver.switchTo().frame(switch_to_frame1);
			System.out.println("switched to frame 1");
			WebElement frame_1 = driver.findElementById("Click");
			frame_1.click();
	
			
			  driver.switchTo().defaultContent();
			  
			  WebElement switch_to_frame2 =
			  driver.findElementByXPath("//iframe[@src='page.html']");
			  driver.switchTo().frame(switch_to_frame2);
			  System.out.println("switched to frame 2"); Thread.sleep(3000); WebElement
			  frame_2 = driver.findElementByXPath("//button[@id='Click1']");
			  frame_2.click();
			 
	
		}
	
	}
