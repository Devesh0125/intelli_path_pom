package Test;

import java.util.Locale;
import java.util.Scanner;

public class Stringsss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Name ");
        String name=sc.nextLine();
        name=name.toLowerCase(Locale.ROOT);
        System.out.println(name);
        name =name.toUpperCase();
        System.out.println(name);
}
}
