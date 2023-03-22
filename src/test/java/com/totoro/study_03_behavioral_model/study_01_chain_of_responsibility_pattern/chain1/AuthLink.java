package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public abstract class AuthLink {

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId;
    protected String levelUserName;
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName){
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next(){
        return next;
    }

    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String id, String orderId, Date authDate);

}
