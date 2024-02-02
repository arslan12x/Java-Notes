package superkeyword;

class Animal{  
	Animal(){
		System.out.println("animal is created");
		}  
}  
class Dog extends Animal{  
	Dog(){  
		super();  
		System.out.println("dog is created");  
	}  
}  
class Student{
	void doPrint() {
		System.out.println("Parent class method");

	}
}
class S1 extends Student{
	void doPrint() {
		super.doPrint();
		System.out.println("Child class method");


	}
	void show() {
		super.doPrint();
		doPrint();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 obj=new S1();
		//obj.doPrint();
		obj.show();
		Dog d=new Dog(); 
	}

}
