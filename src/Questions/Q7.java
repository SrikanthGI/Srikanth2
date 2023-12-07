package Questions;

import java.util.Scanner;

//Write a Java program to display the cube of the given number up to an integer.
public class Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("cube of "+i+" is : "+i*i*i);
        }
    }
}
