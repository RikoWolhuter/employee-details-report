/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;
/**
 *
 * @author Riko Wolhuter
 */
public class Question_1 {
    /*
    Displaying the Employee Details report.
    calling the getter methods displaying IdNumber, FirstName, Surname, Salary, UpdatedSalary and IncreasedAmount
    */
    public static void printDetails()
    {
    System.out.println("\nEMPLOYEE DETAILS REPORT");
    System.out.println("***************************");
    System.out.println("EMPLOYEE NUMBER: "+Details.getIdNumber());
    System.out.println("EMPLOYEE FIRST NAME: "+Details.getFirstName());
    System.out.println("EMPLOYEE SURNAME: "+Details.getSurname());
    System.out.println("ORIGINAL SALARY: R"+Details.getSalary());
    System.out.println("INCREASE SALARY: R"+Details.getUpdatedSalary());
    System.out.println("INCREASED AMOUNT: R"+Details.getIncreasedAmount());
    System.out.println("***************************");
    
    }
    
    /*
    Displaying the Employee Deductions Report
    calling the getter methods displaying UpdatedSalary, Tax, MedicalAid, CarAllowance, UIF and TakeHomePay
    */
    public static void salaryDeductions()
    {
        System.out.println("EMPLOYEE DEDUCTIONS REPORT");
        System.out.println("*****************************");
        System.out.println("SALARY: R"+Details.getUpdatedSalary());
        System.out.println("TAX: R"+Details.getTax());
        System.out.println("MEDICAL AID: R"+Details.getMedicalAid());
        System.out.println("CAR ALLOWANCE: R"+Details.getCarAllowance());
        System.out.println("UIF: R"+Details.getUIF());
        System.out.println("Take Home Pay: R"+Details.getTakeHomePay());
        System.out.println("*****************************");
        System.out.println("APPLICATION COMPLETE");
    }
}
