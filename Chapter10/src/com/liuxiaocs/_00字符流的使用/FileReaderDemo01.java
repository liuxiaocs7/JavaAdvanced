package com.liuxiaocs._00字符流的使用;

import java.io.FileReader;
import java.io.Reader;

/**
 目标：字符输入流的使用。

 IO流的体系：
            字节流                                   字符流
 字节输入流           字节输出流               字符输入流       字符输出流
 InputStream         OutputStream            Reader         Writer     (抽象类)
 FileInputStream     FileOutputStream        FileReader     FileWriter (实现类)

 c.FileReader:文件字符输入流。
    -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
        简单来说，读取文本文件内容到内存中去。
    -- 构造器：
        public FileReader(File file):创建一个字符输入流与源文件对象接通。
        public FileReader(String filePath):创建一个字符输入流与源文件路径接通。
    -- 方法：
        public int read(): 读取一个字符的编号返回！ 读取完毕返回-1
        public int read(char[] buffer):读取一个字符数组，读取多少个字符就返回多少个数量，读取完毕返回-1
 小结：
        字符流一个一个字符的读取文本内容输出，可以解决中文读取输出乱码的问题。
        字符流很适合操作文本文件内容。
        但是：一个一个字符的读取文本内容性能较差！！
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件对象定位源文件
        // File f = new File("Chapter10/src/dlei01.txt");
        // 2.创建一个字符输入流管道与源文件接通
        // Reader fr = new FileReader(f);
        // 3.简化写法：创建一个字符输入流管道与源文件路径接通
        FileReader fr = new FileReader("Chapter10/src/dlei01.txt");
        // 4.按照字符读取，每次读取一个字符的编号返回
        // 读取的是一个字符的编号，可以直接将这个编号转为字符，汉字也是适用的
        // 读取完毕返回-1
        // int code = fr.read();
        // System.out.println((char)code);
        // int code1 = fr.read();
        // System.out.println((char)code1);
        // int code2 = fr.read();
        // System.out.println((char)code2);
        // int code3 = fr.read();
        // System.out.println((char)code3);
        // 5.while循环一个一个字符读取。
        // 定义一个变量存储一个字符的编号
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }
    }
}
