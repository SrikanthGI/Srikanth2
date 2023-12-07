package ControlStatements;

public class Switch_ {
    public static void main(String[] args) {
        int num=4;
        int a=42;
        int b=214;
        switch (num){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            default:System.out.println("Invalid input");
        }
    }
}
