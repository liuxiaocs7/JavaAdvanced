package com.liuxiaocs._07正则表达式的演示;

/**
 * 目标：深入学习正则表达式的写法
 *
 * 字符类：
 *      [abc] a、b或c(简单类)
 *      [^abc] 任何字符，除了a、b或c(否定)
 *      [a-zA-Z] a到z或A到Z，两头的字母包括在内(范围)
 *      [a-d[m-p]] a到d或m到p：[a-dm-p](并集)
 *      [a-z&&[def23]] d、e或f(交集)
 *      [a-z&&[^bc]] a到z，除了b和c：[ad-z](减去)
 *      [a-z&&[^m-p]] a到z，而非m到p: [a-lq-z](减去)
 *
 * 预定义字符类：
 *      .  任何字符
 *      \d 数字：   [0-9]
 *      \D 非数字:  [^0-9]
 *      \s 空白字符: [ \t\n\x0B\f\r]
 *      \S 非空白字符：[^\s]
 *      \w 单词字符：[a-zA-Z_0-9]
 *      \W 非单词字符: [^\w]
 *
 * 以上正则匹配只能校验单个字符。
 *
 * Greedy 数量词
 *      X? X，一次或一次也没有
 *      X* X，零次或多次
 *      X+ X，一次或多次
 *      X{n} X，恰好n次
 *      X{n,} X，至少n次
 *      X{n, m} X，至少n次，但是不超过m次
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        // public boolean matches(String regex)：判断是否与正则表达式匹配，匹配返回true
        // 只能是a或b或c
        System.out.println("a".matches("[abc]"));  // true
        System.out.println("z".matches("[abc]"));  // false

        // 不能出现a,b,c
        System.out.println("a".matches("[^abc]"));  // false
        System.out.println("z".matches("[^abc]"));  // true

        System.out.println("a".matches("\\d"));  // false
        System.out.println("3".matches("\\d"));  // true
        System.out.println("z".matches("\\w"));  // true
        System.out.println("z".matches("\\w"));  // true
        System.out.println("21".matches("\\w"));  // false
        System.out.println("你".matches("\\w"));  // false
        // 以上正则匹配只能校验单个字符

        // 校验密码
        // 必须是数字 字母 下划线 至少6位
        System.out.println("ssds3c".matches("\\w{6,}"));  // true
        System.out.println("ssdsc".matches("\\w{6,}"));   // false
        System.out.println("sdfsfds你好".matches("\\w{6,}"));

        // 验证码，必须是数字和字符，必须是4位
        System.out.println("dsd2".matches("[a-zA-Z0-9]{4}"));  // true
        System.out.println("A3d2".matches("[a-zA-Z0-9]{4}"));  // true
        System.out.println("A3dy2".matches("[a-zA-Z0-9]{4}")); // false

    }
}
