/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**
 * This class for printing final salary including bonus
 *
 * @author srinivsi
 */
public class PayrollPrint {

    public static void main(String[] args) {
        /* here assumed that 50 employee accounts can be created
 for the given bank */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee name:");
        String name = sc.nextLine();

        System.out.println("Please enter the salary: salary <=3000");
        double salary =sc.nextDouble();
        
        Payroll ac = new Payroll(salary, name);

        System.out.println("The final Salary including bonus is: " + calcPay(salary));

    }
    

}
