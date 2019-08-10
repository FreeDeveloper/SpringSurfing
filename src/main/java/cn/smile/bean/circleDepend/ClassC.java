package cn.smile.bean.circleDepend;

import lombok.Getter;
import lombok.Setter;

public class ClassC {

    @Getter
    @Setter
    private ClassA testa;

    public ClassC(){

    }

    public ClassC(ClassA classa){
        this.testa = classa;
    }

    public void c(){
        testa.a();
    }
}
