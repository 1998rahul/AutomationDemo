package getpageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetLocator extends ObjectFileReader{

	WebDriver driver;
	static String pagename;
	
	
	@SuppressWarnings("static-access")
	public GetLocator(WebDriver driver, String pagename) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		this.pagename = pagename;
	}



	public static WebElement getElement(String element) throws IOException {
		
		return getElementFromFile(pagename,element);
		
	}




}
