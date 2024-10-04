package Java_Tutorial;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        System.out.println("plesase Enter The  No");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }if (temp == 0){
                System.out.println("This is Prime");
            }else {
                System.out.println("This Not A Prime");
        }

    }
}
