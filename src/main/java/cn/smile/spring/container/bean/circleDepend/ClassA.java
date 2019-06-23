package cn.smile.spring.container.bean.circleDepend;

import lombok.Getter;
import lombok.Setter;

public class ClassA {

    @Getter
    @Setter
    private ClassB testb;

    public ClassA(){

    }

    public ClassA(ClassB classB){
        this.testb = classB;
    }

    public void a(){
        testb.b();
    }
}
