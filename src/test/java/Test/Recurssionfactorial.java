package Test;

import java.util.Scanner;

public class Recurssionfactorial {
  static int fact=1;
    public static void main(String[] args) {
        System.out.println("Program for Factorial\n ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the Your nunmer: ");
        int a=sc.nextInt();
        Recurssionfactorial f=new Recurssionfactorial();
        long res=f.calfact(a);

    }
 int  calfact(int a) {
     if (a == 1 || a == 0) {
         return 1;

     } else {
         fact = fact * a;
         System.out.println("The Fectorical for  the "+(a)+"="+ fact );
         calfact(a - 1);
     }return fact;


 }



}
