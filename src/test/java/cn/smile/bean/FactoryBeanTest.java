package cn.smile.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    @Test
    public void testFactoryBean(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("factoryBeanTest.xml");
        Car car = (Car)ac.getBean("car");
        System.out.println(car.toString());
    }
}
