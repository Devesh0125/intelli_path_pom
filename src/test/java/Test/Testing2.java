package Java_Tutorial;

import java.util.Scanner;

public class Testing2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the No.");
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

