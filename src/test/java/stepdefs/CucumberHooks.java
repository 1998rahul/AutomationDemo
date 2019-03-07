package stepdefs;

import java.io.FileNotFoundException;

import com.qait.framework.initiator.*;

import cucumber.api.java.After;
import cucumber.api.java.Before; 


public class CucumberHooks {
	public static Initiator test;
	
	@Before
	public void tearup() throws FileNotFoundException{
		test = new Initiator();
	}
	
	@After
	public void teardown() {
		test.getDriver().close();
	}
}
