package com.liuxiaocs._12自定义泛型接口;

public class StudentData implements Data<Student> {

    @Override
    public void add(Student student) {
        System.out.println("添加学生！");
    }

    @Override
    public void delete(Student student) {
        System.out.println("删除学生！");
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void query(int id) {

    }
}
