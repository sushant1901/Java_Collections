package com.company;

import java.util.*;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {
        int n=5;
        List<Integer>  s= new Stack <Integer>();
        for (int i=1;i<=n;i++) {
            s.add(i);
        }
        System.out.println(s);
        s.remove(3);
        System.out.println(s);
        for (int i=0;i<s.size();i++)
            System.out.print(s.get(i)+" ");
    }

}
