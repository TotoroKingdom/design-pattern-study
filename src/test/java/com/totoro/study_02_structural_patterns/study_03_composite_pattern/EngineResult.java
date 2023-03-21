package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import lombok.Data;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
@Data
public class EngineResult {

    private boolean isSuccess;
    private String userId;
    private Long treeId;
    private Long nodeId;
    private String nodeValue;

    public EngineResult(){

    }
    public EngineResult(boolean isSuccess){
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue){
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }
}
