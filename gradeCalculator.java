//Marie Valentonis 6/13/2021
//CMIS 141 Assignment 3 Do...While statement
//program to take input of 4 grades and calculate final grade


import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;


public class gradeCalculator {
   
	private static DecimalFormat df2 = new DecimalFormat("#");


	public static void main(String[] args) {
		
		
		int A1; //assignment 1 grade
		int A2; //asssignment 2 grade
		int examGrade; //exam grade
		int P; //participation grade
		double finalGrade; // final grade
		boolean addStudent; //additional student 
		Scanner sc = new Scanner(System.in);

		
		do { //do statement of conditions
			
			System.out.println("Enter student name: ");
			String student = sc.next();
			System.out.println("Enter grade for Assignment 1 (0-100): ");
			A1 = sc.nextInt();
			System.out.println("Enter grade for Assignment 2 (0-100): ");
			A2 = sc.nextInt();
			System.out.println("Enter grade for Exam (0-100): ");
			examGrade = sc.nextInt();
			System.out.println("Enter grade for Participation (0-100): ");
			P = sc.nextInt();
			
			finalGrade = (A1 * 0.25 + A2 * 0.25 + examGrade * 0.4 + P * 0.1); //calculation of final grade
	        System.out.println(student + "'s final grade is " + df2.format(finalGrade));

			
			System.out.println(); //blank line
			
			System.out.println("Would you like to calculate the grades of another student? true/false "); //check if user wants to calculate for an additional statement using boolean
			addStudent = sc.nextBoolean();
			
		} while (addStudent); //while boolean is true condition
		//if boolean returns true, program loops back to do block
		//if boolean returns false, program does not repeat loop 
		
		sc.close();
					
	}
} 
