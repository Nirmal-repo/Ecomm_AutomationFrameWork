package com.eNetBanking.testCases.LoginScenario;

import com.eNetBanking.baseClass.BaseClass;
import com.eNetBanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_003 extends BaseClass {

    @Test(description = "Verify an error message when user id not enter  in login window.")
    public void TestLoginFailedWithoutUserId() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);


        logger.info("Url is open sucessfully"+baseUrl);



        lp.setPassword(passWord);
        logger.info("Entered password :"+passWord);
        lp.clickSubmit();
        logger.info("Submit button clicked ....");

       if(lp.getErrorMessage().contains("Username is required")){
           Assert.assertTrue(true);
           logger.info("error message is matched and test is passed ");
       }
       else
       {
           Assert.assertTrue(false);
           logger.info("error message not matched and test is failed ");
       }










    }

//    @Test(description = "Verify an error message when password not enter  in login window.")
//    public void TestLoginFailedWithoutPassword() throws InterruptedException {
//
//        LoginPage lp = new LoginPage(driver);
//
//
//        logger.info("Url is open sucessfully"+baseUrl);
//
//
//       lp.setUserName(userName);
//       lp.setPassword("");
//               lp.clickSubmit();
//        logger.info("Submit button clicked ....");
//
//        if(lp.getErrorMessage().contains("Password is required is required")){
//            Assert.assertTrue(true);
//            logger.info("error message is matched and test is passed ");
//        }
//        else
//        {
//            Assert.assertTrue(false);
//            logger.info("error message not matched and test is failed ");
//        }
//
//
//
//
//
//
//
//
//
//
//    }

}
