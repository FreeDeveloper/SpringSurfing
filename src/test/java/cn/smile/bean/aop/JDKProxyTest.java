package cn.smile.bean.aop;

import org.junit.Test;

public class JDKProxyTest {

    @Test
    public void testProxy(){
        JDKProxyUserService userService = new JDKProxyUserServiceImpl();

        JDKProxyMyInvocationHandler invocationHandler = new JDKProxyMyInvocationHandler(userService);

        JDKProxyUserService proxy = (JDKProxyUserService)invocationHandler.getProxy();

        proxy.add();
    }
}
