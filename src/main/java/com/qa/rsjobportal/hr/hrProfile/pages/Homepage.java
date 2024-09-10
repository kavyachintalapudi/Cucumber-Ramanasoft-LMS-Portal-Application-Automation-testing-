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
	
	/*Login button on Homepage */
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	public void clickOnLoginButton()
	{
		EleInt.click(login);
	}
	
	/*Hr login button*/
	@FindBy(xpath="//li[text()='HR Login']")
	private WebElement HrLogin;
	public String getHrLoginText()
	{
		return EleInt.getText(HrLogin);
	}
	
	
	
	
	/*Super Admin login button*/
	@FindBy(xpath="//li[text()='SuperAdmin Login']")
	private WebElement superAdminLogin;
	public String getsuperAdminLoginText()
	{ 
		
		return EleInt.getText(superAdminLogin);
	}
		
	/*Intern Login button*/
	@FindBy(xpath="//li[text()='Intern Login']")
	private WebElement internLogin;
	public String getInternLoginText()
	{
		return EleInt.getText(internLogin);
	}
	
	/*About Ramanasoft Button*/
	@FindBy(xpath="//li[text()='About RamanaSoft']")
	private WebElement aboutRamansoftbtn;
	
	public void clickOnaboutRamanasoftBtn()
	{
	   EleInt.click(aboutRamansoftbtn);
	}
	
	

}
