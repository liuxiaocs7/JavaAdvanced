package com.liuxiaocs._06继承的概述;

/**
 * 目标：继承(extends)的概述
 *
 * 面向对象的三大特征：封装，继承，多态。
 *
 * 继承是Java中一般到特殊的关系，是一种子类到父类的关系。
 *      例如：学生类继承了人类。猫类继承了动物类
 *
 * 被继承的类称为：父类/超类
 * 继承父类的类称为：子类
 *
 * 继承的作用？
 *      "可以提高代码的复用"，相同代码可以定义在父类中
 *      然后子类直接继承父类，就可以直接使用父类的这些代码乐。
 *      (相同代码重复利用)
 *
 * 子类更强大：子类不仅得到了父类的功能，它还有自己的功能。
 *
 * 继承的特点：
 *      子类继承了一个父类，子类就可以直接得到父类的属性(成员变量)和行为(方法)了
 *
 * 继承的格式:
 *      子类 extends 父类 {
 *
 *      }
 *
 * 小结：
 *      继承是子类到父类的一种关系
 *      子类继承了一个父类，子类就可以直接得到父类的属性和行为了
 *      在Java中继承是"is a"的关系。Cat extends Animal: 猫是一个动物
 *      在Java中，子类是更强大的，子类不仅继承了父类的功能，自己还可以定义自己的功能
 */
public class ExtendsDemo {
}

class Animal {

}

class Cat extends Animal {

}
