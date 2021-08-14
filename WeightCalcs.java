

import java.util.Scanner;

public class WeightCalcs {
	
	public static Double calcConvertWeight(double weight) {
		return(weight*0.45);
		}		
	static public Double calcConvertHeight(double height) {
		return(height*2.54);
		}
	static public double calcBMI(double w, double h) {
		return((w*0.45)/(h*2.54)*10000);
		}
		
		
	public void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			int selection = 0;
			
			
			do {
				
				System.out.println("	MENU");
				System.out.println("1. Convert weight in pounds to kilograms");
				System.out.println("2. Convert height from inches to centimeters");
				System.out.println("3. Calculate BMI");
				System.out.println("9. Exit ");
			
				System.out.println("Enter your selection : ");
				selection = sc.nextInt();
				
				switch (selection)	{
			
				case 1:		System.out.println(calcConvertWeight(w));
							break;
				case 2:		System.out.println(calcConvertHeight(h));
							break;
				case 3:		System.out.println(calcBMI(h, w));
							break;
				case 9:		break;
				default:	System.out.println("Invalid choice");
				
				}
			} while (selection !=9);
			
			sc.close();
		}

	}

