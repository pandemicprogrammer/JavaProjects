//Marie Valentonis 7/7/2021
//program to manipulate object EmployeeInput and take data input from users menu selections

import java.util.Scanner;

public class EmployeeDatabase {
   
   static Scanner scan = new Scanner(System.in);
   //create array of size 100
   static EmployeeInput[] employees = new EmployeeInput[100];
   //variable to count number of employees in array
   public static int employeeCount = 0;

   public static void main(String[] args) {

       //loop till user selects 6
       while (true) {
           //print menu
           System.out.println(
                   "1. Load employee's data\n2. Add new employee\n3. Display all employees\n4. Retrieve specific employee's data\n5. Retrieve employees with salaries based on range\n6. Exit");
           //get menu selection
           int option = scan.nextInt();
           //switch to select a method
           switch (option) {
           case 1:
               //call loadEmployeesData method
               loadEmployeesData();
               break;
           case 2:
               //call addNewEmployee method
               addNewEmployee();
               break;
           case 3:
               //call displayAllEmpoyees method
               displayAllEmpoyees();
               break;
           case 4:
               //call retrieveSpecificEmployee method
               retrieveSpecificEmployee();
               break;
           case 5:
               //call retrieveEmployeeInSalaryRange method
               retrieveEmployeeInSalaryRange();
               break;
           case 6:
               //exit execution
               System.exit(0);
               break;
           default:
               //invalid input message
               System.out.println("Enter a valid selection.\n");
               break;
           }
       }
   }
   //get low and high salary range
   //output list of employees in range
   private static void salaryRange() {
       System.out.print("Enter lowest salary : ");
       double lowest = scan.nextDouble();
       System.out.print("Enter highest salary : ");
       double highest = scan.nextDouble();
       for (int i = 0; i < employeeCount; i++) {
           if (employees[i].setSalary() <= highest && employees[i].setSalary() >= lowest) {
               System.out.println(employees[i].toString());
           }
       }
   }

  //traverse array for specific ID and return employee info
   private static void retrieveSpecificEmployee() {
       int id = 0;
       while (String.valueOf(id).length() != 5) {
           System.out.print("Enter employee id : ");
           id = scan.nextInt();
       }
       for (int i = 0; i < employeeCount; i++) {
           if (employees[i].getID() == id) {
               System.out.println("Employee ID : " + id + ", Employee Name : " + employees[i].getName()
                       + ", Employee Salary : " + employees[i].getSalary());
           }
       }
   }

   //loop to display all employees
   private static void displayAllEmpoyees() {
       for (int i = 0; i < employeeCount; i++) {
           System.out.println(employees[i].toString());
       }
   }

   //get name, id, salary of individual employee
   private static void addNewEmployee() {
       System.out.print("Enter employee name : ");
       String name = scan.next();
       int id = 0;
       while (String.valueOf(id).length() != 5) {
           System.out.print("Enter employee id : ");
           id = scan.nextInt();
       }
       System.out.print("Enter annual salary : ");
       double salary = scan.nextDouble();

       employees[employeeCount] = new Employee(name, id, salary);

       employeeCount++;
   }

   //get multiple employee information
   private static void loadEmployeesData() {
       System.out.print("Enter number of employees : ");
       int numOfEmployees = scan.nextInt();
       while (numOfEmployees > 0) {
           System.out.print("Enter employee name : ");
           String name = scan.next();
           int id = 0;
           while (String.valueOf(id).length() != 5) {
               System.out.print("Enter employee id : ");
               id = scan.nextInt();
           }
           System.out.print("Enter annual salary : ");
           double salary = scan.nextDouble();

System.out.println();

           employees[employeeCount] = new Employee(name, id, salary);

           employeeCount++;
           numOfEmployees--;
       }
   }

}