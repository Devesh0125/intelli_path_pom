package Smart_programming;

public class Method_over {
   void test(int a){
        System.out.println("I M METHOD ONE ");

    }
   void test(String a){
        System.out.println("I M METHOD TWO");

    }

    public static void main(String[] args) {
        Method_over d=new Method_over();
       d.test(10);
       d.test("DAVESH");
    }
}
