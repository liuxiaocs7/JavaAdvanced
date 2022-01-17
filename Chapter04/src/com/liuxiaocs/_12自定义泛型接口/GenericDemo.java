package com.liuxiaocs._12自定义泛型接口;

/**
 * 目标：泛型接口。
 *
 * 什么是泛型接口？
 *      使用了泛型定义的接口就是泛型接口。
 * 泛型接口的格式：
 *      修饰符 interface 接口名称<泛型变量> {
 *
 *      }
 *
 * 需求：教务系统，提供一个接口可约束一定要完成数据(学生、老师)的增删改查操作
 *
 * 小结：
 *      泛型接口的核心思想，在实现接口的时候传入真实的数据类型
 *      这样重写的方法就是对该数据类型进行操作
 *
 */
public class GenericDemo {
    public static void main(String[] args) {
        Data stuData = new StudentData();
        Data<Student> studentData = new StudentData();
        stuData.add(new Student());
        stuData.delete(new Student());

        Data<Teacher> teacherData = new TeacherData();
        teacherData.add(new Teacher());
        teacherData.delete(new Teacher());
    }
}
