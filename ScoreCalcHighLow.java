//Marie Valentonis 7/1/2021
//program to calculate lowest and highest exam scores

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.*;




public class ScoreCalcHighLow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner readname = new Scanner(System.in);
		Scanner readscore = new Scanner(System.in);


		String highestScoreName = ""; //holds student name with highest score
		int lowestScore = 0; //holds highest score
		String lowestScoreName = ""; //holds student name with highest score


		
		//prompt user for number of students
		System.out.println("How many students do you want to enter: ");
		System.out.println();
		int numberOfStudents = input.nextInt();
		System.out.println();
		
		double [] studentScores = new double[numberOfStudents];
		String [] studentNames = new String[numberOfStudents];
		
		//prompt user for each student name and score
			
		
		for (int i=0; i<numberOfStudents; i++) {
			System.out.println();
			System.out.println("Student "+ (i + 1) + ": " + "\n Enter student's name: ");
			studentNames[i] = readname.nextLine();
			
			System.out.println();
			System.out.print(" Enter student's score (0-100): " );
			studentScores[i] = readscore.nextDouble();

			}
		
		for (int j = 0; j < studentNames.length; j ++) {
		    System.out.println(studentNames[j] + '\t' + studentScores[j]);
		}
		
		Method(studentScores,studentNames);
		}
	
		public static void Method(double[] studentScores, String[] studentNames) {
			
			Double highestScore = studentScores[0];
			String highStudent = studentNames[0];
			for(int i=1;i<studentScores.length;i++) {
				if(studentScores[i]>highestScore) {
					highestScore=studentScores[i];
					highStudent=studentNames[i];
				}}
			Double lowestScore = studentScores[0];
			String lowStudent = studentNames[0];
			for(int i=1;i<studentScores.length;i++) {
				if(studentScores[i]<lowestScore) {
					lowestScore=studentScores[i];
					lowStudent=studentNames[i];
				}
			}

			System.out.println();
			System.out.format(highStudent + " has the highest score +> " + highestScore + " and " + lowStudent + " has the lowest score => " +  lowestScore);
		}}
		      
			
		
		       
			
			
			
			
		
