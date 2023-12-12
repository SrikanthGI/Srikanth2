package Arrays_Strings;

import java.util.Scanner;

public class Array_6_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int [] a=new int[size];


        System.out.println("insert array values");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Array elements");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
