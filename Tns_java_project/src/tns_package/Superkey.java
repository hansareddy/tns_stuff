package tns_package;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        
    	super(name);
        this.breed = breed;
    }
}
