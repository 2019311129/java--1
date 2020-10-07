# Java-
Java课程作业项目仓库


# 阅读程序

## 一、实验目的<br></br>
### 基本要求
  - 用类描述计算机中CPU的速度和硬盘的容量。
  + Java中包含四个类，名字分别为PC、CPU、HardDisk、Test。并使Test为主类。
  * CPU类要求getSpeed（）返回speed的值.要求setSpeed(int m)方法将参数m的值赋值给speed。
  + HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount。
  - PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。


### 附加要求：
1. 类中定义不少于两个构造方法；
2. 每个类定义不少于2个属性，且属性的类型应该多样化；
3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
4. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。


## 二、实验过程
1. 首先定义了四个Java类文件，然后将它们进行封装
2. 定义了四个不同的不同的变量。三个变量在cpu的包中。
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
