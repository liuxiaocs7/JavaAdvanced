package com.liuxiaocs._14final关键字;

/**
 * 目标：final修饰实例成员变量
 *
 * final修饰变量的总规则：有且仅能被赋值一次
 *
 * 扩展：
 *      final修饰实例成员变量可以在哪些地方赋值1次
 *          1.定义的时候赋值一次
 *          2.可以在实例代码块中赋值一次
 *          3.可以在每个构造器中赋值一次
 */
public class FinalDemo04 {
    private final String name = "黑马";
    private final String name1;
    private final String name2;
    {
        // 可以在实例代码块中赋值一次
        name1 = "黑马1";
    }

    public FinalDemo04() {
        // 实例代码块中的代码其实就是放到构造器中执行的
        name2 = "黑马2";
    }

    public FinalDemo04(String name) {
        // 在这个构造器中也需要赋值一次。
        // 如果final修饰的实例变量在构造器中赋值，那么在每个构造器中都需要赋值一次
        // 因为实际使用过程中不确定究竟是用的哪个构造器
        name2 = "黑马2";
    }

    public static void main(String[] args) {
        FinalDemo04 f = new FinalDemo04();
        System.out.println(f.name);
        // f.name = "黑马Java";  // 报错，第二次赋值
        System.out.println(f.name1);
        System.out.println(f.name2);

        FinalDemo04 hhh = new FinalDemo04("hhh");
    }
}
