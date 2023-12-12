package Arrays_Strings;

public class String_To_CharArray_3 {
    public static void main(String[] args) {
        String s="String To Array";
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            System.out.print(ch[i]);
        }
    }
}
