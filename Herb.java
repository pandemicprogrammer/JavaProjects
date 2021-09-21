
// Marie Valentonis 9/5/2021
// Program to categorize pets and their breed traits

import java.util.Scanner;

public class Herb {
	
	static Scanner scan = new Scanner(System.in);
	static String name;
	
// Driver code
	public static void main(String[] args) {
	}
		
// Constructor for object type Herb
	public Herb(String name) {
				
		this.name = name; 
		}
			
	public  void display() {
		
		System.out.println("\nName: " + name);
		}

	public void setRoot(String name, String color) {
			    
		Plant plant = new Plant(name, color);
		}
	public String getName() {
		return name;
		}
				   
				
	public void name() {
	
		this.name = name;
		}
				
// Method to output object formatted to string
	@Override
	public String toString() {
		return (this.getName());
					}
}



