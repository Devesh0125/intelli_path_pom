package Java_Tutorial;

public class linestar {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            for (int j=10;j>=i;j--){
                if(i==j){
                System.out.print("*");
            } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


