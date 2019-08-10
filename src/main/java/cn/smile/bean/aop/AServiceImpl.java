package cn.smile.bean.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
/**
 * 调用this.b()使用的是原始对象，将无法使用事物的增强
 * */
public class AServiceImpl implements AService {

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void a() {
        ((AService)AopContext.currentProxy()).b();
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void b() { }
}
