package com.PgeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admin_addNewUser {
 WebDriver driver;
 public admin_addNewUser(WebDriver driver){
 this.driver=driver;
 PageFactory.initElements(driver, this);
}
@FindBy (xpath = ("//*[@id='menu_admin_viewAdminModule']/b"))
WebElement add_userName;
@FindBy (name = "btnAdd")
WebElement edt_btnAdd;
@FindBy (name = "systemUser[userType]")
WebElement edt_UserRole;
@FindBy (name="systemUser[employeeName][empName]")
WebElement edt_empName;
@FindBy (id ="systemUser_userName")
WebElement edt_userId;
@FindBy (name ="systemUser[status]")
WebElement edt_Status;
@FindBy (name ="systemUser[password]")
WebElement edt_password;
@FindBy (name ="systemUser[confirmPassword]")
WebElement edt_conPass;
@FindBy (name = "btnSave")
WebElement btn_save;

}