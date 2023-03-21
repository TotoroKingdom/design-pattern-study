package com.totoro.study_02_structural_patterns.study_02_bridge_pattern;

import java.math.BigDecimal;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class AliPay extends Pay {
    public AliPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String id, String trade, BigDecimal amount) {
        payMode.security("1");
        System.out.println("支付宝支付");
        return null;
    }
}
