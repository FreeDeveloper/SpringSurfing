package cn.smile.bean.beanPostProcessorTest;

import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean {
    public Car(){
        System.out.println("car instance...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Car afterPropertiesSet instance...");
    }
}
