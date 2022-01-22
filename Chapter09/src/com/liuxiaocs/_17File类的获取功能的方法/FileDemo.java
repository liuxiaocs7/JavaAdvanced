package com.liuxiaocs._17File类的获取功能的方法;


import java.io.File;

/**
 目标：File类的获取功能的API
 - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
 - public String getPath()  ： 获取创建文件对象的时候用的路径
 - public String getName()  ： 返回由此File表示的文件或目录的名称。
 - public long length()  ：    返回由此File表示的文件的长度。
 */
public class FileDemo {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File f1 = new File("D:\\testFile\\tt1.jpg");
        // a.获取它的绝对路径。 D:\testFile\tt1.jpg
        System.out.println(f1.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。 D:\testFile\tt1.jpg
        System.out.println(f1.getPath());
        // c.获取文件的名称：带后缀。 tt1.jpg
        System.out.println(f1.getName());
        // d.获取文件的大小，字节个数。 65934
        System.out.println(f1.length());

        System.out.println("=========================");

        // 2.相对路径
        File f2 = new File("Chapter09/src/dlei01.txt");
        // a.获取它的绝对路径。 D:\Development\Code\IdeaProjects\JavaAdvanced\Chapter09\src\dlei01.txt
        System.out.println(f2.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。  Chapter09\src\dlei01.txt
        System.out.println(f2.getPath());
        // c.获取文件的名称：带后缀。 dlei01.txt
        System.out.println(f2.getName());
        // d.获取文件的大小，字节个数。 6
        System.out.println(f2.length());
    }
}
