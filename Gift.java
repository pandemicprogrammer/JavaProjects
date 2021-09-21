import java.util.Scanner;

public class Gift {
	
// Attributes 
protected String id;
public char size;
public double price;		
		
// Constructor for object type Gift
public Gift(String id) {
				
	this.id = id; 
	}
	
public void setPrice(char size) {
		
		if (size == 'S') {
			price = 19.99;
			}
		
		if (size == 'M') {
			price = 29.99;
			}
		
		if (size == 'L') {
			price = 39.99;
			}
		}

public String getGiftId(String id) {
	
	return id;
	
}
	}
				



