//Marie Valentonis 7/7/2021
//program to create an Employee object to take name, ID, and salary info
//and be used by other programs

public class EmployeeObject {
		   //employee name
		   private String name;
		   //employee id
		   private int id;
		   //employee salary
		   private double salary;

		   //constructor
		   public EmployeeObject(String name2, int id, double salary) {
		       this.name = name2;
		       this.id = id;
		       this.salary = salary;
		   }

		   //call method
		   public String getName() {
		       return name;
		   }

		   //call method
		   public int getID() {
		       return id;
		   }

		   //call method
		   public double getSalary() {
		       return salary;
		   }

		   //call method
		   public void setName(String name) {
		       this.name = name;
		   }

		   //call method
		   public void setId(int id) {
		       this.id = id;
		   }

		   //call method
		   public void setSalary(double salary) {
		       this.salary = salary;
		   }

		   //format output Employee name, ID, salary
		   public String toString() {
		       return "Employee Name : " + name + ", Empoyee ID : " + id + ", Annual Salary : " + salary;
		   }

		}