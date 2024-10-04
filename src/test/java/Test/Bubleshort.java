package Test;

public class Bubleshort {
    public static void main(String[] args) {
        int []a={10,9,2,50,65,79,86};
         int temp;
        for (int i=0;i<a.length;i++){
            int flage=0;
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flage=1;

                }if (flage==0){
                    break;
                }
            }
        }for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
