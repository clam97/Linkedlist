package org.day1;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.addFirst("1");
        list.addFirst("5");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        list.remove("5");//删除出现的第一个指定值
        list.remove("5");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.indexOf("2"));//查找指定值的位置
        list.subList(0,2).clear();//删除范围内的值
        System.out.println(list);
    }
}
