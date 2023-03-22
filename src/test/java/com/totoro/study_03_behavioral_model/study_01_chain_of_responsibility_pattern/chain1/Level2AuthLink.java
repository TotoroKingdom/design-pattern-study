package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import cn.hutool.core.util.ObjUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Level2AuthLink extends AuthLink{

    private Date beginDate = f.parse("2023-03-22 00:00:00");
    private Date endDate = f.parse("2023-03-22 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String id, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);

        if (ObjUtil.isEmpty(date)){
            return new AuthInfo("0001","单号：",orderId,"状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (ObjUtil.isEmpty(next)){
            return new AuthInfo("0000","单号：", orderId,"状态：二级审批完成负责人", " 时间：", f.format(date), "审批人：",levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)){
            return new AuthInfo("0000","单号：", orderId,"状态：二级审批完成负责人", " 时间：", f.format(date), "审批人：",levelUserName);
        }


        return next.doAuth(id,orderId,authDate);
    }
}
