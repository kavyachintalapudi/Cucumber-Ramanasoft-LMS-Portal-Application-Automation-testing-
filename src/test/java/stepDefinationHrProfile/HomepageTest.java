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
	
	
	
	@Given("user is on page")
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




}
