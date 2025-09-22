package tns_package;

abstract class Shape {
	int area;
	public abstract void calculateArea();
	public void show() {
		System.out.println("The area of the shape is " + area);	}
}

class Square extends Shape {
	int side;
	Square(int side){
		this.side = side;
	}
	public void calculateArea() {
		super.area = side * side;
	}
}

class Rectangle extends Shape {
	int length,bredth;
	
	Rectangle(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}
	public void calculateArea() {
		super.area = length * bredth;
	}
}

public class AbstractShape{
	
	public static void main(String[] args) {
		
		Square sq = new Square(7);
		sq.calculateArea();
		sq.show();
		
		Rectangle re = new Rectangle(6,4);
		re.calculateArea();
		re.show();
	}
}



