package com.liuxiaocs._11JDK1_8开始之后即可新增的方法;

/**
 * 目标：JDK1.8开始之后接口新增的三个方法(Lambda Stream 函数式接口)
 *
 * JDK1.8之前接口中只能是抽象方法和常量，
 * JDK1.8之后接口不再纯洁
 * JDK1.8之后接口新增了三个方法：
 *      (1) 默认方法: 其实就是我们之前写的实例方法;
 *              -- 必须用default修饰
 *              -- 默认会加public修饰
 *              -- 只能用接口的实现类的对象来调用
 *      (2) 静态方法:
 *              -- 可以直接加static修饰
 *              -- 默认会加public修饰
 *              -- 接口的静态方法只能用接口的类名称本身调用
 *      (3) 私有方法:(其实是从JDK1.9才开始支持的)
 *              -- 其实就是私有的实例方法，必须加private修饰。
 *              -- 私有的实例方法。只能在本接口中被访问
 *                 私有方法通常是给私有方法或者给默认方法调用的
 *
 * 小结：
 *      记住语法
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPongMan zjk = new PingPongMan();
        zjk.run();
        SportMan.inAddr();
    }
}

class PingPongMan implements SportMan {

}

interface SportMan {
    // 1.默认方法: 其实就是我们之前写的实例方法
    // 只能用接口的实现类的对象来调用
    default void run() {
        // go();
        System.out.println("跑得很快~~~");
    }

    // 2.静态方法：可以直接加static修饰，默认会加public修饰。
    // 接口的静态方法只能用接口的类名称本身调用
    static void inAddr() {
        System.out.println("我们在吉山区！！！");
    }

    // 3.私有方法：私有的实例方法。只能在本接口中被访问
    // 私有方法通常是给私有方法或者给默认方法调用的
    // private void go() {
    //     System.out.println("开始~~");
    // }
}
