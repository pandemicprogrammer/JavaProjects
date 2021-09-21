import java.util.Scanner;

public class FruitBasket extends Gift {
	
	int numFruit;
	boolean citrus;
	
	// Constructor for object type Gift
		public FruitBasket(String id) {
			super(id);
			this.citrus = citrus;
			}
		
public void setPrice(boolean c) {

	if (c == true) {
		price = price+5.99;
	}
	
}

public void setCitrus(boolean citrus) {
	
	this.citrus = citrus;

}

public void setSize(char size) {

	this.size=size;
}
		
public void setNumFruit(char size) {
			
			if (size == 'S') {
				numFruit = 6;
				}
			
			if (size == 'M') {
				numFruit = 9;
				}
			
			if (size == 'L') {
				numFruit = 15;
				}
			}

public int getNumFruit() {
	
	return numFruit;
}

public boolean getCitrus() {
	
	return citrus;
}

public void displayFruitBasket() {
	
	System.out.println("\nFruit basket order details: \nOrder ID - "+id+ "\nSize: "+size+"\nTotal price: "+price+ "\nCitrus included - "+citrus+"\nNumber of fruits - "+numFruit);
}

}
