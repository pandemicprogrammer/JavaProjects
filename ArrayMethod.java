//Marie Valentonis 7/1/2021
//program to square all values of a list by calling a method3


//declare and populate array
//call method, pass array to method
//method modifies array and output to console

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
		static Scanner sc = new Scanner(System.in);
		//declare and populate array
		static int list [] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
		static int i = 0;
	public static void main(String[] args) {
		//output initial array values
		System.out.println("Before: " + Arrays.toString(list));
		//transfer array to method
		method();
		System.out.println("After: " + Arrays.toString(list));
		
	}
	public static void method() {
		//initialize for loop 
		 for (int i = 0; i < list.length; i++) {
	         list[i] = (int) Math.pow(list[i], 2);//Math.pow to raise each index of list to 2
	         
		 }}}