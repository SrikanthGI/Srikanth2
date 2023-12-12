package Arrays_Strings;

import java.util.Scanner;

public class Array_5_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int size=sc.nextInt();
        int [] i=new int [size];


        System.out.println("enter array elements");

        for(int x=0;x<i.length;x++){
            i[x]=sc.nextInt();
        }

        System.out.println("Array elements");
        for(int z=0;z<i.length;z++)
            System.out.println(i[z]);
    }
}
