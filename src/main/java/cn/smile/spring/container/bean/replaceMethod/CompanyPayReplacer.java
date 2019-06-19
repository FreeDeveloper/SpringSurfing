package cn.smile.spring.container.bean.replaceMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class CompanyPayReplacer implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("扣了100块钱- -！");
        return null;
    }
}
