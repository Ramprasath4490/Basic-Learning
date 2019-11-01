package my_Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement twitter = driver.findElementByLinkText("Follow On Twitter");
		twitter.click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> all_windows=new ArrayList<String>(windows);
		driver.switchTo().window(all_windows.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
