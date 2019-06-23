package cn.smile.spring.container.bean;

import cn.smile.spring.container.bean.awareTest.BeanFactoryAwareTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest {

    @Test
    public void testSpringFactoryAware(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("awareTest.xml");
        BeanFactoryAwareTest bfat = (BeanFactoryAwareTest)ctx.getBean("beanFactoryAwareTest");
        bfat.testAware();
    }
}
