package Arrays_Strings;

public class Str_To_CharArr_1 {
    public static void main(String[] args) {
        String s="Java";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            System.out.print(c[i]);
        }
    }
}
