package com.totoro.service;

/**
 * @author:totoro
 * @createDate:2023/3/3
 * @description:
 */
public class A {
    public static void main(String[] args) {


        Object importId = 1;

        Long aLong = Long.valueOf( (Integer) importId );

        System.out.println(aLong);
    }
}
