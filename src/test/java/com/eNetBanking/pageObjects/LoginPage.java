package com.eNetBanking.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;
    public static Logger logger;

    public LoginPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(id = "user-name")
    @CacheLookup
     WebElement txtUserName;

    @FindBy(id = "password")
    @CacheLookup
     WebElement txtPassword;

    @FindBy(id = "login-button")
    @CacheLookup
     WebElement btnLogin;

    @FindBy(className = "bm-burger-button")
    @CacheLookup
     WebElement menuButton;

    @FindBy (id ="logout_sidebar_link")
    @CacheLookup
     WebElement btnLogOut;

    @FindBy (xpath = "//h3[@data-test ='error']")
    WebElement errorMsgLogin;

    public void setUserName(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String password) {
        txtPassword.sendKeys(password);
       // logger.info("Password entered sucessfully.....");

    }

    public void clickSubmit() {
        btnLogin.click();
    }

    public void login(String uName, String pWord){
        setUserName(uName);
        setPassword(pWord);
        clickSubmit();

    }

    public String getErrorMessage()
    {
         return errorMsgLogin.getText();
    }

}
