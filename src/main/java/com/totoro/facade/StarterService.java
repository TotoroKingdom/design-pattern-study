package com.totoro.facade;

import org.springframework.util.StringUtils;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr){
        this.userStr = userStr;
    }

    public String[] split(String separatorChar){
        return StringUtils.split(this.userStr, separatorChar);
    }
}
