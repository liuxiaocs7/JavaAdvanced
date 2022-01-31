package com.liuxiaocs._02InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 目标：InetAddress类概述
    一个该类的对象就代表一个IP地址对象。
 InetAddress类成员方法：
     static InetAddress getLocalHost()
        * 获得本地主机IP地址对象。
     static InetAddress getByName(String host)
        * 根据IP地址字符串或主机名获得对应的IP地址对象。
     String getHostName()
        * 获得主机名。
     String getHostAddress()
        * 获得IP地址字符串。
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws IOException {
        // 1.获取本机地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());  // LAPTOP-xxxxxxxx
        // 默认拿公网ip，然后拿局域网ip
        System.out.println(ip.getHostAddress());  // 192.168.200.1

        // 2.获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());  // www.baidu.com
        System.out.println(ip2.getHostAddress());  // 182.61.200.6

        // 3.获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("182.61.200.6");
        System.out.println(ip3.getHostName());  // www.baidu.com
        System.out.println(ip3.getHostAddress());  // 182.61.200.6

        // 4.判断是否能通,ping,5s之内测试是否可通
        System.out.println(ip2.isReachable(5000));
    }
}
