package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import cn.hutool.json.JSONUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Demo {
    public static void main(String[] args) throws ParseException {

        AuthLink authLink = new Level3AuthLink("001", "小叮当")
                .appendNext(new Level2AuthLink("002", "小叮当经理"))
                .appendNext(new Level1AuthLink("003", "小叮当老板"));

        System.out.println(JSONUtil.parse(authLink.doAuth("小小叮当","test1", new Date())));

        AuthService.auth("001","test1");
        System.out.println(JSONUtil.parse(authLink.doAuth("小小叮当","test1", new Date())));

        AuthService.auth("002","test1");
        System.out.println(JSONUtil.parse(authLink.doAuth("小小叮当","test1", new Date())));

        AuthService.auth("003","test1");
        System.out.println(JSONUtil.parse(authLink.doAuth("小小叮当","test1",new Date())));
    }
}
