package Java_Tutorial;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int a=sc.nextInt();
        if (a % 2==0){
            System.out.println("This is an Even Number");

        }else {
            System.out.println("This is an odd Number");
        }

    }
}
