package Questions;

import java.util.Scanner;

//Write a Java program to display n terms of natural numbers and their sum.
public class Q6 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("number is : "+i);
            sum+=i;

        }
        System.out.println("sum of first "+n+" natural numbers : "+sum);
    }
}
