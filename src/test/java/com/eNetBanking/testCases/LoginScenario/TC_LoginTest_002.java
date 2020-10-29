package com.eNetBanking.testCases.LoginScenario;

import com.eNetBanking.baseClass.BaseClass;
import com.eNetBanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_002 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);


        logger.info("Url is open sucessfully"+baseUrl);


        lp.setUserName(userName);
        logger.info("Entered user name :"+userName);
        lp.setPassword(passWord);
        logger.info("Entered password :"+passWord);
        lp.clickSubmit();
        logger.info("Submit button clicked ....");



        if (driver.getTitle().equals("Swag Labs")) {
            Assert.assertTrue(true);
            logger.info("Page title is matched successfully and login test is passed."+driver.getTitle());
        } else {
            Assert.assertTrue(false);
            logger.info("Page title is  not matched and login test is failed." +
                    "");
        }


    }

}
