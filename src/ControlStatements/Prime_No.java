package ControlStatements;

public class Prime_No {
    public static void main(String[] args) {

        int num=7,count=0;
        for(int i=1;i<=10;i++){
            if(num%i==0){
                System.out.println();
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}
