package cn.smile.spring.container.bean.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinationParser());
    }
}
