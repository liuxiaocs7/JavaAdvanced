package com.liuxiaocs._06方法引用方式一_静态方法的引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：方法引用有四种形式：
 *      1.静态方法的引用。
 *      2.实例方法的引用。
 *      3.特定类型方法的引用。
 *      4.构造器引用
 *
 * 1.静态方法的引用。
 *      引用格式：
 *          类型::静态方法
 *      简化步骤：
 *          a.定义一个静态方法，把需要简化的代码放到一个静态方法中去。
 *      静态方法引用的注意事项：
 *          "重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。" 满足这个条件才能用方法引用简化
 *          如果函数式接口中的抽象方法有返回值，则被引用的方法必须也有相同的返回值。
 *          如果函数式接口中的抽象方法没有返回值，则被引用的方法可以有返回值，也可以没有返回值
 *
 * 小结：
 *      静态方法引用简化Lambda表达式
 *      前面的参数后后面方法的参数个数一样的情况才能尝试方法引用简化。
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        Student s1 = new Student("李铭",18,'男');
        Student s2 = new Student("冯龙",23,'男');
        Student s3 = new Student("王乐乐",21,'男');
        Collections.addAll(lists , s1 , s2 , s3);

        System.out.println(lists);

        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 1.匿名内部类去掉多余内容：
        Collections.sort(lists, (a, b) -> { return a.getAge() - b.getAge(); });

        // 2.类型可以省略
        // 参数类型可以省略，因为类型是固定的了，在这里只能是学生类型了
        Collections.sort(lists, (a, b) -> { return a.getAge() - b.getAge(); });

        // 3.只有一个return语句可以继续省略return
        // 省略大括号，return，分号
        Collections.sort(lists, (a, b) -> a.getAge() - b.getAge());

        System.out.println(lists);

        // 使用静态方法进行简化！
        Collections.sort(lists, (o1, o2) -> Student.compareByAge(o1 , o2));
        // 将比较封装到方法里面了
        // 如果前后参数是一样的，而且方法是静态方法，既可以使用静态方法引用
        Collections.sort(lists, Student::compareByAge);

        System.out.println(lists);
    }
}
