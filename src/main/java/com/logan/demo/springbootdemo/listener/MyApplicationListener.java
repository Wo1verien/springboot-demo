package com.logan.demo.springbootdemo.listener;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 通过实现ApplicationListener接口，完成事件的监听处理
 * @author Logan
 * @date 2019/12/7 16:18
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //springboot应用启动且未作任何处理（除listener注册和初始化）的时候发送ApplicationStartingEvent
        if (applicationEvent instanceof ApplicationStartingEvent){
            System.out.println("ApplicationStarting");
            return;
        }
        //确定springboot应用使用的Environment且context创建之前发送这个事件
        if (applicationEvent instanceof ApplicationEnvironmentPreparedEvent){
            System.out.println("ApplicationEnvironmentPrepared");
            return;
        }
        //context已经创建且没有refresh发送个事件
        if (applicationEvent instanceof ApplicationPreparedEvent){
            System.out.println("ApplicationPrepared");
            return;
        }
        //context已经refresh且application and command-line runners（如果有） 调用之前发送这个事件
        if (applicationEvent instanceof ApplicationStartedEvent){
            System.out.println("ApplicationStarted");
            return;
        }

        //应用启动失败后产生这个事件
        if (applicationEvent instanceof ApplicationFailedEvent){
            System.out.println("ApplicationFailed");
        }
    }
}
