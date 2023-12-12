package Arrays_Strings;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {



        Scanner s= new Scanner(System.in);
        System.out.println("Please enter array size");
       int size=s.nextInt();


        int[] i=new int[size];


        System.out.println("Please Insert array element");

        for(int x=0;x<i.length;x++){

          i[x] =s.nextInt();
        }
        System.out.println("array elements");
        for(int z=0;z< i.length;z++)
            System.out.println(i[z]);
    }
}
