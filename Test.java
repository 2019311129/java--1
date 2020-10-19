package test;
import java.util.Scanner;    //主要功能是简化文本扫描、获取控制台输入
public class Test {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Course a = null;      //对a进行初始化赋值
        System.out.print("课程信息");
        Course wuli = new Course(1, "物理课", "综合楼603", "8：00", "张三");
        Course shuxue = new Course(2, "数学课", "综合楼703", "8：00", "李四");
        Course yingyu = new Course(3, "英语课", "综合楼803", "8：00", "王五");
        System.out.println("\n");
        System.out.print("老师信息");
        Teacher zhang = new Teacher(1, "张三", "男", 1);
        Teacher li = new Teacher(2, "李四", "男", 2);
        Teacher wang = new Teacher(3, "王五", "男", 3);
        System.out.println("\n\n");
        System.out.print("学生信息");
        Student lys = new Student(1, "刘云嵩", "男", 0);
        Student zl = new Student(2, "赵六", "男", 0);
        Student lq = new Student(3, "兰七", "男", 0);
        System.out.println("\n\n");

        int x = in.nextInt();
        System.out.println("请输入1,2,3进行学生选择: ");
        if (x == 1) {
            a = wuli;
            System.out.println("学生信息: " + lys);
        } else if (x == 2) {
            a = shuxue;
            System.out.println("学生信息: " + zl);
        } else if (x == 3) {
            a = yingyu;
            System.out.println("学生信息: " + lq);
        } else {
            System.out.println("无该学生");
        }
        int y = in.nextInt();        // Scanner 类来获取用户的输入
        System.out.println("请输入1,2,3进行选课: ");
        if (y == 1) {
            a = wuli;
            System.out.println("已选课: " + wuli);
            System.out.println(zhang);
        } else if (y == 2) {
            a = shuxue;
            System.out.println("已选课: " + shuxue);
            System.out.println(li);
        } else if (y == 3) {
            a = yingyu;
            System.out.println("已选课: " + yingyu);
            System.out.println(wang);
        } else {
            System.out.println("不含该课程");
        }
        int z = in.nextInt();        // Scanner 类来获取用户的输入
        System.out.println("请输入1,2,3进行退课（与原课程相同才可以退课）: ");

        while (y == 1)      // 确保只能退已选课程
            if (z == 1) {
                a = wuli;
                System.out.println("已退课: " + wuli);
                System.out.println("退课成功");
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (y == 2)
            if (z == 2) {
                a = shuxue;
                System.out.println("已退课: " + shuxue);
                System.out.println("退课成功");
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (y == 3)
            if (z == 3) {
                a = shuxue;
                System.out.println("已退课: " + shuxue);
                System.out.println("退课成功");
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }
    }
}