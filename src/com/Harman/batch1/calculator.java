package com.Harman.batch1;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        int result=0;
        addition add = new addition();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int b=sc.nextInt();
       result=add.addition2(a,b);
        System.out.println(result);
    }



}


