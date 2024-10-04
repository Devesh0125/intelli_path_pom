package Smart_programming;
//Same ARG AND Sequence
public class Over_ridi_method {
    void show(int a,String b){
        System.out.println("1 METHOD");

    }
}
class Over_ridi_2 extends Over_ridi_method{
    void show(int a,String b){
        System.out.println("2 METHOD");
    }

    public static void main(String[] args) {
        Over_ridi_method t=new Over_ridi_method();
        t.show(10,"Davesh");
        Over_ridi_2 t2=new Over_ridi_2();
        t2.show(10,"Prashant");

    }
}
