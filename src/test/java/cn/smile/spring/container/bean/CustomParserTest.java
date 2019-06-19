package cn.smile.spring.container.bean;

import cn.smile.spring.container.bean.customtag.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomParserTest {

    @Test
    public void testCustomParser(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("customParserTest.xml"));
        User user = (User)bf.getBean("testCustomer");
        System.out.println(user.getUserName());
    }
}
