package my_Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        //WebElement RB1 = driver.findElementByXPath("(//input[@value='Male'])[1]");
        //RB1.click();
        
        
         List<WebElement> multiradio = driver.findElementsByName("optradio");
         int size = multiradio.size();
         
         for(int i=0;i<=size;i++)
         {
        	 multiradio.get(i).click();
         }
         
         
	}

}
