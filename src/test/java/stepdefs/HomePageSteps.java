package stepdefs;

import java.util.List;

import com.qait.framework.initiator.Initiator;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

/**
 * Unit test for simple App.
 */
public class HomePageSteps {
	private Initiator test = CucumberHooks.test;

	
	@Then("^I verify Amazon logo is displayed$")
	public void i_verify_Amazon_logo_is_displayed() throws Throwable {
		test.homepage.verifyamazonlogo();
	  
	}

	@Then("^Search item$")
	public void search_bar_is_displayed() throws Throwable {
		test.homepage.searchItem();	
	}
	
	@Then("^I search multiple item$")
	public void i_search_multiple_item(DataTable dt) throws Throwable {
		List<String> entries = dt.asList(String.class);
		test.homepage.search(entries);
		
	}
	
	@Then("^I enter item on search bar$")
	public void i_enter_item_on_search_bar() throws Throwable {
		test.homepage.searchItem();
	}

	@Then("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		test.homepage.click_on_submitItem();
	}
	
	@Then("^I enter one plus in search field$")
	public void i_enter_one_plus_in_search_field() throws Throwable {
		test.homepage.search_oneplus();
	}

	@Then("^I enter Android Phone in search field$")
	public void i_enter_Android_Phone_in_search_field() throws Throwable {
		test.homepage.search_andriod_phone();
	}

}
