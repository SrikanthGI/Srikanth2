package JavaBasics;

public class Para_Con {
    int id;
    String name;
    Para_Con(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Para_Con pc=new Para_Con(1243,"Suhas");
        Para_Con pc1=new Para_Con(8746,"Pradeep");
        pc.display();
        pc1.display();

    }
}
