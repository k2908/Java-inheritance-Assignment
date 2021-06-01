
class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ex1= new Rectangle(5,6);
		Square ex2= new Square(10,10);
		ex1.printArea();
		ex1.printPerimeter();
		ex2.printArea();
		ex2.printPerimeter();
	}

}
class Rectangle{
	int length;
	int breadth;
	
	
	void printArea(){
		double area=length*breadth;
		System.out.println("the area is "+ area 
				);
		
		
		
		
		
	}
	void printPerimeter() {
		int perimeter= 2*(length+breadth);
		System.out.println("the perimeter is "+ perimeter);
	}
	Rectangle(int a, int b){
		length= a;
		breadth = b;
}
	
}
class Square extends Rectangle {

	Square(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}