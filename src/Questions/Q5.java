package Questions;

import java.util.Scanner;

//Grade of student
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int i = sc.nextInt();
        if (i >=40 && i <= 50) {
            System.out.println("C Grade");
        } else if (i >= 51 && i <=60) {
            System.out.println("B Grade");
        } else if (i >= 61 && i <= 70) {
            System.out.println("B+ Grade");
        } else if (i >= 71 && i <= 80) {
            System.out.println("A Grade");
        } else if (i >= 81 && i <= 90) {
            System.out.println("A+ Grade");
        } else if (i >= 91 && i <= 100) {
            System.out.println("O Grade");
        } else {
            System.out.println("Fail");
        }
    }
}


