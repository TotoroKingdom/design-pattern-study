package com.totoro.study_03_behavioral_model.study_01_chain_of_responsibility_pattern.chain1;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Data
public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos){
        this.code = code;
        for (String info : infos) {
            this.info = this.info.concat(info);
        }
    }
}
