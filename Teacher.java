package test;

public class Teacher extends Person{
    int course;
    Teacher (int number,String name,String sex,int course){
        super(number,name,sex);
        this.course=course;
    }
        public String toString (){
            return "教师号:"+number+"\t老师姓名："+name+"\t性别"+sex+"\t 所教课程："+course;
        }

    }
