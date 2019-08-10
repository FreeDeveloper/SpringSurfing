package cn.smile.bean.beanPostProcessorTest;

import org.springframework.beans.factory.InitializingBean;

public class Motorbike implements InitializingBean {
    public Motorbike(){
        System.out.println("Motorbike instance...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Motorbike afterPropertiesSet instance...");
    }
}
