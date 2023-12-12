package Arrays_Strings;

import java.util.Scanner;

public class Array_Size {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();

        int [] a=new int[size];
        System.out.println("enter the arrays");
        for(int i=0;i<a.length;i++){
          a[i]= sc.nextInt();
        }
        System.out.println("array values");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

    }
}
