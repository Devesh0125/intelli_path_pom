package Test;

import java.util.Scanner;

public class EmployeeSalaryManagementSystem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Step 1  asking teh user to enter the No of Employee
        System.out.print("Enter The Number Of Employee: ");
        int numEmployee=sc.nextInt();

        // Create arrays to store employee names, monthly salaries, and annual salaries

        String[] employeename=new String[numEmployee];
        double[] mounthlysalaries=new double[numEmployee];
        double[] annualsalaries=new double[numEmployee];
        // Step 2: Input employee names and monthly salaries
        for (int i=0;i<numEmployee;i++){
            System.out.print("Enter the name of Employee"+ (i+1)+" : ");
            employeename[i]= sc.next();
            System.out.print("Enter the Salary for "+ (employeename[i])+": ");
            mounthlysalaries[i]=sc.nextDouble();
            System.out.print("Annual Salary is =" + mounthlysalaries[i]*12);
            annualsalaries[i]=mounthlysalaries[i]*12;
        }
        for (int i=0;i<numEmployee;i++){
            double annualsalary= annualsalaries[i];
            double taxrate;
            if (annualsalary<=300000){
                taxrate=0.10;
            } else if (annualsalary<=60) {
                taxrate=0.20;

            }else {
                taxrate=.30;
            }
            double taxAmount = annualsalary * taxrate;
            double netsalary=annualsalary-taxAmount;
            // Step 5: Check eligibility for bonus
            double bouns=0.00;
            if (netsalary>50000){
                bouns=0.05*annualsalary;
            }
            System.out.println("Employee :"+employeename[i]);
            System.out.println("Monthly salary : $"+mounthlysalaries[i]);
            System.out.println("Net salary :$"+ netsalary);
            System.out.println("Tax Amount:$ "+taxAmount);
            System.out.println("Tax rate :"+(taxrate*100)+"%");
            System.out.println("Bonous : $"+bouns );

        }
        // Step 8: Calculate and print average monthly salary
           double totalmounthlysalarry=0.00;
        for (double salary:mounthlysalaries){
            totalmounthlysalarry +=salary;
        }
        double avgMonthlySalary=(totalmounthlysalarry/numEmployee);
        System.out.println("Average Monthly Salary: $"+ avgMonthlySalary);
    }
}
