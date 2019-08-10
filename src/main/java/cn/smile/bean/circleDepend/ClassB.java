package cn.smile.bean.circleDepend;

import lombok.Getter;
import lombok.Setter;

public class ClassB {

    @Getter
    @Setter
    private ClassC testc;

    public ClassB(){

    }

    public ClassB(ClassC classC){
        this.testc = classC;
    }

    public void b(){
        testc.c();
    }
}
