

public class SweetsBasket extends Gift {
	
	boolean nuts;

// Constructor
public SweetsBasket(String id) { 
		
		super(id); // Pass super class values to child class
		this.nuts = nuts;
		}

public void setNuts(boolean nuts) {
	
	this.nuts=nuts;
	}
public boolean getNuts() {
	
	return nuts;
	}

public void setSize(char size) {
	
	this.size = size;
}

public void displaySweetsBasket() {
	
	System.out.println("\nSweet basket order details: \nOrder ID - "+id+ "\nSize: "+size+"\nTotal price: "+price+ "\nNuts included: "+nuts);
}

		
		}
