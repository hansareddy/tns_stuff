package tns_package;

class Person {
    private String name;
    private int age;

    //public getter and setter methods
   
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
 
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) { // Add a check to ensure age is valid
            this.age = age;
        } 
        else {
            System.out.println("Age cannot be a negative number.");
        }
    }
}

public class GetSet {

	public static void main(String[] args) {
		Person p = new Person();

        p.setName("hansa");
        p.setAge(20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
		

	}

}
