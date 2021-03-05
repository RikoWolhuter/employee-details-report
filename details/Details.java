package details;
import java.util.Scanner;//importing Scanner class so users can insert input
/**
 *
 * @author Riko Wolhuter
 */
public class Details {
    public static void main(String[]args)
    { 
        double DeductionsReportKey;
        
        Scanner sc = new Scanner(System.in);//creating a Scanner object that accepts user's input
        
        /*
        User enters employee number, first name, surname and salary to be increased.
        The user inputs are set into their according methods
        */
        System.out.print("Enter the employee number >> ");
        idNumber = sc.nextInt();
        setIdNumber(idNumber);
        
        System.out.print("Enter the employee first name >> ");
        firstName = sc.next();
        setFirstName(firstName);
        
        System.out.print("Enter the employee surname >> ");
        surname = sc.next();
        setSurname(surname);
        
        System.out.print("Enter the employee salary to be increased >> ");
        salary = sc.nextDouble();
        setSalary(salary);
        
        Question_1 Details = new Question_1();//creating Question_1 object
        
        Details.printDetails();//calling printDetails method
        
        /*
        accepting user input, if 1 is entered the salaryDeductions method is called but if 0 is user input the program terminates
        */
        System.out.println("Would you like to see the increased salary with deductions? Enter (1) to view the deductions report or any other key to exit.");
        System.out.print(">> ");
        DeductionsReportKey = sc.nextDouble();
        
        if(DeductionsReportKey == 1){
        Details.salaryDeductions();//calling salaryDeductions method
        }
        else
        {
        System.exit(0);
        }    
        }
    /*
    getter and setter methods to manipulate and store Employee Details Report and Employee Deductions Report information
    */
    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Details.idNumber = idNumber;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Details.firstName = firstName;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Details.surname = surname;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Details.salary = salary;
    }
    
    private static int idNumber;
    private static String firstName;
    private static String surname;
    private static double salary;
    private static double amount;
    private static double increaseAmount;
    private static double tax;
    private static double medicalAid;
    private static double carAllowance;
    private static double Uif;
    private static double takeHomePay;
    
    public static double getUpdatedSalary()//method to increase salary by 10%
    {
        amount = salary *110/100;
        return amount;
    }
    
    public static double getIncreasedAmount()//IncreaseAmount
    {
        increaseAmount = amount - salary;
        return increaseAmount;
    }
    public static double getTax()//Deducting tax from the increased salary amount
    {
        tax = amount * 18/100 ;
        return tax;
    }
     public static double getMedicalAid()//Deducting medicalAid from the increased salary amount
    {
        medicalAid = amount * 12.5/100;
        return medicalAid;
    }
      public static double getCarAllowance()//Deducting carAllowance from the increased salary
    {
        carAllowance = amount * 8/100;
        return carAllowance;
    }
       public static double getUIF()//Deducting UIF from the increased salary
    {
        Uif = amount * 2/100;
        return Uif;
    }
        public static double getTakeHomePay()//salary to withdraw after all the deductions
    {
        takeHomePay = salary - tax - medicalAid - carAllowance - Uif;
        return takeHomePay;
    }
}
