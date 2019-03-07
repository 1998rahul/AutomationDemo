package keywords;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import getpageobjects.*;
import pagefactory.Navigation;

public class Homepage extends GetLocator{
	
	WebDriver driver;
	private Navigation nav;

	public Homepage(WebDriver driver) {
		super(driver, "Homepage");
		this.driver = driver;
		nav = new Navigation(driver);
	}
	
	public void verifyamazonlogo() throws IOException{
		getElement("logo");
	}
	
	public void searchItem() {
		nav.searchItem();
	}
	
	public void search(List<String> items) throws IOException {
		getElement("searchbar").clear();
		for(int i = 0;i<items.size();i++) {
			getElement("searchbar").clear();
			getElement("searchbar").sendKeys(items.get(i));
		}
	}
	
	public void click_on_submitItem() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getElement("searchbutton").click();
	} 
	
	public void search_oneplus() throws IOException {
		getElement("searchbar").clear();
		getElement("searchbar").sendKeys("one plus");
		getElement("searchbutton").click();
	}
	
	public void search_andriod_phone() throws IOException {
		getElement("searchbar").clear();
		getElement("searchbar").sendKeys("Andriod phones");
		getElement("searchbutton").click();
		
	}

}
