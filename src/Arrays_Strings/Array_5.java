package Arrays_Strings;

import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the values");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("arrays are");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
