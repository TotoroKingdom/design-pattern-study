package com.totoro.study_03_behavioral_model.study_03_interpreter_pattern;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Data
public class Link {

    private String fromId;

    private String toId;

    public Link(String fromId, String toId){
        this.fromId = fromId;
        this.toId = toId;
    }
}
