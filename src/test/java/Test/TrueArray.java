package Test;

public class TrueArray {
    public static void main(String[] args) {
        int [] marks={10,20,30};
        int num=70;
        boolean isInArray=false;
        for (int ele:marks){
            if(num==ele) {
                isInArray = true;
                break;}
            }if (isInArray){
                System.out.println("The nume is P");
            }else {
                System.out.println("The num is not P");
            }
        }
    }

