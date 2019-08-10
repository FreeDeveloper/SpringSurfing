package cn.smile.bean.aop;

public class JDKProxyUserServiceImpl implements JDKProxyUserService{
    @Override
    public void add() {
        System.out.println("-----------------add--------------------");
    }
}
