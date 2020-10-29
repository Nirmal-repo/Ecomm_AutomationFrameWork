package com.eNetBanking.utilites;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig()  {
        File src = new File("./configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is "+e.getMessage());
        }

    }

    public String getUrl(){
        String baseUrl =pro.getProperty("baseUrl");
        return  baseUrl;
    }

    public String getUserName(){
        String userName =pro.getProperty("username");
        return  userName;
    }
    public String getPassword(){
        String password =pro.getProperty("password");
        return  password;
    }
    public String getChromePath(){
        String chromePath =pro.getProperty("chromePath");
        return  chromePath;
    }

    public String getFirefoxPath(){
        String fireFoxPath = pro.getProperty("firefoxPath");
                return fireFoxPath;
    }
    public String getEdgePath(){
        String msEdgePath = pro.getProperty("edgePath");
        return msEdgePath;
    }


}
