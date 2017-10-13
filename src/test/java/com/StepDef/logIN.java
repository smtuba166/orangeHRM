package com.StepDef;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PgeObject.LogINPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class logIN{
WebDriver driver;
@Given("^Orange HRM login Panel$")
public void orange_HRM_login_Panel() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:/Webdriver/Chrome/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
}

@When("^admin enter username$")
public void admin_enter_username() throws Throwable {
    LogINPF log = new LogINPF(driver);
	log.userName().sendKeys("Admin");
	
 
}

@When("^enter password$")
public void enter_password() throws Throwable {
	LogINPF log = new LogINPF(driver);
	log.passWord().sendKeys("admin");
   
}

@When("^click LOGIN$")
public void click_LOGIN() throws Throwable {
	LogINPF log = new LogINPF(driver);
	log.submit().click();
   
}

@Then("^Orange HRM homepage appeared$")
public void orange_HRM_homepage_appeared() throws Throwable {
  
	//driver.quit();
    }
}