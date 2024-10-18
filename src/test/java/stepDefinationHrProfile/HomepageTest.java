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
	
/*about ramanasoft button*/
	@Given("user should click on about ramanasoft button")
	public void user_should_click_on_about_ramanasoft_button() {
	    
	}

	@When("click on about ramanasoft button")
	public void click_on_about_ramanasoft_button() {
	    hp.clickabout();
	}

	@Then("user is able to navigate to the about ramanasoft page")
	public void user_is_able_to_navigate_to_the_about_ramanasoft_page() {
	    
	}
	
/*continue to register button*/
	@Given("user should click on continue to register button")
	public void user_should_click_on_continue_to_register_button() {
	    
	}

	@When("click on continue to register button")
	public void click_on_continue_to_register_button() {
	    hp.clickregister();
	}

	@Then("user is able to navigate to the registration page")
	public void user_is_able_to_navigate_to_the_registration_page() {
	    
	}
	
/* privacy policy hyperlink */
	@Given("user should click on privacy policy hyperlink")
	public void user_should_click_on_privacy_policy_hyperlink() {
	    
	}

	@When("click on privacy policy hyperlink")
	public void click_on_privacy_policy_hyperlink() {
	    hp.clickprivacy();
	}

	@Then("user is able to navigate to the privacy policy page")
	public void user_is_able_to_navigate_to_the_privacy_policy_page() {
	   
	}
	
/* security hyperlink */
	@Given("user should click on security hyperlink")
	public void user_should_click_on_security_hyperlink() {
	    
	}

	@When("click on security hyperlink")
	public void click_on_security_hyperlink() {
	    hp.clicksecurity();
	}

	@Then("user is able to navigate to the security page")
	public void user_is_able_to_navigate_to_the_security_page() {
	    
	}
	
/* website accessibility hyperlink */
	@Given("user should click on website Accessibility hyperlink")
	public void user_should_click_on_website_accessibility_hyperlink() {
	    
	}

	@When("click on website Accessibility hyperlink")
	public void click_on_website_accessibility_hyperlink() {
	    hp.clickwebsite();
	}

	@Then("user is able to navigate to the website Accessibility page")
	public void user_is_able_to_navigate_to_the_website_accessibility_page() {
	   
	}
	
/* manage cookies hyperlink */
	@Given("user should click on manage cookies hyperlink")
	public void user_should_click_on_manage_cookies_hyperlink() {
	    
	}

	@When("click on manage cookies hyperlink")
	public void click_on_manage_cookies_hyperlink() {
	    hp.clickcookies();
	}

	@Then("user able to navigate to the cookies page")
	public void user_able_to_navigate_to_the_cookies_page() {
	
	}

}
