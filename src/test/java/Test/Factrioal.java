package Java_Tutorial;

import java.util.Scanner;

public class  Factrioal {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("please Enter Your Number");
            long d=sc.nextLong();
            long res=1; //1, 0
            for(long i=1 ;i<=d;i++)
            {
                res=res*i;
            }
            System.out.print("The Factorial of the Number is : "+res);



    }


}
