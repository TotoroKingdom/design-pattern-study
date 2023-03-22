package com.totoro.facade;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Configuration
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr(){
        return userStr;
    }

    public void setUserStr(String userStr){
        this.userStr = userStr;
    }


}
