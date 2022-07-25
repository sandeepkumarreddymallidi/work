package coms.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static java.lang.Math.abs;

public class Example4{
    public static void main(String[] args) {
        int[] i = {0,1,2,3,4,5,6,7,8};
        List<Integer> list=new ArrayList<>();
        for (int j:i){
            list.add(j);
        }
        list.stream().sorted(Example4::compareTwoNumbers).forEach(c-> System.out.print(c+" "));
    }
    static int compareTwoNumbers(int a,int b) {
        String c=Integer.toBinaryString(a);
        System.out.print(a+" ");
        String c2=Integer.toBinaryString(b);
        System.out.print(b+"  ");
        System.out.println();
        int onesInA=0,onesInB=0;
        for (int i=0;i<c.length();i++){
            if(c.charAt(i)=='1'){
                onesInA++;
            }
        }
        for (int i=0;i<c2.length();i++){
            if(c2.charAt(i)=='1'){
                onesInB++;
            }
        }
        if(onesInA>onesInB){
            return 1;
        }
        else if (onesInA<onesInB){
            return -1;
        }
        else {
            if(a<b){
                return -1;
            }
            else
                return 1;
        }
    }
}
