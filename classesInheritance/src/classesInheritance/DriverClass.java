package classesInheritance;

import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		Student std1= new Student("James", 20); //Took off abstract method to fix problem
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		System.out.println("Input your GPA"); //Instructions
		Scanner Input = new Scanner(System.in); //GPA input
		std1.setGPA(Input.nextDouble()); //Whatever is Input is placed inside constructor of student class
		System.out.println(std1); //toString method is used to display Message
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}
