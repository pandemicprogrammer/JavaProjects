//program to perform calculation based on user input of integers and operator
//Marie Valentonis 6/4/2021

import java.util.*;

public class SwitchOperator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		char operand;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integer and an operator separately (+, -, *, or /): ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		operand = sc.next().charAt(0);
		
		
		
		int result = 0;
		
			switch (operand) {
				case '+':
				result = num1 + num2;
				break;
				case '-':
				result = num1 - num2;
				break;
				case '/':
				result = num1 / num2;
				break;
				case '*':
				result = num1 * num2;
				break;
				
				default: 
				System.out.println("Invalid operand. Please try again.");
				}
			
			
		System.out.println("Result: " + result);
		
		
	}

}
