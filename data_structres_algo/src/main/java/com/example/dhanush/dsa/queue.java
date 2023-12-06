package com.example.dhanush.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

     public static void queueimpl() {
        Queue<String> q = new LinkedList<>();
        q.add("one");
        q.add("two");
        q.add("three");
        System.out.println(q);

        q.remove("two");
        System.out.println(q);
        //queue.remove() method can remove any element from the que-but doc says its head only    
    }
    
}
