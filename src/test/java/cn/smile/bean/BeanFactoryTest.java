package cn.smile.bean;

import cn.smile.bean.testInit.MyTestBean;
import cn.smile.bean.testInit.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static junit.framework.TestCase.assertEquals;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
        assertEquals("你属猪",bean.getTestStr());

        Person person = (Person)bf.getBean("person");
        System.out.println(person.toString());
    }
}
