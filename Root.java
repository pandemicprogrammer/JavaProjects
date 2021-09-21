
import java.util.Scanner; 

public class Root extends Herb {
	
	static Scanner scan = new Scanner(System.in);

	String rootType;
	
	public static void main(String[] args) {		    
	}
// Constructor
	public Root(String name, String rootType) {
	
	// Call super constructor
		super(name);
		this.rootType = rootType;
	}

// Display method
	public void display() {
			
		super.display();
		System.out.println("\nType of herb: Root ");
		System.out.println("\nRoot system type: " + rootType);
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
