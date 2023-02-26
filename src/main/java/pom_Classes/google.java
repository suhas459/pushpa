package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google {

@FindBy(xpath="//input[@name='q']")	private WebElement info;
@FindBy(xpath="//ul[@class='G43f7e']/li[1]")	private WebElement p21;
	public google(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterFilmName() {
		info.sendKeys("Pushpa");
	}
	
	public void ClickOnPushpa2021() {
		
		p21.click();
	}
	
	
}
