package cn.smile.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleDependTest {

    @Test
    public void testCircledependOnConstruct() throws Throwable{
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("circleDependOnConstructTest.xml");
            System.out.println(ac.getBean("testAcos"));
        }catch (Exception e){
            Throwable el = e.getCause().getCause().getCause();
            throw el;
        }
    }

    @Test
    public void testCircledependOnSetter() throws Throwable{
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("circleDependOnSetterTest.xml");
            System.out.println(ac.getBean("testAcos"));
        }catch (Exception e){
            Throwable el = e.getCause().getCause().getCause();
            throw el;
        }
    }

    @Test
    public void testCircledependOnSetterWithPrototype() throws Throwable{
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("circleDependOnSetterPrototypeTest.xml");
            System.out.println(ac.getBean("testAcos"));
        }catch (Exception e){
            Throwable el = e.getCause().getCause().getCause();
            throw el;
        }
    }

}
