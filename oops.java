//Encapsulation and Abstraction example

import java.util.Scanner;
class Student {
	private String name;
	private int marks;  
	/*the above variables "name" and "marks" can be initialized only with the methods setName() and setMarks()
	 and these variables are accessible only through methods getMarks() and getName()
	 this is called data abstraction, as they cannot be used directly with the objects of the class "Student"
    */              
	public String getName() 
	{ 
	    return name; 
	}

	public void setName(String name) 
	{
	    this.name = name; 
	}

	public int getMarks() 
	{
	    return marks; 
	}

	public void setMarks(int marks) 
	{
	    this.marks = marks; 
	}
}

/* All the variables and functions required for handling student data are wrapped up into a single class "Student"
   this is called encapsulation */
   
//Main function
public class Main {
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		Student obj1 = new Student();
		String studName;
		int studMarks;
		System.out.println("Enter name");
		studName=sc.nextLine();
		System.out.println("Enter marks scored");
		studMarks=sc.nextInt();
		obj1.setName(studName);
		obj1.setMarks(studMarks);

		System.out.println("Name: " + obj1.getName());
		System.out.println("Marks: " + obj1.getMarks());
	}
}
