package Test;

import java.util.Scanner;

public class tt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }for (int k=2*n;k>=2*i;k--){
                System.out.print("*");
            }
            System.out.println();

        }

}
}
