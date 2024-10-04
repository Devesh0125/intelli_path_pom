package Test;

import java.util.Scanner;



public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user to input the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        // Create arrays to store employee names, monthly salaries, and annual salaries
        String[] employeeNames = new String[numEmployees];
        double[] monthlySalaries = new double[numEmployees];
        double[] annualSalaries = new double[numEmployees];
        double[] netSalaryArray=new double[numEmployees];

        // Step 2: Input employee names and monthly salaries
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.next();

            System.out.print("Enter monthly salary for " + employeeNames[i] + ": ");
            monthlySalaries[i] = scanner.nextDouble();

            // Step 3: Calculate annual salary
            annualSalaries[i] = monthlySalaries[i] * 12;
        }

        // Step 4: Determine tax bracket using a switch statement
        for (int i = 0; i < numEmployees; i++) {
            double annualSalary = annualSalaries[i];
            double taxRate=0.00;

            if (annualSalary <= 300000) {
                taxRate = 0.10;
            } else if (annualSalary <= 600000) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            double taxAmount = annualSalary * taxRate;
            double netSalary = annualSalary - taxAmount;
            netSalaryArray[i]=netSalary;
            // Step 5: Check eligibility for bonus
            double bonus = 0.0;
            if (netSalary > 50000) {
                bonus = 0.05 * annualSalaries[i];
            }

            // Print employee details
            System.out.println("\nEmployee: " + employeeNames[i]);
            System.out.println("Monthly Salary: $" + monthlySalaries[i]);
            System.out.println("Annual Salary: $" + annualSalaries[i]);
            System.out.println("Tax Rate: " + (taxRate * 100) + "%");
            System.out.println("Tax Amount: $" + taxAmount);
            System.out.println("Net Salary: $" + netSalary);
            System.out.println("Bonus: $" + bonus);
        }

        // Step 8: Calculate and print average monthly salary
        double totalMonthlySalary = 0.0;
        for (double salary : monthlySalaries) {
            totalMonthlySalary += salary;
        }
        double averageMonthlySalary = totalMonthlySalary / numEmployees;
        System.out.println("\nAverage Monthly Salary: $" + averageMonthlySalary);

        // Step 9: Identify employee with highest net annual salary
        double maxNetSalary = Double.MIN_VALUE;
        int highestEarnerIndex =0;
        for (int i = 0; i < numEmployees; i++) {
            if (netSalaryArray[i] > maxNetSalary) {
                maxNetSalary =netSalaryArray[i];
                highestEarnerIndex = i;
            }
        }
        System.out.println("Highest Earner: " + employeeNames[highestEarnerIndex]);

        scanner.close();
    }
}
