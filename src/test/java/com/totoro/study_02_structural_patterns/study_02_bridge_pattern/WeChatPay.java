package com.totoro.study_02_structural_patterns.study_02_bridge_pattern;

import java.math.BigDecimal;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class WeChatPay extends Pay {
    public WeChatPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String id, String trade, BigDecimal amount) {
        payMode.security("1");
        System.out.println("微信支付");
        return null;
    }
}
