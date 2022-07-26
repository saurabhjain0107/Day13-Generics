package com.bridgelabz.datastructure;

import java.util.Scanner;

public class GenericsLargestNum {
    static int x;
    static  int y;
    static  int z;
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max)> 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter three value");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.println("maximum number:"+ maximum(x,y,z));

    }
    }
