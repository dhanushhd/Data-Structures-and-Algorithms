package com.example.dhanush.dsa;

import java.util.*;

public class ResizingArray {
    /**
     * Arary is of fixed length if i want to use someting dyna,ic i can have List interface
     * 
     */

    public static void arrayDemo() {
    int[] a = new int[10];
    a[0] = 1;
    a[2] = 2;
    List<String> l = new ArrayList<>();
    l.add("HI");
    System.out.println(l);

        for (int i=0; i < 10; i++) {
        System.out.println(a[i]);
    }

    }
    
    

}
