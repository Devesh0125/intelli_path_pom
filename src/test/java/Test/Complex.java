package Test;

import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;
    Complex(){

    }
    Complex(int a){
        this.real=a;
        this.imaginary=a;
    }
    Complex(int a, int b){
        this.real=a;
        this.imaginary=b;

    }

    public static void main(String[] args) {
        System.out.println("Please enter the value e1 :");
        Scanner sc=new Scanner(System.in);
        int e1=sc.nextInt();
        Complex e11=new Complex(e1);
        System.out.println("Please enter the value e2 :");
        int e2=sc.nextInt();
        System.out.println("Please enter the value e3 :");
        int e3= sc.nextInt();
        Complex e22 =new Complex(e2,e3);
        System.out.println(e11.real+e22.real+"i"+"+"+"j" +(e11.imaginary+ e22.imaginary));


    }
}