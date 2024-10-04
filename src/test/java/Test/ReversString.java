package Test;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter The string");
        String name=sc.next();
        int len=name.length();
        System.out.println(name.toUpperCase());
        String rev="";

        for(int i=len-1;i>=0;i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);


    }
}
