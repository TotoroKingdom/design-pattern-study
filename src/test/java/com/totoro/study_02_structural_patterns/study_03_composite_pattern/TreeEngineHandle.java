package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class TreeEngineHandle extends EngineBase{
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
