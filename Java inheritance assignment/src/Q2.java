
class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Godwin= new Employee();
		Manager Kofi = new Manager();
		Godwin.assign("Godwin", 24, "0217895512", "tesano", 5000);
		Kofi.assign("Kofi", 35, "2654899541", "abeka", 20000);
		Godwin.display();
		Kofi.display();
		

	}
	}
 class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	void assign(String name, int age, String phoneNumber, String address,int salary) {
		this.address= address;
		this.age= age;
		this.phoneNumber=phoneNumber;
		this.salary=salary;
		this.name= name;
	}
	void display() {
		System.out.println(name+" "+age+" "+phoneNumber+" "+address+" "+salary);
	}
	void printSalary(){
		System.out.println(salary);
	}
	
}
class Employee extends Member{
	String specialization;
	String department;
	
}
class Manager extends Member{
	String specialization;
	String department;
	
}

