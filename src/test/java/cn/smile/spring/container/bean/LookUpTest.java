package cn.smile.spring.container.bean;

import cn.smile.spring.container.bean.lookup.GetBeanTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LookUpTest {

    @Test
    public void testGetBean(){
        ApplicationContext ax = new ClassPathXmlApplicationContext("lookUpTest.xml");
        GetBeanTest test1 = (GetBeanTest)ax.getBean("getBeanTest1");
        GetBeanTest test2 = (GetBeanTest)ax.getBean("getBeanTest2");
        test1.showMe();
        test2.showMe();
    }

}
