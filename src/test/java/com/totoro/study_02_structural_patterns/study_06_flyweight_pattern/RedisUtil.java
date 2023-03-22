package com.totoro.study_02_structural_patterns.study_06_flyweight_pattern;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class RedisUtil {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger();

    public RedisUtil(){
        scheduledExecutorService.scheduleAtFixedRate(() ->{
            stock.addAndGet(1);
        },0,100000, TimeUnit.MICROSECONDS);
    }


    public int getStockUsed(){
        return stock.get();
    }
}
