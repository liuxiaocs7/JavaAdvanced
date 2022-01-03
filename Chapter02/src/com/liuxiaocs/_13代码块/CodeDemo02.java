package com.liuxiaocs._13代码块;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：实例代码块研究
 *
 * 类有5大成分：成员变量，方法，构造器，代码块，内部类
 *
 * 代码块按照有无static修饰可以分为：静态代码块，实例代码块。
 *
 * (1) 静态代码块：
 *      格式：static {
 *
 *      }
 *      -- 必须用static修饰。属于类，会与类一起优先加载，而且自动触发执行一次
 *      -- 静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作
 * 小结：
 *      静态代码块属于类的成分，应该用static修饰。属于类，会与类一起优先加载，而且自动触发执行一次、
 *      静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作
 *
 * (2) 实例代码块
 *      格式: {}
 *      -- 必须无static修饰。属于类的每个对象的，会与类的对象一起加载，每次创建对象的时候，实例代码块就会触发执行一次
 *      -- 实例代码块可以用于初始化实例资源(拓展)
 *      -- 实例代码块的代码实际上是提取到每个构造器中去执行的
 */
public class CodeDemo02 {
    private String name;
    {
        System.out.println("实例代码块执行一次~~~~~");
        name = "黑马";
    }

    // public CodeDemo02() {
    //     System.out.println("实例代码块执行一次~~~~~");
    //     name = "黑马";
    // }

    public static void main(String[] args) {
        System.out.println("main方法执行一次~~~");
        CodeDemo02 c1 = new CodeDemo02();
        System.out.println(c1.name);
        CodeDemo02 c2 = new CodeDemo02();
        System.out.println(c2.name);
    }
}
