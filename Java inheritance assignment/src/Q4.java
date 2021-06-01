
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square square[]= new Square[10];
	square[0]=new Square(5, 5);
	square[1]=new Square(4, 4);
	square[2]=new Square(3, 3);
	square[3]=new Square(2, 2);
	square[4]=new Square(1, 1);
	square[5]=new Square(6, 6);
	square[6]=new Square(7, 7);
	square[7]=new Square(8, 8);
	square[8]=new Square(9, 9);
	square[9]=new Square(10, 10);
	
	
	for(int i=0;i < square.length;i++) {
		square[i].printArea();
		
	}
	
	}

}
