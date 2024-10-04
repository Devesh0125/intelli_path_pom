package Java_Tutorial;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        int a=0;int b=1; int c;
        System.out.println(a+""+b);
        for (int i=1;i<=10;i++){
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;

        }

    }
}
