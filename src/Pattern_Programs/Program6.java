package Pattern_Programs;

public class Program6 {
    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
