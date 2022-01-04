package com.liuxiaocs._16枚举类;

/**
 * 目标：枚举类用于做信息标志和信息分类
 *
 * 常量做信息分类和标志：虽然也挺好，但是入参不受控制，入参太随性无法严谨
 * 枚举类用于做信息标志和信息分类：优雅！
 *
 * 小结：
 *      建议以后做信息标志和信息分类采用枚举进行！
 */
enum Oritation {
    UP, DOWN, LEFT, RIGHT;
}

public class EnumDemo02 {
    // public static final int UP = 0;
    // public static final int DOWN = 1;
    // public static final int LEFT = 2;
    // public static final int RIGHT = 3;

    public static void main(String[] args) {
        move(Oritation.LEFT);
    }

    // 控制玛丽的移动
    // switch case里面不再需要添加Oritation类型了，直接写枚举里面的值即可
    public static void move(Oritation oritation) {
        switch (oritation) {
            case UP:
                System.out.println("控制玛丽往👆跳~~~");
                break;
            case DOWN:
                System.out.println("控制玛丽往👇跳~~~");
                break;
            case LEFT:
                System.out.println("控制玛丽往👈跳~~~");
                break;
            case RIGHT:
                System.out.println("控制玛丽往👉跳~~~");
                break;
        }
    }
}
