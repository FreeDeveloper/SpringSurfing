package cn.smile.bean.transaction;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;

    public User(){

    }

    public User(int id,String name,int age,String sex){
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
