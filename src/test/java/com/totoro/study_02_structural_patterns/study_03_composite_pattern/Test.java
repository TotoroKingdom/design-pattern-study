package com.totoro.study_02_structural_patterns.study_03_composite_pattern;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Init init = new Init();
        TreeRich treeRich = init.init();
        JSON parse = JSONUtil.parse(treeRich);
        System.out.println(parse);

        TreeEngineHandle treeEngineHandle = new TreeEngineHandle();
        HashMap<String, String> decisionMatter = new HashMap<>();
        decisionMatter.put("gender","man");
        decisionMatter.put("age","29");

        EngineResult oooo = treeEngineHandle.process(10001L, "oooo", treeRich, decisionMatter);
        System.out.println(JSONUtil.parse(oooo));

    }
}
