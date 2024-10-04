package Java_Tutorial;

public class Testing6a {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){ //5,4,3,2,1
                if(j<=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();

            }
        }
}

// ____* i=1(stars), n-i(spaces)= 5-1=4
// ___** i=2(stars) ,n-i (spaces)= 5-2=3
