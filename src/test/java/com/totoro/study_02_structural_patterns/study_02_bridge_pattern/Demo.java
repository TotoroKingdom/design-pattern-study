package com.totoro.study_02_structural_patterns.study_02_bridge_pattern;

import java.math.BigDecimal;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class Demo {
    public static void main(String[] args) {

        WeChatPay weChatPay = new WeChatPay(new PayModeFace());
        String transfer = weChatPay.transfer("1", "1", new BigDecimal(1));

        AliPay aliPay = new AliPay(new PayModeCypher());
        String transfer1 = aliPay.transfer("2", "2", new BigDecimal(2));

    }
}
