package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.List;
import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public abstract class BaseLogic implements LogicFilter {
    @Override
    public Long filter(String value, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink treeNodeLink : treeNodeLinkList) {
            if (decisionLogic(value, treeNodeLink)){
                return treeNodeLink.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink){
        switch (nodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
