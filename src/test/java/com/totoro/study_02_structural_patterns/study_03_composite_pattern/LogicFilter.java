package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.List;
import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public interface LogicFilter {

    Long filter(String value, List<TreeNodeLink> treeNodeLinkList);

    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);
}
