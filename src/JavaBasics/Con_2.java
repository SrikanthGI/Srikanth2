package JavaBasics;

public class Con_2 {

    Con_2(String animal_name,String breed,int age){
        System.out.println(animal_name+" breed is: "+breed+" & its age is: "+age);
    }
    Con_2(String colour,String gender) {
        System.out.println("its colour is : " + colour + " & Gender is : " + gender);
    }

    public static void main(String[] args) {
        Con_2 c2=new Con_2("dog","lab",5);
        Con_2 c3=new Con_2("black","male");
    }
}
