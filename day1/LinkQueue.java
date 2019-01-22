package org.day1;

import java.util.LinkedList;

public class LinkQueue {//用linkedlist模拟队列
    public static void main(String[] args) {

        LQueue lQueue = new LQueue();
        for (int i = 0; i <10 ; i++) {
            lQueue.qpush(i);
        }
        lQueue.play();
        System.out.println("队列末尾元素为："+lQueue.qfirst());
        System.out.println("弹出的元素为："+lQueue.qpop());
        lQueue.play();
    }




    static class  LQueue {
       LinkedList list = new LinkedList();

       public void qpush(Object o){//添加元素
           list.addFirst(o);

       }

       public Object qfirst(){//获取队列末尾元素
           return list.getLast();
       }

       public Object qpop(){//删除队列尾部元素
           return list.removeLast();
       }

       public void play(){//打印队列里所有元素
           System.out.println("队列中的元素为："+list);
       }
    }


}
