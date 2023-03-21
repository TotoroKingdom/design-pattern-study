package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import lombok.Data;

import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
@Data
public class TreeRich {

    private TreeRoot treeRoot;

    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(){

    }

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap){
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
}
