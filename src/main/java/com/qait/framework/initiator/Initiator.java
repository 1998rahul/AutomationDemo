package com.qait.framework.initiator;


import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import keywords.Homepage;
import com.qait.framework.utils.YamlReader;



public class Initiator {
	
	private WebDriver driver;
	
	public Homepage homepage;
	
    public WebDriver getDriver() {
        return this.driver;
    }

	
	public Initiator() {
		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		driver = new ChromeDriver(options);
		try {
			testInitiator();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void init() {
		homepage = new Homepage(driver);
	}
	private void testInitiator() throws FileNotFoundException {
		YamlReader.getFilePath();
		init();
		launch();	
	}
	
	private void launch() throws FileNotFoundException {
		launch(YamlReader.getYamlvalue("url"));
		
	}
	
	private void launch(String baseUrl) {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
}
