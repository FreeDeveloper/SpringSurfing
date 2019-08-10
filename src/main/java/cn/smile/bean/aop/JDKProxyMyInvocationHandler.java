package cn.smile.bean.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyMyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;

    public JDKProxyMyInvocationHandler(Object target){
        super();
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------------before---------------");
        Object result = method.invoke(target,args);
        System.out.println("-----------------after---------------");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
    }
}
