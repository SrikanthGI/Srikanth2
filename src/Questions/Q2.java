package Questions;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int i= sc.nextInt();
        if(i>0){
            System.out.println("Positive number");
        } else if (i<0) {
            System.out.println("negative number");
        }
        else{
            System.out.println(" number is Zero");
        }
    }
}
