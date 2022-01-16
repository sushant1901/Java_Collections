package com.company;

import java.util.ArrayList;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("geeks");// adding element to list al
        al.add("geeks");
        al.add(1,"for");// adding at specific index
        for (int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");// iterating and printing elements....
        }
        System.out.println();
        for(String str : al){
            System.out.print(str +" ");
        }
    }
}
