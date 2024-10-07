package com.qa.rsjobportal.hr.hrProfile.pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rsjobportal.utils.EleInt;

import io.cucumber.java.an.E;

public class Homepage {
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Login button on Homepage */
	/*@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	public void clickOnLoginButton()
	{
		EleInt.click(login);
	}
	
	/*Hr login button*/
	/*@FindBy(xpath="//li[text()='HR Login']")
	private WebElement HrLogin;
	public String getHrLoginText()
	{
		return EleInt.getText(HrLogin);
	}
	
	
	
	
	/*Super Admin login button*/
	/*@FindBy(xpath="//li[text()='SuperAdmin Login']")
	private WebElement superAdminLogin;
	public String getsuperAdminLoginText()
	{ 
		
		return EleInt.getText(superAdminLogin);
	}
		
	/*Intern Login button*/
	/*@FindBy(xpath="//li[text()='Intern Login']")
	private WebElement internLogin;
	public String getInternLoginText()
	{
		return EleInt.getText(internLogin);
	}
	
	/*About Ramanasoft Button*/
	/*@FindBy(xpath="//li[text()='About RamanaSoft']")
	private WebElement aboutRamansoftbtn;
	
	public void clickOnaboutRamanasoftBtn()
	{
	   EleInt.click(aboutRamansoftbtn);
	}*/
	
	
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
}