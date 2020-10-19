
# 阅读程序

## 一、实验目的<br></br>
### 基本要求
  - 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
  + 掌握面向对象的类设计方法（属性、方法）；
  * 掌握类的继承用法，通过构造方法实例化对象；
  + 学会使用super()，用于实例化子类；
  - 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

### 附加要求：
1. 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）
2. 模拟学生退课操作，再打印课程信息。

## 二、实验过程
1. 首先创建四个类和一个主类
2.将四个主类名字分别命名为People，然后用另外两个类Student，Teacher分别设置为People的子类，并用super（）将父类People中的编号、姓名、性别继承。在输出语句中用toString（）方法。
3. 在PC中进行了类体CPU的定义。引入了speed用来存储cpu运行速度这个变量。而后创建构造方法用来接受Test中输入的数值。CPU （int speed）在其中调用另一个函数setSpeed（speed）用来确定变量speed的值。 最后加入int getSpeed()方便调出speed数值方便输出。
4.设置if语句，当速率低的时候输出默认值为3000.
5.将四个变量分装，改变private方法变成public方法。使程序运行。



## 三、核心方法
> 基本要求：首先定义了四个Java类文件。将他们命名为“CPU”“HardDisk”“Test”“PC”。在PC中进行了类体CPU的定义。引入了speed用来存储cpu运行速度这个变量。而后创建构造方法用来接受Test中输入的数值。CPU （int speed）在其中调用另一个函数setSpeed（speed）用来确定变量speed的值。 最后加入int getSpeed()方便调出speed数值方便输出。
>> 附加条件：引入新变量count（int）、hertz(double)两个变量并对他们同时进行以上操作。并在setspeed（）中进行if判断语句。如果运行速度没有到达2500的话，就按3000输出。

```
package src2;

public class CPU {
    public int speed;
    public int count;
    public double hertz;
    CPU(){}
     public CPU(int speed,int count,double hertz){
        setSpeed(speed);
        setCount(count);
        setHertz(hertz);

    }
    public int getCount(){
        return count;
    }
    int getSpeed(){
        return speed;
    }
    double getHertz(){
        return hertz;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setSpeed(int speed) {
        if(speed<=2500){
            speed=3000;
            this.speed = speed;}
    }
    public void setHertz(double hertz) {
        this.hertz = hertz;
    }
}

```
 
## 四、实验结果
![%E5%AE%9E%E9%AA%8C%E6%8A%A5%E5%91%8A.png](https://github.com/liuyunsong010806/java-/blob/main/%E5%AE%9E%E9%AA%8C%E6%8A%A5%E5%91%8A.png)

## 五、实验感想

作为第二次做的java实验，我已经学会类、方法的构建。不同函数的构建和引用没，体会到了修饰符private的用法。并学会了将一个程序分成多个包进行分装，将运行方法的访问限制修饰符改变，让不同包能跨包运行。
并会用if判断语句来进行对输出数据的改变。
