package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
	
	WebDriver driver;
	public Navigation(WebDriver driver){
		this.driver = driver;
		initNavigation(driver);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchitem;
	
	public void initNavigation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searchitem.sendKeys("laptop");
	}
}
