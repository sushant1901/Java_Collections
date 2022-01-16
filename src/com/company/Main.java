package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(0,1);// adding element to l1
        l1.add(1,2);
        System.out.println(l1);//printing element in list 1

        List<Integer> l2= new ArrayList<Integer>();
        l2.add(1);//adding element tol2
        l2.add(2);
        l2.add(3);

        l1.addAll(1,l2);// merging l2 into l1..
        System.out.println(l1);// printing updated l1....

        l1.remove(1);// removing element from index 1........
        System.out.println(l1);

        System.out.println(l1.get(3));// printing element at indecx 3...
        l1.set(0,5);
        System.out.println(l1);


    }
}
