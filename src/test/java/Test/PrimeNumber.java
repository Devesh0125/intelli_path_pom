package Java_Tutorial;

import java.util.Scanner;

public class PrimeNumber {
    static   int temp=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number");
         int a= sc.nextInt();
        isprime(a);
    }
    static int isprime(int a) {
        for (int i = 2; i <= a - 1; i++)
            if (a % i == 0) {
                temp = temp + 1;
            }if (temp == 0) {
                System.out.println("is prime ");
            } else {
                System.out.println("Not a prime");
            } return temp;



    }
}