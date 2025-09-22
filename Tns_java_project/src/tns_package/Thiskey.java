package tns_package;


class Book {
    double price = 50.0;

    public void applyDiscount() {
        double price = 5.0; 

        System.out.println("Discount amount: " + price); 
        System.out.println("Original price: " + this.price); 
    }
}

public class Thiskey {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.applyDiscount();
    }
}