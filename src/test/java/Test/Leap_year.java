package Java_Tutorial;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Your year");
        int year=sc.nextInt();
        if (year%4==0 || (year%400==0 && year%100!=0)){
            System.out.println("This is an Leap Year");
        }else {
            System.out.println("Not A Leap Year");
        }

    }
}
