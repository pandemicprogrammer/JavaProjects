import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;


// Marie Valentonis 8/20/21
// Inventory class to store and manage list of Book objects

public class Inventory {
	static Scanner scan = new Scanner(System.in);

	int i;
	public int bookCount = 0; // Counter

// Create HashMap to map key value pairs of object Book
	static HashMap<Integer, Book> list=new HashMap<Integer,Book>(); 
	
//Driver code
	public static void main(String[] args) {
		
		runInventory();
			
		}
	
	public static void runInventory() {
		while (true) {
			// Print menu
					System.out.println(
		                   "\n1. Add Book "
		                   + "\n2. Remove Book "
		                   + "\n3. Find Book "
		                   + "\n4. Display Inventory "
		                   + "\n6. Exit");
		           int option = scan.nextInt();
		    	   System.out.println();

		           //switch for user to select a method
		           switch (option) {
		           case 1:
		               addBook();
		               break;
		           case 2:
		               removeBook();
		               break;
		           case 3:
		               findBook();
		               break;
		           case 4:
		               displayAll();
		               break;
		           case 6:
		               // Exit program
		               System.exit(0);
		               break;
		           default:
		              // Invalid input message
		               System.out.println("Enter a valid selection.\n");
		               break;
		           }
				}
			}
		
		
	public static void addBook() {
	
	// Get attribute values from user
		System.out.print("\nEnter book ID (integer) : ");
		System.out.println();
	   	int id = scan.nextInt();
	   	
	   // Initialize iterator
	   	Iterator<Map.Entry<Integer, Book>> it = list.entrySet().iterator();	
   		int finder = 0;
   		
   	while(it.hasNext()) {
   		
   	// Traverse hashmap for 
   		Map.Entry<Integer, Book> bA = it.next();
   	// Get object key
   		int key = bA.getKey();
   		
   	// Check if id exists as an object attribute 
   		if(key==id) {
   		
   			Book bFind = bA.getValue();
	   		System.out.print("\nSorry, that book ID already exists. \n");
   		}   		
   	}   		
	   // Set title
	   	System.out.print("\nEnter book title : \n");
	    System.out.println();
	    String title = scan.next();
	    System.out.println();		    
		
	   // Set price
	    System.out.print("\nEnter price (double) : \n");
	    System.out.println();
	    double price = scan.nextDouble();
	    
	   // Create object with Book constructor
	    Book b = new Book(id, title, price);
		    
	    list.put(id, b);
	    
		}
   	
	private static void removeBook() {
	// Get id from user
		System.out.print("Enter book ID (integer) : \n");
	    System.out.println();
	   	int id = scan.nextInt();
	   	
	   // Traverse hashmap with iterator
	   	Iterator<Map.Entry<Integer, Book>> it = list.entrySet().iterator();	
	   		
	   	while(it.hasNext()) {
	   		Map.Entry<Integer, Book> b1 = it.next();
	   	// Get object key
	   		int key = b1.getKey();
	   		
	   	// Check if id exists as an object attribute and remove by object key
	   		if(key==id) {
	   			list.remove(key);
	   			System.out.println("\nSuccessfully removed inventory item. ");
	   			break;
	   			}
	   		}
	   	}

	    
	private static void findBook() {
		
		// Get id from user
				System.out.print("Enter book ID (integer) : \n");
			    System.out.println();
			   	int bID = scan.nextInt();
			   	
			   // Traverse hashmap with iterator
			   	Iterator<Map.Entry<Integer, Book>> it = list.entrySet().iterator();	
			   		
			   	while(it.hasNext()) {
			   		
			   		Map.Entry<Integer, Book> bF = it.next();
			   	// Get object key
			   		int key = bF.getKey();
			   		
			   	// Check if id exists as an object attribute 
			   		if(key==bID) {
			   		
			   			Book b1 = bF.getValue();
                        System.out.println("\nBook ID: "+b1.id+"\nBook title: "+b1.title+"\nBook price: "+b1.price);

				   		
			   			}
			   	// Return error if no id found
			   		if(key!=bID) {
				   		
			   			
                        System.out.println("\nSorry, ID not found. \n");

				   		
			   			}
			   	}
			  
		 	   
			   	System.out.println(); // Format

		   		runInventory();

			   	
			   	}
	private static void displayAll() {
		
 	   	System.out.println();
 	   	
 	   	if(list.size()==0) {
 	 	   	System.out.println("There are no books to display. ");

 	   	}
 	   	else {
 	   		Iterator<Map.Entry<Integer, Book>>it=list.entrySet().iterator();
 	   		
 	   		while(it.hasNext()) {
 	   			Map.Entry<Integer, Book> BD = it.next();
 	   			
 	   			Book bD = BD.getValue();
 	   			
 	   			System.out.println("\nBook ID: "+bD.id+" \nBook Title: "+bD.title+" \nBook Price: "+bD.price+"\n");
 	   		}
 	   	}
	}
}
		
// Object class
class Book {
	
	//attributes of object Book
	public int id;
	public String title;
	public double price;
	public int i;
	
// Constructor for object type Book
	public Book(int id, String title, double price) {
		this.i = i;
		this.id = id; 
		this.title = title;
		this.price = price;
		}
	
		public double getPrice() {
		   return price;
		   }
		public String getTitle() {
		   return title;
		   }
		public int getID() {
		   return id;
		   }
		
		public void id() {
			this.id=id;
			}
		public void title(String title) {
		    this.title = title;
			}
		public void price(Double price) {
			this.price=price;
		}
		public Book(int i) {
			this.i = i;
		}
	// Method to output object formatted to string
		@Override
		public String toString() {
			return ("ID: " + this.getID() +
			" Title: " + this.getTitle() + 
			" Price: $" + this.getPrice() +
			"\n");
			}
		}

	

	
