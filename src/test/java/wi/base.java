package wi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
protected	WebDriver driver;
	public void logIn() {
		 driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.google.com/");
		
	}
	
}
