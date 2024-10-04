package Test;

import java.util.Scanner;

public class Recursionfib {
   static int a=0;
    static int b=1;
   static int c;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the No Upto wich you want to print the no ");
        int z=sc.nextInt();
        System.out.println(a+" "+b );
        Recursionfib f=new Recursionfib();
        f.refib(z);
    }
   int  refib(int z){
        if (z>=1){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

            refib(z-1);
        }return c;

    }
}
