package my_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selecting_multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
WebElement Element1 = driver.findElementByXPath("//option[text()='California']");
WebElement Element2 = driver.findElementByXPath("//option[text()='Florida']");

Actions a = new Actions(driver);
a.keyDown(Keys.CONTROL).click(Element1).click(Element2).keyUp(Keys.CONTROL).perform();

	}

}
