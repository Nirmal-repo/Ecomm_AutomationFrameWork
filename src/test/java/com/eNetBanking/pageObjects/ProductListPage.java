package com.eNetBanking.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    WebDriver ldriver;
    public static Logger logger;

    public ProductListPage(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(css = ".bm-burger-button button")
    WebElement menuBar;

    @FindBy(xpath = "//div[@class='bm-cross-button']//button")
    WebElement closeIcon;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logOutLink;



    public void clickMenuBar(){

        menuBar.click();

    }

    public void clickLogOutLink(){
      logOutLink.click();
    }
    public void clickCrossIcon(){
      closeIcon.click();
    }

}
