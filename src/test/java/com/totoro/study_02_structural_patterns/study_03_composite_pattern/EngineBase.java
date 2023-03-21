package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public abstract class EngineBase extends EngineConfig implements Engine {


    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String,String> decisionMatter){
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();

        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNode = treeNodeMap.get(rootNodeId);

        while (treeNode.getNodeType().equals(1)){
            String ruleKey = treeNode.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNode.getTreeNodeLinkList());
            treeNode = treeNodeMap.get(nextNode);
            System.out.println("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}"+ treeRoot.getTreeName()+ userId+  treeId+  treeNode.getTreeNodeId()+ ruleKey+  matterValue);
        }

        return treeNode;
    }
}
