package Java_Tutorial;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your First Number");
        long a=sc.nextLong();
        System.out.println("Please enter your Second Number");
        long b=sc.nextLong();
        System.out.println("Please enter your Third Number");
        long c=sc.nextLong();
        System.out.println("please select your operation: +,-,*,/ ");
        String sym= sc.next();
        long res;
        switch (sym){
            case  "+":res=a+b+c;
            System.out.println("Addition of Number "+res);
            break;
            case  "-":res=Math.abs(a-b-c);

                System.out.println("subtraction of Number "+res);
                break;
            case  "*":res=a*b;
                System.out.println("Multiplication of Number "+res);
                break;
            case  "/":res=a/b;
                System.out.println("division of Number "+res);
                break;
            default:{
                System.out.println("invalid symbol");
            }



        }

    }
}
