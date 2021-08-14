//Marie Valentonis 6/22/2021
//program for returning triangle and diamond shapes of size based on user input


import java.util.Scanner;

public class NestedForLoops {

	public static void main(String[] args) 
	{

	Scanner sc = new Scanner(System.in);
	int triNum; //triangle size
	int diNum; //diamond size
	
	{ do {
		System.out.println("Enter desired length of triangle: "); //prompt user input triangle size
		triNum = sc.nextInt();//store input in variable
		System.out.println();
		
	//set positive integer parameters
	if (triNum <= 0)
			System.out.println("Number must be greater than 0. \n");
	} while (triNum <= 0);
	
//set nested for loop parameters for triangle
	//run loop until triNum rows
	for (int i = 1; i <= triNum; i++) 
		{
		//loop to print number of characters in each row
		for (int j = 1; j <= i; j++) 
		{
			System.out.print("# ");
		}
		System.out.println(); 
		}
		}
//second part of program to print desired size diamond
	do {
		System.out.println("Enter desired length of diamond sides: "); //prompt user input diamond size
		diNum = sc.nextInt();//store input in variable
		System.out.println();
		
	//set positive integer parameters
	if (diNum <= 0)
			System.out.println("Number must be greater than 0. \n");
	} while (diNum <= 0);
	
//set for loops to print diamond pattern
	//print 2*diNum rows
	int space = diNum - 1;
	
	//run loop until diNum rows
	for (int i = 0; i < diNum; i++) 
	{
		//loop for initial spacing before character
		for (int j = 0; j < space; j++)
			System.out.print(" ");
		//print i+1 characters
		for (int j=0; j<=i; j++)
			System.out.print("# ");
		
		System.out.print("\n");
		space--;
	}

//repeat loops in reverse order 
	
	space = 0;
	
	//run loop until diNum number of rows
	for(int i=diNum; i>0; i--)
	{
		//loop for initial spacing before character
		for(int j=0; j<space; j++)
			System.out.print(" ");
		//print i stars
		for (int j=0; j<i; j++)
			System.out.print("# ");
		
		System.out.print("\n");
		space++;
	
	sc.close();

	}
	System.out.println();
	System.out.println(" CMIS 141-6381 \n Marie Valentonis \n 6/22/2021");
	}}
	
	//part of program to return diamond of given side length
	
		
	
		
	
