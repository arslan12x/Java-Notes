package abstraction;

abstract class Animal{  
	  abstract void run();
	  void meow() {
		  System.out.println("Meow");
	  }
} 

class Cat extends Animal{  
	void run(){
		System.out.println("running");
	} 
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Cat();  
		 obj.run();
		 obj.meow();

	}

}
