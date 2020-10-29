package com.eNetBanking.baseClass;

import com.eNetBanking.utilites.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();

    public String baseUrl = readConfig.getUrl();
    public String userName =readConfig.getUserName();
    public String passWord =readConfig.getPassword();



//    public String baseUrl = "https://www.saucedemo.com/index.html";
//    public String username = "standard_user";
//    public String password = "secret_sauce";
    public static WebDriver driver;

    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String br){

        logger = Logger.getLogger("eSauceLab-Demo");
        PropertyConfigurator.configure("log4j.properties");

       if(br.equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
           driver = new ChromeDriver();
       }
       else if(br.equalsIgnoreCase("firefox")) {
           System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
           driver = new FirefoxDriver();
       }
       else if(br.equalsIgnoreCase("Edge")) {
           System.setProperty("webdriver.edge.driver", readConfig.getEdgePath());
           driver = new EdgeDriver();
       }
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @AfterClass
    public  void tearDown(){
        driver.quit();
    }

}
