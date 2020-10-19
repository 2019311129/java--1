package test;

public class Person {
    int number;String name;String sex;
    Person(){

    }
    Person(int number,String name,String sex){
        this.name = name;
        this.number = number;
        this.sex = sex;
        System.out.print("\n编号:"+number+"\t姓名："+name+"\t性别"+sex);
    }
}
