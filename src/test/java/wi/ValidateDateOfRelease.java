package wi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Classes.google;

public class ValidateDateOfRelease  extends base{
	google g;
	
	@BeforeMethod
	public void loginToSteps() {
	logIn();
	 g= new google(driver);
	}
	
  @Test
  public void PushpaReleaseDate() throws InterruptedException {
	  g.enterFilmName();
	  Thread.sleep(1500);
	  g.ClickOnPushpa2021();
	  
	
	  
  }
}
