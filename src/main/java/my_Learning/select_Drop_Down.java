package my_Learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class select_Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
	}

}
