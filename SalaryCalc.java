import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.*;

public class SalaryCalc {
	static Scanner input = new Scanner(System.in); //general scanner
	static Scanner readname = new Scanner(System.in); //name scanner
	static Scanner readid = new Scanner(System.in);//ID scanner
	static Scanner readsalary = new Scanner(System.in);//salary scanner
	static Double [] EmployeeIDs = new Double[100];
	static String [] EmployeeNames = new String[100];
	static Double [] EmployeeSalary = new Double[100];

	

	
		public static void main(String[] args) {
				int selection = 0;
				
				
				
				do {
					
					System.out.println("	MENU");
					System.out.println("1. Load employee data ");
					System.out.println("2. Add new employee");
					System.out.println("3. Display all employees");
					System.out.println("4. Retrieve emplopyees with salary based on range");
					System.out.println("5. Display all employees");
					System.out.println("6. Exit ");
				
					System.out.println("Enter your selection : ");
					selection = input.nextInt();
					
					switch (selection)	{
				
					case 1:		loadData();
								break;
					case 2:		addNew(EmployeeNames, EmployeeIDs, EmployeeSalary);
								break;
					case 3:		displayAll();
								break;
					case 4:		specificID();
								break;
					case 5:		salaryRange();
								break;
					case 6:		exit();
												
					}
				} while (selection !=6);
				}

public static void loadData() {
	System.out.println("How many employees do you want to enter: ");
	System.out.println();
	int numberEmployees = input.nextInt();
	System.out.println();
	
		//prompt user for each Employee name and id
		for (int i=0; i<numberEmployees; i++) {
		//prompt user for Employee name and store in list
		System.out.println();
		System.out.println("Employee "+ (i + 1) + ": " + "\n Enter Employee's name: ");
		EmployeeNames[i] = readname.next();
		//prompt user for ID and store in list
		System.out.println();
		System.out.print(" Enter Employee 5 digit ID number: " );
		EmployeeIDs[i] = readid.nextDouble();
		//prompt user for ID and store in list
		System.out.println();
		System.out.print(" Enter annual salary: " );
		EmployeeSalary[i] = readsalary.nextDouble();
		}
	}

public static void addNew(String[] EmployeeNames, Double[] EmployeeIDs, Double[] EmployeeSalary) {

	
	
	System.out.println();
	System.out.println("Enter Employee's name: ");
	int i = 0;
	EmployeeNames[i] = readname.next();
	//prompt user for ID and store in list
	System.out.println();
	System.out.print(" Enter Employee 5 digit ID number: " );
	EmployeeIDs[i] = readid.nextDouble();
	//prompt user for ID and store in list
	System.out.println();
	System.out.print(" Enter annual salary: " );
	EmployeeSalary[i] = readsalary.nextDouble();
	
	


}
public static void displayAll() {
	//for(int x = 0;x < l && x < EmployeeNames.length;x++)
	//	System.out.print(EmployeeNames[x] + " ");
	for (int j = 0; j < EmployeeNames.length; j ++) {
		System.out.println(EmployeeNames[j] + '\t' + EmployeeIDs[j] + '\t' + EmployeeSalary[j]);
		System.out.println(EmployeeNames.length);
}}
public static void specificID() {

}
public static void salaryRange() {

}
public static void exit() {

}}
