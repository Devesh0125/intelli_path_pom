package Java_Tutorial;

import java.util.Scanner;

public class testing4b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the No.");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){ //spaces
                System.out.print(" ");
            }for(int k=1;k <= i;k++){//stars
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=n-1;i++){
            for(int j=0;j<=i;j++){// spaces
                System.out.print(" ");
            }for (int k =n-1;k>=i;k--){
                System.out.print("*");//star
            }
            System.out.println();
        }
    }
}
