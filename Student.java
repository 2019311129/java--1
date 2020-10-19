package test;

public class Student extends Person{
   int course;
   Student (int number,String name,String sex,int course){
       super(number,name,sex);
       this.course=course;
   }
    public String toString (){
        return "学号:"+number+"\t姓名："+name+"\t性别"+sex+"\t 所选课程"+course;
    }
}
