package cn.smile.bean.customtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * 自定义bean解析器
 * */
public class UserBeanDefinationParser extends AbstractSingleBeanDefinitionParser {

    //Element对应的类
    protected Class getBeanClass(Element element){
        return User.class;
    }

    //从element中解析并提取相应的元素
    protected void doParse(Element element, BeanDefinitionBuilder beanDefinitionBuilder){
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");

        //将提取到的数据放入beanDefinitionBuilder中，待到完成所有的bean的解析后统一注册到beanFactory中

        if(StringUtils.hasText(userName)){
            beanDefinitionBuilder.addPropertyValue("userName",userName);
        }

        if(StringUtils.hasText(userName)){
            beanDefinitionBuilder.addPropertyValue("email",email);
        }
    }
}
