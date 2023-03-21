package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import java.util.Map;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public interface Engine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich , final Map<String, String> decisionMatter);

}
