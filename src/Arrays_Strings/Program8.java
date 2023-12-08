package Arrays_Strings;

public class Program8 {
    static void printArray(int a[]){
        for(int i:a){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printArray(new int[] {2,5,7,8,9,10});
    }
}
