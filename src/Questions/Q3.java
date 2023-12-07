package Questions;

import java.util.Scanner;

/* Write a Java program that takes three numbers from the user and prints the greatest number.
 Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87*/
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int i=sc.nextInt();
        System.out.println("enter second number");
        int j=sc.nextInt();
        System.out.println("enter third number");
        int k=sc.nextInt();
        if(i>j && i>k){
            System.out.println(i+" is the greatest number");
        } else if (j>i && j>k) {
            System.out.println(j+" i greatest number");
        }
        else{
            System.out.println(k+" is greatest number");
        }
    }
}
