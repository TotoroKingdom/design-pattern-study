package com.totoro.study_02_structural_patterns.study_02_bridge_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class PayModeFace implements PayMode {
    @Override
    public boolean security(String id) {
        System.out.println("刷脸支付");
        return false;
    }
}
