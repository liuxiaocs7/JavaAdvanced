package com.liuxiaocs._05异常_编译时异常的处理机制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：编译时异常的处理方式二
 *
 * 方式二：在出现异常的地方自己处理，谁出现谁处理。
 *
 * 自己捕获异常和处理异常的格式：捕获处理
 *      try {
 *          // 监视可能出现异常的代码
 *      }catch(异常类型1 变量) {
 *          // 处理异常
 *      }catch(异常类型2 变量) {
 *          // 处理异常
 *      }...
 *
 * 监视捕获处理异常企业级写法：
 *      try{
 *          // 监视可能出现异常的代码
 *      }catch(异常类型1 变量) {
 *          e.printStackTrace(); // 直接打印异常栈信息
 *      }catch(异常类型2 变量) {
 *          // 处理异常
 *      }...
 *      Exception可以捕获处理一切异常类型！
 *
 * 小结：
 *      第二种方式，可以处理异常，并且出现异常后代码也不会死亡。
 *      这种方案还是可以的。
 *      但是从理论上来说，这种方式不是最好的。上层不知道操作是成功还是失败的。
 *      上层调用者不能直接知道底层的执行情况。
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。");
        parseDate("2013-03-23 10:19:23");
        System.out.println("程序结束。。。。。。");
    }

    private static void parseDate(String time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d = sdf.parse(time);
            System.out.println(d);

            InputStream is = new FileInputStream("D:/file.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private static void parseDate(String time) {
    //     try {
    //         SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
    //         Date d = sdf.parse(time);
    //         System.out.println(d);
    //
    //         InputStream is = new FileInputStream("D:/file.jpg");
    //     } catch (ParseException | FileNotFoundException e) {
    //         e.printStackTrace();
    //     }
    // }

    // private static void parseDate(String time) {
    //     try {
    //         SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
    //         Date d = sdf.parse(time);
    //         System.out.println(d);
    //
    //         InputStream is = new FileInputStream("D:/file.jpg");
    //     } catch (ParseException e) {
    //         System.err.println("解析有问题，请检查代码");
    //         e.printStackTrace();
    //     } catch (FileNotFoundException e) {
    //         System.err.println("文件根本不存在");
    //         e.printStackTrace();
    //     }
    // }
}
