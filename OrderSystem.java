import java.util.Scanner;


// Marie Valentonis 9/12/2021

public class OrderSystem {

// Scanner
private static Scanner scan = new Scanner(System.in);

//Driver code
public static void main(String[] args) {
	
	int menuOpt; //Initialize variable outside of scope so it will remain accessible 
	int opt = 0; 
	boolean nuts;
	
	// Initialize objects
   	FruitBasket giftFruit = new FruitBasket("AB1234");
   	SweetsBasket giftSweets = new SweetsBasket("CD1234");
	
	do {
	
						// Print menu
						System.out.println(
		                   "\n1. Order Gift Basket "
		                   + "\n2. Change Gift Basket "
		                   + "\n3. Display Gift "
		                   + "\n9. Exit Program");
		         
					System.out.println();
					
					System.out.println("\nPlease enter menu selection: ");
					menuOpt = scan.nextInt(); //Assign value to menuOpt with user input, will remain accessible outside of scope because of outside definition

				   // Switch for user to select a method
		           switch (menuOpt) {
		           
		           case 1: 
		        	   
		        	System.out.print("\nDo you want to order a Fruit Basket (Option 1) or a Sweets Basket (Option 2) ");
		       		System.out.println();
		       		opt = scan.nextInt();//Assign value to opt with user input, will remain accessible outside of scope because of outside definition

		       		
		       		
		       		if (opt == 1)
		       		{
		       			

		       			
		       		// Set atts of FruitBasket
		       		System.out.println("\nWhat size basket? S/M/L ");
		       		char size = scan.next().charAt(0);
		       		giftFruit.setNumFruit(size);
		       		System.out.println("\nWould you like citrus fruits included? true/false ");
		       		Boolean citrus = scan.nextBoolean();
		       		
		       		giftFruit.setPrice(size);
		       		giftFruit.setSize(size);
		       		giftFruit.setCitrus(citrus);
		       		
		       		if (citrus==true) {
		       			giftFruit.price = giftFruit.price+5.99;
		       		}
		       		
		       		giftFruit.displayFruitBasket();

		       		
		       		}
		       		
		       		if (opt == 2) {
		       			
		       			SweetsBasket giftSweet = new SweetsBasket("CD1234");

		       				
		       			// Set atts of SweetsBasket
		       			System.out.println("\nWhat size basket? S/M/L ");
		       			char size = scan.next().charAt(0);
		       			System.out.println("\nWould you like nuts included? true/false ");
		       			nuts = scan.nextBoolean();
		       			
		       			giftSweet.setNuts(nuts);
		       			giftSweet.setPrice(size);
		       			giftSweet.setSize(size);
		       			giftSweet.displaySweetsBasket();
		       		}
		           
	
		       	
		               break;
		               
		           case 2: 
		           
		        	   if (opt==1) {
		       			// Change size
		       			System.out.println("\nWhat size basket? S/M/L ");
		       			char size = scan.next().charAt(0);
		       			// Send size value to gift class
		       			giftFruit.setNumFruit(size);
		       			
		       			// Change citrus
		       			System.out.println("\nWould you like citrus fruits included? true/false ");
		       			Boolean citrus = scan.nextBoolean();
		       			// Calc price based on changes
		       			giftFruit.setPrice(size);
		       			giftFruit.setSize(size);
			       		giftFruit.setCitrus(citrus);
			       		
			       		if (citrus==true) {
			       			giftFruit.price = giftFruit.price+5.99;
			       		}
			       		
			       		giftFruit.displayFruitBasket();
		        	   }
		        	   
		        	   if (opt==2) {
			       			// Change size
			       			System.out.println("\nWhat size basket? S/M/L ");
			       			char sizeNew = scan.next().charAt(0);
			       			giftSweets.setSize(sizeNew);
			       			
			       			// Change nuts
			       			System.out.println("\nWould you like nuts included? true/false ");
			       			boolean nutsNew = scan.nextBoolean();
			       			giftSweets.setNuts(nutsNew);
			       			giftSweets.setPrice(sizeNew);
			       			giftSweets.displaySweetsBasket();
			       		}
		           
		               break;
		        	   
		           case 3:
		        	   
		        	   if (opt==1) {
		        		   giftFruit.displayFruitBasket();
		        	   }
		        	   
		        	   if (opt==2) {
		        		   giftSweets.displaySweetsBasket();
		        	   }
		               break;
		           case 9:
		              // Exit program
		               System.exit(0);
		               break;
		           default:
		              // Invalid input message
		               System.out.println("Enter a valid selection.\n");
		               break;
		               }
		           
	}

while (menuOpt!=9);
}
}



		


		
