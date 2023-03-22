package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

import cn.hutool.json.JSONUtil;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Test1 {

    private ActivityController activityController = new ActivityController();

    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        test1.testQueryInfo();
    }

   void testQueryInfo() throws InterruptedException {
       for (int i = 0; i < 10; i++) {
           Long req = 1000l;
           Activity activity = activityController.queryActivityInfo(req);
           System.out.println(JSONUtil.parse(activity));
           Thread.sleep(1000);
       }
   }

}
