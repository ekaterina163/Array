package com.company;
import java.util.Arrays;


public class Main
{

    public static void main(String[] args) {
        int arrayNummer[];
        arrayNummer = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // n1. create array from 1 to 10.
        int[] array2 = fillArray(20);
        System.out.println("1. Array : " + array2[14]);
        int [] arr = {10, 20, 30, 40, 50};
        int [] arr1 = {1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int cc = 20;
        reverse(arr, arr.length);
        replace(arr1);
        aaa(arr1);
        System.out.println(Arrays.toString(arr));
//        fibonacci(cc);
        System.out.println("Fibonacci of "+ cc + ": "+ fibonacci(cc));
//        System.out.print(previousNumber+" ");
//        getNumber(arr1);
    }
    static int[] fillArray(int length) {
        int[] index = new int[length];
        for (int i = 0; i < length; i++) {
            index[i] = i + 1;
        }
        System.out.println("2. Array : " +index[5]);
        return index;
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    static void fillArray3() {
        int[] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
        static void reverse(int a[], int n)
        {
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }
            /*printing the reversed array*/
            System.out.print("Reversed array is: \n");
            for (int k = 0; k < n; k++) {
                System.out.print(b [k]+" " );
            }
        }
            static void replace(int [] array) {
                System.out.println(" ");
                System.out.println("Replace odd with 0: ");
                for (int i = 1; i < array.length; i++) {
                    if (i%2==0){
                        System.out.print(" "+i);
                    }
                    else {
                        System.out.print(" "+0);
                    }
                }
            }
            static int[] oddInZero(int[]x){
        int[] res = new int [x.length];
        for(int i=0; i< x.length; i++){
            if( i % 2==0){
                res[i]=x[i];
            } else {
                res[i]=0;
            }
        }
                System.out.println(" "+ res);
        return res;
            }
    static void replaceOn(int[]c) {
        int[] re = new int[c.length];
        for( int i=0;i < c.length; i ++ ){
            if(i%1==0){
                re[i] = c [ c.length-1-i ];
            } else {
                re[i] = c.length;
            }
        }
        System.out.println("Reversed: " + re);
    }
    static boolean aaa (int [] d) {
        System.out.println(" ");
        System.out.println(" Inside aaa ");

        d = new  int [6];
//     d = new int{0,1,3,6,9,24,13,15,15};
 //        int[] r = new int [d.length];
        for( int i=0;i < d.length; i ++ ){
            if(d[i]%2==1){
                System.out.println(" T ");
                return true;
            }
        }
        System.out.println("F");
         return false;
    }
//        static void addOdd (int[] f) {
//        int [] myList = {1, 2, 3, 4, 5, 6, 7,8,9};
//        int total = 0;
//        for (int i = 0; i < myList.length; i++) {
//        if(i%2==0){
//            total += myList[i];
//        }
//        System.out.println("Сумма элементов: " + total);
//    }
//    Fibonacci algorithm

    static int fibonacci (int fib){
        int maxN = 20;
        int previousNumber = 0;
        int nextNumber = 1;
//        System.out.println("Fibonacci of "+ maxN + " ");
//        System.out.print(previousNumber+" ");
        for (int i = 1; i < maxN; ++i)
        {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return previousNumber;
    }
    }
