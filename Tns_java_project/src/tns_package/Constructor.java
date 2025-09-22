package tns_package;


	class Student {
	    String name;
	    int age;

	    //Default Constructor
	    public Student() {
	    	
	        System.out.println("Default constructor called");
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    //Parameterized Constructor
	    
	    public Student(String name, int age) {
	        System.out.println("Parameterized constructor");
	        this.name = name;
	        this.age = age;
	    }
	    
	   
	    public void display() {
	    	
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	    }
	}

	public class Constructor{
		
	    public static void main(String[] args) {
	    	
	        System.out.println("Student 1 ");
	        Student s1 = new Student();
	        s1.display();

	        System.out.println("Student 2");
	        Student s2 = new Student("Alice", 20);
	        s2.display();
	    }
	}
