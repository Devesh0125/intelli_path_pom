package Test;

public class Learning {
    String colour;
    int age;
    void  method1(String c,int a)
    {
        colour=c;
        age=a;
        System.out.println(colour+" "+age);

    }
    void display(){
        System.out.println(colour+" "+age);
    }

    public static void main(String[] args) {
        Learning buzo=new Learning();
    buzo.method1("yellow",10);
        buzo.display();


    }
}
