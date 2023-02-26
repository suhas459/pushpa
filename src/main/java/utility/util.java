package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class util {

	public static void implicitWay(WebDriver driver,int time) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
	}
	
	
	
	
	
	
	
	
}
