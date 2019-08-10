package cn.smile.bean.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

    @Test
    public void tsTest() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("transaction.xml");
        UserService userService = (UserService)ac.getBean("userService");

        User user = new User();
        user.setName("张三ccc");
        user.setAge(20);
        user.setSex("男");

        //保存记录
        userService.save(user);

    }
}
