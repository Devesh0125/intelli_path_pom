package Smart_programming;

public class Arg_constructor {
    String name;
    public void dog(){
        System.out.println("I Am RUNNING");
    }
    public void Bird(){
        System.out.println("I M FLYING");
    }
    Arg_constructor(String sjrfdnt){
        this.name=sjrfdnt;


    }

    public static void main(String[] args) {
        Arg_constructor e1=new Arg_constructor("Davesh Chander Sharma");
        System.out.println(e1.name);
        e1.dog();
        e1.Bird();





    }
}
