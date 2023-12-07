package ControlStatements;

public class For_Loop {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i==99 || i==98){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
