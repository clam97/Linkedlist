package org.day1;

import java.util.LinkedList;

public class LinkStack {//用Linkedlist模拟栈
    public static void main(String[] args) {
        Stackl stackl = new Stackl();
        for (int i = 0; i <10 ; i++) {
             stackl.lpush(i);
        }
        stackl.play();
        System.out.println("栈顶元素为："+stackl.ltop());
        System.out.println("弹出的元素为："+stackl.lpop());
        stackl.play();
        System.out.println("栈顶元素为："+stackl.ltop());

    }


    static class Stackl{

        LinkedList list = new LinkedList();

        public void lpush(Object o){//添加元素
             list.addFirst(o);
        }

        public Object ltop(){//获取栈顶元素
            return list.getFirst();

        }

        public Object lpop(){//删除栈顶元素（弹栈）
            return list.removeFirst();
        }

        public void play(){//打印栈里所有元素
            System.out.println("栈中的元素为："+list);
        }

    }
}
