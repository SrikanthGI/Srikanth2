package Arrays_Strings;

public class Str_TO_ChatArr_2 {
    public static void main(String[] args) {
        String s=new String("Hello");
        char[] c=s.toCharArray();
        for (int i=0;i<s.length();i++){
            System.out.print(c[i]);
        }
    }
}
