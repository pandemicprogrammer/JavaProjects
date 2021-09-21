
import java.util.Scanner;

public class Plant extends Herb {
	
	String color;
	
	public static void main(String[] args) {
		
		System.out.println("Color: \n");
		
		
	}
// Constructor
	public Plant(String name, String color) {
		super(name);
		this.color = color;
	}
// Display method
	public void display() {
		
		super.display();
		System.out.println("\nType of herb: Plant ");
		System.out.println("\nColor: " + color);

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
