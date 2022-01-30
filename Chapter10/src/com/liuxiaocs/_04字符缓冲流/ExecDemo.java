package com.liuxiaocs._04字符缓冲流;

import java.io.*;
import java.util.*;

/**
 目标：题目练习。

 需求：把《出师表》的文章顺序进行恢复到一个新文件中！！

 分析：
 （1）创建一个缓冲字符输入流对象包装字符输入流接通源文件。
 （2）定义一个List集合用于存储每段文章。
 （3）定义一个循环按照行读取每段文章，存入到List集合中去。
 （4）对List集合中的每个元素按照首字符排序。
 （5）创建一个缓冲字符输出流管道通向目标文件。
 （6）遍历List集合中的每个元素，通过缓冲字符输出管道写出到目标文件。
 （7）释放资源
 */
public class ExecDemo {
    public static final String SRC_FILE_PATH = "chapter10/src/csb";
    public static final String DEST_FILE_PATH = "chapter10/src/csb_sort";
    private static Map<Character, Integer> numMaps = new HashMap<>();
    static {
        numMaps.put('一', 1);
        numMaps.put('二', 2);
        numMaps.put('三', 3);
        numMaps.put('四', 4);
        numMaps.put('五', 5);
        numMaps.put('六', 6);
        numMaps.put('七', 7);
        numMaps.put('八', 8);
        numMaps.put('九', 9);
    }

    public static void main(String[] args) {
        List<String> paras = getParagraphs(SRC_FILE_PATH);
        sortParagraphs(paras);
        // paras.forEach(System.out::println);
        writeParagraphs(paras);
    }

    private static List<String> getParagraphs(String fileInPath) {
        List<String> paragraphs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileInPath))) {
            String line;
            while((line = br.readLine()) != null) {
                paragraphs.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paragraphs;
    }

    private static void sortParagraphs(List<String> paras) {
        paras.sort((s1, s2) -> {
            Integer i1 = numMaps.get(s1.charAt(0));
            Integer i2 = numMaps.get(s2.charAt(0));
            return Integer.compare(i1, i2);
        });
    }

    private static void writeParagraphs(List<String> paras) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DEST_FILE_PATH))) {
            for (String para : paras) {
                bw.write(para);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
