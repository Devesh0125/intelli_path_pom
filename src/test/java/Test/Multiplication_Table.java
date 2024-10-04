package Java_Tutorial;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int d=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(d + "*" + i +"="+ d*i);
        }


    }
}
