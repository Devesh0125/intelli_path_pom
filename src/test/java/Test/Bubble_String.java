package Test;

public class Bubble_String {
    public static void main(String[] args) {
        String[] a={"deepak","davesh","sumit","yash","prashant","ashok"};
        String temp;
        for (int i=0;i<a.length;i++){
            int flage=0;
            for (int j=0;j<a.length-1-i;j++){
                if (a[j].compareTo(a[j+1])>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flage=1;
                }
            }if (flage==0){
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");


        }
    }
}
