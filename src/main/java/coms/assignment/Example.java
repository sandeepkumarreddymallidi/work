package coms.assignment;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Example  {
    public static void main(String[] args) {

        int x = 5;
        int[] a = {128,64,32,16,8,4,1,2,1024,512,256};
        String[] str = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            System.out.print(a[i]+"  ");
            str[i] = Integer.toBinaryString(b);
        }
        System.out.println();
        String[] arr = new String[a.length];
        int[] length = new int[a.length];
        for (int i = 0; i < str.length; i++) {
            //length[i]=str[i].length();
            if(a[i]!=2) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].length() > str[j].length()) {
                        int z = a[j];
                        a[j] = a[i];
                        a[i] = z;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
         }
        }
    }