package intelli_pom;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        do {
            System.out.println("Please enter the marks of Sub 1:");
            sub1 = sc.nextInt();
        }while(sub1>100);
        do {
            System.out.println("Please enter the marks of Sub 2:  ");
            sub2 = sc.nextInt();
        }while (sub2>100);
      do {
          System.out.println("Please enter the marks of Sub 3:  ");
          sub3 = sc.nextInt();
      }while (sub3>100);
       do {
           System.out.println("Please enter the marks of Sub 4:  ");
           sub4 = sc.nextInt();
       }while (sub4>100);
        do {
            System.out.println("Please enter the marks of Sub 5:  ");
            sub5 = sc.nextInt();
        }while(sub5>100);
            float sum = (((sub1 + sub2 + sub3 + sub4 + sub5) * 100) / 500f);
            System.out.println("The Percent is:" + sum);


        }
    }