package ControlStatements;

public class Break_ {
    public static void main(String[] args) {
        int num=4;
        int i=123;
        int j=56761;
        switch(num){
            case 1:System.out.println(i+j);
            break;
            case 2:System.out.println(i-j);
            break;
            case 3:System.out.println(i*j);
            break;
            default:System.out.println("invalid expression");
        }
    }
}
