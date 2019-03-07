package getpageobjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class ObjectFileReader {
	
	public static String type,value;
	
	private static String filepath = "src/test/resources/specfile";

	private static WebDriver driver;
	
	public ObjectFileReader(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement getElementFromFile(String pagename, String element) throws IOException {
		
		FileReader specfile = new FileReader(filepath + File.separator + pagename + ".spec");
		
		return getElement(specfile, element) ;
		
	}
	
	public static WebElement getElement(FileReader specfile , String element) throws IOException {
		String line = " ";
		String[] strline;
		Map<String,String> elementmap1 =  new HashMap<String,String>(); 
		Map<String,String> elementmap2 =  new HashMap<String,String>();
		BufferedReader buffr = new BufferedReader(specfile);
		while((line = buffr.readLine())!= null){
				strline = line.split("\\s+");
				elementmap1.put(strline[0], strline[1]);
				elementmap2.put(strline[0], strline[2]);	
			}
		getType(elementmap1,element);
		getValue(elementmap2,element);
		
		return getWebelement(driver);
	}
	
	public static void getType(Map<String,String> map1 , String element) {
		type = map1.get(element);
			
	}
	
	public static void getValue(Map<String,String> map2, String element) {
		value = map2.get(element);
	}
	
	public static WebElement getWebelement(WebDriver driver) {
		if(type.equals("id")) {
			 return driver.findElement(By.id(value)); 
		 }	  
		 else if(type.equals("linkText")) {
			 return driver.findElement(By.linkText(value));
		 }
		 else if(type.equals("className")) {
			 return driver.findElement(By.className(value));
		 }
		 else if(type.equals("partialLinkText")) {
			 return driver.findElement(By.partialLinkText(value));
		 }
		 else if(type.equals("css")) {
			 return driver.findElement(By.cssSelector(value));
		 }
		 else {
			 return driver.findElement(By.xpath(value));
		 }
		
		
		
	}

}
