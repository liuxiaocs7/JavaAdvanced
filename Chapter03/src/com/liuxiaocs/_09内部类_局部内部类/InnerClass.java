package com.liuxiaocs._09内部类_局部内部类;

/**
 * 目标：局部内部类
 *
 * 定义在方法中，在构造器中，for循环中定义的内部类
 * 就是局部内部类。
 *
 * 局部内部类中的成分特点：
 *      只能定义实例成员，不能定义静态成员(比如方法可能会加载多次)
 *      可以定义常量
 *
 * 小结：
 *      局部内部类没啥用
 */
public class InnerClass {

    static {
        abstract class A {

        }
    }

    public static void main(String[] args) {
        class A {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void test() {

            }
        }

        A a = new A();
        a.test();
    }

    public void test() {
        class Animal {

        }

        class Cat extends Animal {

        }
    }
}
