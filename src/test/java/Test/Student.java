package Test;

import javax.naming.spi.DirStateFactory;

class Student {
    int roll_no;
    String name;
void s1(int a,String b){
    System.out.println("Roll_no of the student is :"+a);
    System.out.println("Name of the Student is  :"+b);
}

 }
class Exam extends Student{
    int subject1,subject2,subject3,subject4,subject5,subject6;
     public  void e1(int a,int b,int c,int d,int e,int f){
         float total_marks=(a+b+c+d+e+f);
         double percentage =  (total_marks/600)*100;
         System.out.println("The total Marks of the Student is : "+total_marks);
         System.out.println("The total Percentage of the Student is: "+percentage+"%");

     }

}
class Result extends Exam {
    public static void main(String[] args) {
        Result r1=new Result();
        r1.s1(43819,"Davesh chander sharma");
        r1.e1(90,80,70,60,50,40);

    }
}
