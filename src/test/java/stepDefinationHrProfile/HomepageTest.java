package stepDefinationHrProfile;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.qa.rsjobportal.driverfactory.DriverFactory;
import com.qa.rsjobportal.hr.hrProfile.pages.Homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTest {
	
	Homepage hp;
	SoftAssert softAssert;
	public HomepageTest()
	{
	WebDriver driver=DriverFactory.getDriver();
	hp=new Homepage(driver);
	softAssert =new SoftAssert();
	}
	
	
	
	/*@Given("user is on page")
	public void user_is_on_page() {
	
	
	}
	@When("user clicks on login")
	public void user_clicks_on_login() {
		hp.clickOnLoginButton();
	}
	@Then("user is able to see {string} {string} {string}")
	public void user_is_able_to_see(String hrLogin, String sAdminLogin, String internLogin) {
	
//softAssert.assertEquals(hp.getHrLoginText(),hrLogin);
//	softAssert.assertEquals(hp.getsuperAdminLoginText(),sAdminLogin);
//	softAssert.assertEquals(hp.getInternLoginText(),internLogin);
	
//	softAssert.assertAll();
	
	}
	
	
	@When("user clicks on about Ramanasoft")
	public void user_clicks_on_about_Ramanasoft()
	{
		hp.clickOnaboutRamanasoftBtn();
	}
	@Then("user is redirected to about Ramanasoft Page")
	public void user_is_redirected_to_about_Ramanasoft_Page()
	{
		
	}
	*/
	//kavya//
	/*login button*/
	
	@Given("user should click on login button")
	public void user_should_click_on_login_button() {
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
	    hp.clickLogin();
	}

	@Then("user is able to navigate to the drop down list options")
	public void user_is_able_to_navigate_to_the_drop_down_list_options() {
	    
	}
	
    /*intern button*/
	@Given("user should click on intern button")
	public void user_should_click_on_intern_button() {
	    
	}

	@When("click on intern button")
	public void click_on_intern_button() {
	    hp.clickintern();
	}

	@Then("user is able to navigate to the intern login page")
	public void user_is_able_to_navigate_to_the_intern_login_page() {
	    
	}
	
	/*guest button*/
	@Given("user click on guest button")
	public void user_click_on_guest_button() {
	    
	}
	
	@When("click on gueest button")
	public void click_on_gueest_button() {
	    hp.clickguest();
	}

	@Then("user is able to navigate to the guest login page")
	public void user_is_able_to_navigate_to_the_guest_login_page() {
	    
	}
/*contact us button*/
	@Given("should click on contact us button")
	public void should_click_on_contact_us_button() {
	    
	}

	@When("click on contact us button")
	public void click_on_contact_us_button() {
	    hp.clickcontact();
	}

	@Then("user is able to navigate to the contact us page")
	public void user_is_able_to_navigate_to_the_contact_us_page() {
	    
	}
/*current openings button*/
	
	@Given("user should click on current openings button")
	public void user_should_click_on_current_openings_button() {
	   
	}

	@When("click on current openings button")
	public void click_on_current_openings_button() {
	    hp.clickcurrent();
	}

	@Then("user is able to navigate to the current openings page")
	public void user_is_able_to_navigate_to_the_current_openings_page() {
	    
	}




}
