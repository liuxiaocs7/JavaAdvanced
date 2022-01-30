package com.liuxiaocs._08打印流;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
    目标：打印流PrintStream / PrintWriter.

    打印流的作用：
        1.可以方便，快速的写数据出去。
        2.可以实现打印啥出去，就是啥出去。
    打印流的构造器：
        public PrintStream(OutputStream os):
        public PrintStream(String filepath):

    小结：
        打印流可以方便，且高效的打印各种数据。打印流包了缓冲流。
        PrintStream不光可以打印数据，还可以写"字节数据"出去。 字节
        PrintWriter不光可以打印数据，还可以写"字符数据"出去。 字符
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.打印流PrintStream，可以包装低层次流、文件
        // OutputStream os = new FileOutputStream("Chapter10/src/dlei08.txt");
        // PrintStream ps = new PrintStream(os);
        PrintStream ps = new PrintStream("Chapter10/src/dlei08.txt");

        // 将数据打印入文件
        ps.println(97);  // 97
        ps.println(110);  // 110
        ps.println("我在快乐学习");
        ps.println(99.8);
        ps.println(false);
        ps.println('徐');

        // 写字节数据出去
        // ps.write("我爱你".getBytes());

        ps.close();
    }
}
