package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import cn.hutool.core.util.ObjectUtil;

import java.util.Date;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Level1AuthLink extends AuthLink{

    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String id, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (ObjectUtil.isEmpty(date)){
            return new AuthInfo("0001","单号：", orderId, " 状态：待一级负责人审批 ",levelUserName);
        }

        AuthLink next = super.next();

        if (ObjectUtil.isEmpty(next)){
            return new AuthInfo("0000","单号：",orderId," 状态：一级审批完成负责人", " 时间：",f.format(date), "审批人：", levelUserName);
        }

        return next.doAuth(id,orderId,authDate);

    }
}
