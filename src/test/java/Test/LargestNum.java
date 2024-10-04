package Java_Tutorial;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a = sc.nextInt();
        System.out.println("Enter your Second Number");
        int b= sc.nextInt();
        System.out.println("Enter your Third Number");
        int c= sc.nextInt();
        if (a>b & a>c){
            System.out.println( a  + " This the greater number");
        } else if (b>a & b>c) {
            System.out.println(b  + " This the greater number");
            
        }else {
            System.out.println(c  + " This the greater number");
        }

    }
}
