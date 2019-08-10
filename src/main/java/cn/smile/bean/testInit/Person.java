package cn.smile.bean.testInit;

public class Person {

    private MyTestBean myTestBean;

    private int age;

    private String name;

    public Person(int age, String name,MyTestBean myTestBean) {
        this.age = age;
        this.name = name;
        this.myTestBean = myTestBean;
    }

    public String toString(){
        return age+"   "+name+"    "+myTestBean.getTestStr();
    }
}
