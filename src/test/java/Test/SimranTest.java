package Test;

import java.util.Scanner;

public class SimranTest {
    public static void main(String[] args) {
        System.out.println("Please enter the Number: ");

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){//0 1 2 3 4 5
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }for (int k=(2*n);k>(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println();

        }

    }




}
