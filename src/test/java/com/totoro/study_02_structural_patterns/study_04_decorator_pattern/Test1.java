package com.totoro.study_02_structural_patterns.study_04_decorator_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class Test1 {
    public static void main(String[] args) {

        LoginSsoDecorator loginSsoDecorator = new LoginSsoDecorator();
        String request = "successhuahua";
        boolean b = loginSsoDecorator.preHandle(request, "hhhh", "kkkk");
        System.out.println(b);
    }
}
