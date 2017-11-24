package com.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;

public class ScheduleSayHello {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduleSayHello.class);

/*@Autowired
    private ITestService iTestService;*/


    public void sayHello() {
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        System.out.println("1");
        LOG.info("Scheduler start at:" + currentTime+"___Hello!");


    }

    /*public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        System.out.println("1");
        LOG.info("Scheduler start at:" + currentTime+"___Hello!");
    }*/
}
