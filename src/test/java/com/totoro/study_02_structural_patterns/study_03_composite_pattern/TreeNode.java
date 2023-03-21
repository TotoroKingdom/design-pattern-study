package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import lombok.Data;

import java.util.List;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
@Data
public class TreeNode {

    private Long treeId;

    private Long treeNodeId;

    private Integer nodeType;

    private String nodeValue;

    private String ruleKey;

    private String ruleDesc;

    private List<TreeNodeLink> treeNodeLinkList;
}
