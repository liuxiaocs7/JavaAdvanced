package com.liuxiaocs._08打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
     目标：打印流改变输出的流向。重定向。

     System:
        public static void setOut(PrintStream out) :让系统的输出流向打印流。
 */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        // 控制台
        System.out.println("==helloworld0==");
        PrintStream ps = new PrintStream("Chapter10/src/log.txt");
        System.setOut(ps);  // 让系统的输出流向打印流

        System.out.println("==helloworld1==");
        System.out.println("==helloworld2==");
        System.out.println("==helloworld3==");
        System.out.println("==helloworld4==");
        System.out.println("==helloworld5==");
    }
}
