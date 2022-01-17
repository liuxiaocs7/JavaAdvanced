package com.liuxiaocs._12自定义泛型接口;

public class TeacherData implements Data<Teacher> {
    @Override
    public void add(Teacher teacher) {
        System.out.println("添加老师");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("删除老师");
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void query(int id) {

    }
}
