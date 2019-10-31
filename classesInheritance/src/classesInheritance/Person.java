  
package classesInheritance;
// ToDo 1: Make this class a child of Person
public class Student extends Person{
	double GPA; //GPA class variable in student class
// ToDo 2: Fix the resulting errors
	public Student(String name, int age) { 	//Student (Child) constructor with String name and short age parameters linked to parameter variables of Person class (Parent)
		super(name, age);
	}
// ToDo 3: Add a field for GPA and create setter and getter
	public void setGPA(double T)	//Sets GPA
		{
			GPA = T;
		}
	public double getGPA()			//Returns GPA
		{
			return GPA;
		}
	// ToDo 4: Add comments to your code
	
	@Override
	public void setAddress(String address) { //address from parent (this) is assigned address from constructor
		this.address = address;
	}
	@Override
	public String getAddress() { //gets parent address variable, returns as string
		return address;
	}
	
	// ToDo 7: Add a toString method for Student class
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nGPA: " +  GPA;
	}
}
