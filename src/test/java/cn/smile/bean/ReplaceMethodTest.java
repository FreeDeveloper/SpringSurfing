package cn.smile.bean;

import cn.smile.bean.replaceMethod.Company;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReplaceMethodTest {

    @Test
    public void testReplacer(){
        ApplicationContext ax = new ClassPathXmlApplicationContext("replaceMethodTest.xml");
        Company company = (Company)ax.getBean("company");
        company.pay();
        company.changeMe();
    }

}
