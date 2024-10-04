package Java_Tutorial;

import java.util.Scanner;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Your  1 Number");
      int a= s.nextInt();
      System.out.println("Enter Your  2 Number");
      int b=s.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
        System.out.println(a);
        System.out.println(b);
}
}
