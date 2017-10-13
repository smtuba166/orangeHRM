package com.PgeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogINPF {
WebDriver driver;

public LogINPF(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy (name="txtUsername")
WebElement edt_txtusername;
@FindBy (name = "txtPassword")
WebElement edt_txtpassword;
@FindBy (name = "Submit")
WebElement btn_Submit;

public WebElement userName(){
	return edt_txtusername;
}
public WebElement passWord(){
	return edt_txtpassword;
}
public WebElement submit(){
	return btn_Submit;
}

}
