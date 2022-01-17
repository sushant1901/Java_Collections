package com.company;
import java.io.*;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        int n=5;
        List<Integer> v= new Vector<Integer>(n);
        for (int i=1;i<=n;i++) {
            v.add(i);
        }
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for (int i=1;i<v.size();i++)
            System.out.print(v.get(i)+" ");
    }

}
