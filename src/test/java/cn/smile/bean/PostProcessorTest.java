package cn.smile.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorTest {

    @Test
    public void testPostProcessor(){
        System.out.println("》》》Spring ApplicationContext容器开始初始化了......");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("BeanPostProcessorTest.xml");
        System.out.println("》》》Spring ApplicationContext容器初始化完毕了......");
    }
}
