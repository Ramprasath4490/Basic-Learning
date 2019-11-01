package my_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		/*To Select Dropdown ****** 3 ways to select drop down values*******/
		
		
		/* (1) SelectByVisibleText */
		
		WebElement DD = driver.findElementById("select-demo");
		Select s =new Select(DD);
		s.selectByVisibleText("Thursday");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/* (2) SelectByIndex */
		s.selectByIndex(6);
		
		/* (2) SelectByVisibleValue */
		s.selectByValue("Saturday");
		
		driver.close();
	}

}
