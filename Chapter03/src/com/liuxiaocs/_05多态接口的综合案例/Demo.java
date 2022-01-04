package com.liuxiaocs._05多态接口的综合案例;

/**
 * 扩展：面向对象思想设计一个电脑对象，可以接入2个USB设备
 *      (鼠标，键盘：实现接入，调用独有功能，拔出)
 *
 * 分析：
 *      (1) 提供2个USB设备。(USB) 设备必须满足：接入和拔出的功能
 *      (2) 定义一个USB接口(申明USB设备的规范必须是实现接入和拔出的功能)
 *      (3) 开始定义2个真实的实现类代表鼠标和键盘
 *      (4) 定义一个电脑类
 */
public class Demo {
    public static void main(String[] args) {
        // 1.买一部电脑
        Computer c = new Computer();
        // 2.买一个鼠标
        USB xiaoMi = new Mouse("小米");
        c.installUSB(xiaoMi);
        // 3.买一个键盘
        KeyBoard sfy = new KeyBoard("双飞燕");
        c.installUSB(sfy);
    }
}

class Computer {
    // 提供一个安装USB设备的入口
    public void installUSB(USB usb) {
        usb.connect();
        // usb可能是鼠标，也可能是键盘
        if (usb instanceof Mouse) {
            ((Mouse) usb).dbClick();
        } else if (usb instanceof KeyBoard) {
            ((KeyBoard) usb).keyDown();
        }
        usb.unconnect();
    }
}

// 定义2个USB设备：鼠标：键盘。
class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    // 双击
    public void dbClick() {
        System.out.println(name + "双击了老铁666");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入了设备~~~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功拔出了设备~~~");
    }
}

class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    // 按键
    public void keyDown() {
        System.out.println(name + "写下了来了老弟~~记得点亮小红心♥");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入了设备~~~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功拔出了设备~~~");
    }
}

// 定义USB的规范，必须要完成接入和拔出的功能！！
interface USB {
    void connect();  // 接入
    void unconnect();  // 拔出
}