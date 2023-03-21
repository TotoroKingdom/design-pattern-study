package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
@Data
public class TreeNodeLink {

    private Long nodeIdFrom;

    private Long nodeIdTo;

    private Integer ruleLimitType;

    private String ruleLimitValue;

}
