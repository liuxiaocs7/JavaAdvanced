package com.liuxiaocs._02抽象类的使用;

/**
 * 目标：抽象类的使用
 *
 * 抽象类的作用：为了被子类继承
 *
 * 小结：
 *      抽象类是为了被子类继承，约束子类要重写抽象方法
 *      注意：一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Teacher boZai = new Teacher();
        boZai.work();

        Manager boNiu = new Manager();
        boNiu.work();
    }
}

// 班主任
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("班主任要管理提醒学生~~~");
    }

    @Override
    public void run() {

    }
}

// 讲师
class Teacher extends Employee {
    @Override
    public void work() {
        System.out.println("讲师需要讲课");
    }

    @Override
    public void run() {

    }
}

// 需求：一家公司开发员工管理系统(讲师，班主任)
abstract class Employee {
    // 子类都要完成工作这个功能，但是每个子类的工作内容不一样，那么就定义成抽象方法
    public abstract void work();
    public abstract void run();
}
