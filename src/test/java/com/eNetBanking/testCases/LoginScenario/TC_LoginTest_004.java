package com.eNetBanking.testCases.LoginScenario;

import com.eNetBanking.baseClass.BaseClass;
import com.eNetBanking.pageObjects.LoginPage;
import com.eNetBanking.pageObjects.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_004 extends BaseClass {


    @Test
    public void VerifyLoginTest() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        ProductListPage plp = new ProductListPage(driver);
        logger.info("Url is  open sucessfully ..."+baseUrl);
        lp.login(userName,passWord);
        if (driver.getTitle().equals("Swag Labs")) {
            Assert.assertTrue(true);
            logger.info("Page title is matched successfully and login test is passed."+driver.getTitle());
        } else {
            Assert.assertTrue(false);
            logger.info("Page title is  not matched and login test is failed." +
                    "");
        }

        Thread.sleep(5000);
        plp.clickMenuBar();
        plp.clickLogOutLink();

    }



}
