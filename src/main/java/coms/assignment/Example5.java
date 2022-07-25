package coms.assignment;

public class Example5 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 1; i < a.length; i++) {
                String c = Integer.toBinaryString(a[i]);
                System.out.print(a[i]+" ");
                String c2 = Integer.toBinaryString(a[i-1]);
                System.out.print(a[i-1]+" ");
                System.out.println();
                int onesInA = 0, onesInB = 0;
                for (int j = 0; j < c.length(); j++) {
                    if (c.charAt(j) == '1') {
                        onesInA++;
                    }
                }
                for (int j = 0; j < c2.length(); j++) {
                    if (c2.charAt(j) == '1') {
                        onesInB++;
                    }
                }
                if (onesInA > onesInB) {

                }
                else if (onesInA < onesInB) {
                    int x = a[i];
                    a[i] = a[i-1];
                    a[i-1] = x;
                }
                else {
                    if (a[i - 1] > a[i]) {

                    }
                    else {
                        int x = a[i];
                        a[i] = a[i-1];
                        a[i-1] = x;
                    }
                }

            }
        for(int i:a){
            System.out.print(a[i]+" ");
        }
        }
    }
