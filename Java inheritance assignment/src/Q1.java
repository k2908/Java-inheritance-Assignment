
class Q1 {
void print(){
	System.out.println("this is parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 a =new Q1();
		child b = new child();
		a.print();
		b.print1();
		b.print();
		

	}

}
class child extends Q1{
	void print1(){
		System.out.println("this is child class");
		}
}
