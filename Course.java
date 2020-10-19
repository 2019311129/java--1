package test;

public class Course {
    int number;String name;String address;String time;String teacher;
    Course(int number,String name,String address,String time,String teacher){
        this.number=number;
        this.name=name;
        this.address=address;
        this.time=time;
        this.teacher=teacher;}
        public String toString(){
            return "课程序号："+ number + "\t课程名字：" + name + "\t上课地址：" + address + "\t上课时间：" + time + "\t授课老师：" + teacher;
        }
}
