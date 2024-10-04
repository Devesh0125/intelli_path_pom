package Test;

public class AllPrime {
    public static void main(String[] args) {
        System.out.println("ALL THE NUMBER WHICH ARE PRESENT IN BETWEEN 1 TO 100");
        int temp = 0;
        for (int i = 1; i <= 100; i++){
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            } else {
                temp = 0;
            }
        }
    }
}
