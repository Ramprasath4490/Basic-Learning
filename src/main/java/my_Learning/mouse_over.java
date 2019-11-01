package my_Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement MO = driver.findElementById("nav-link-accountList");
		Actions Mo1 = new Actions(driver);
		Mo1.moveToElement(MO).perform();
driver.close();
	}

}
