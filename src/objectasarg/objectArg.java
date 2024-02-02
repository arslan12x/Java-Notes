package objectasarg;

class Emp{
	int salary;
	String name;
	void setSalary(int salary) {
		this.salary=salary;
		
	}
	int getSalary() {
		return salary;
	}
	void setName(String name) {
		this.name=name;
		
	}
	String getName() {
		return name;
	}
}
class Emp1{
	
	void getEmp1(Emp e) {
		System.out.println(e);
	}
	
}

public class objectArg {

	public static void main(String[] args) {

		Emp1 obj = new Emp1();
		obj.getEmp1(Emp );

	}

}
