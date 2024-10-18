package com.qa.rsjobportal.hr.hrProfile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rsjobportal.utils.EleInt;

public class Homepage {
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
/*login buttton */
	@FindBy(xpath = "//button[@type=\"button\"]")
	private WebElement login;
	public void clickLogin() {
		EleInt.click(login);
	}
	
/*intern button*/
	@FindBy(xpath = "//li[text()='Intern']")
	private WebElement intern;
	public void clickintern() {
		EleInt.click(intern);
	}
	
/*guest button*/
	@FindBy(xpath = "//li[@tabindex=\"-1\"]")
	private WebElement guest;
	public void clickguest()
	{
		EleInt.click(guest);
	}
	
/*contact us button*/
	@FindBy(xpath = "//li[text()='Contact Us']")
	public WebElement contact;
	public void clickcontact()
	{
		EleInt.click(contact);
	}
	
/*current openings button*/
	@FindBy(xpath = "//li[text()='Current Openings']")
	public WebElement current;
	public void clickcurrent()
	{
		EleInt.click(contact);
	}
	
/*about ramanasoft button*/
	@FindBy(xpath = "//li[text()='About RamanaSoft']")
	public WebElement about;
	public void clickabout()
	{
		EleInt.click(about);
	}
	
/*continue to register button*/
	@FindBy(xpath = "//button[text()='Continue to Register.']")
	public WebElement register;
	public void clickregister() {
		EleInt.click(register);
	}
	
/*privacy policy hyperlink*/
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	public WebElement privacy;
	public void clickprivacy() {
		EleInt.click(privacy);
	}
	
/*security hyperlink*/
	@FindBy(xpath = "//a[text()='Security']")
	public WebElement security;
	public void clicksecurity() {
		EleInt.click(security);
	}
	
/*website accessibility hyperlink*/
	@FindBy(xpath="//a[text()='Website Accessibility']")
	public WebElement website;
	public void clickwebsite() {
		EleInt.click(website);
	}
	
/*manage cookies hyperlink*/
	@FindBy(xpath = "//a[text()='Manage Cookies']")
	public WebElement cookies;
	public void clickcookies() {
		EleInt.click(cookies);
	}
	
}