package coms.example;

import java.util.Deque;
import java.util.LinkedList;


public class Queues {
    public static void main(String[] args) {
        Deque qu=new LinkedList();
        qu.add(24);
        qu.add(35);
        qu.add(20);
        System.out.println(qu);
        qu.addFirst(55);
        qu.addLast(45);
        qu.pollFirst();
        qu.pollLast();
        System.out.println(qu);

    }
}
