package com.totoro.study_02_structural_patterns.study_02_bridge_pattern;

import java.math.BigDecimal;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public abstract class Pay {

    protected PayMode payMode;

    public Pay(PayMode payMode){
        this.payMode = payMode;
    }

    public abstract String transfer(String id, String trade, BigDecimal amount);

}
