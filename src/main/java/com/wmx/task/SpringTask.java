package com.wmx.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class SpringTask {

    //@Scheduled(cron = "*/5 * * * * ?")
    public void task1(){
        System.out.println("哈哈哈哈你");
    }
}
