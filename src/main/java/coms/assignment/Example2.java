package coms.assignment;

public class Example2 {
    public static void main(String[] args) {
        int arr[] = { 9, 0, 1, 2, 3, 4, 7, 5, 6, 8 };
        int n = arr.length;
        int aux[] = new int[n];
        int a;
        for (int i = 0; i < n; i++) {
            a = arr[i];
            int count = 0;
            while (a > 0) {
                if ((a & 1) > 0)
                    count ++;
                a = a >> 1;
            }
            aux[i]=count;
        }
        for (int i = 1; i < n; i++) {
            int key1 = aux[i];
            int key2 = arr[i];
            int j = i - 1;
            while (j >= 0 && aux[j] < key1) {
                aux[j + 1] = aux[j];
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            aux[j + 1] = key1;
            arr[j + 1] = key2;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    }