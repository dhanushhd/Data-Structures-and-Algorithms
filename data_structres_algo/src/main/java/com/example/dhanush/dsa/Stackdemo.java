package com.example.dhanush.dsa;

import java.util.Stack;

public class Stackdemo {
    public static void stackDemo() {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        s.add("a");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        }
    
}
