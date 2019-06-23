package cn.smile.spring.container.bean.beanPostProcessorTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor2 implements BeanPostProcessor, Ordered {

    public int getOrder() {
        return 1;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器【BeanPostProcessor2】处理【postProcessBeforeInitialization】,bean=【"+beanName+"】");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器【BeanPostProcessor2】处理【postProcessAfterInitialization】,bean=【"+beanName+"】");
        return bean;
    }
}
