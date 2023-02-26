package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.util;

public class google {

@FindBy(xpath="//input[@name='q']")	private WebElement info;
@FindBy(xpath="//ul[@class='G43f7e']/li[1]")	private WebElement p21;
@FindBy(xpath="(//h3[contains(text(),'The Rise ')])[1]") private WebElement wiki;
@FindBy(xpath="(//div[@class='plainlist'])[4]")  private WebElement releaseDate;
	public google(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterFilmName(WebDriver driver) {
	util.implicitWay(driver, 10);
		info.sendKeys("Pushpa");
	}
	
	public void ClickOnPushpa2021() throws InterruptedException {
		Thread.sleep(1000);
		p21.click();
	}
	
	public void wikipedia() throws InterruptedException {
		Thread.sleep(1000);
		wiki.click();
	}
	
	public void date() {
		String d = releaseDate.getText();
		System.out.println(d);
	//Report.log("add",true);
	}
	
	
	
}
