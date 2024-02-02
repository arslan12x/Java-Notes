package polymorphism;

/*
 
 	--------------------  Run Time Polymorphism  -----------------------
 	
 
  1. It is a process in which a function call to the overridden method is resolved at Runtime. 
  2. This type of polymorphism is achieved by Method Overriding. 
  3. Method overriding, on the other hand,occurs when a derived class has a definition for one of the 
  	 member functions of the base class. 
 
 
 */

class RunP{
	void doPrint() {
		System.out.println("Hey I'll show you !");
	}
}

class RunP1 extends RunP{
	void doPrint() {
		System.out.println("Can you please show me?");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunP obj = new RunP();
		RunP obj1 = new RunP1();	//dynamic method dispacth	
		obj.doPrint();
		obj1.doPrint();	
		
		
	}

}









