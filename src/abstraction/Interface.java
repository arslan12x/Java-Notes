package abstraction;

/*
 							----------	Interface   -------------
 							
 	1.The interface in Java is a mechanism to achieve abstraction. 
 	2.There can be only abstract methods in the Java interface, not method body. 
 	3.It is used to achieve abstraction and multiple inheritance in Java.
 	
 	
 						--------- Reasons to use interface -------

	1.It is used to achieve abstraction.
	2.By interface, we can support the functionality of multiple inheritance.
	3.It can be used to achieve loose coupling.
	
	
 
 */

 
  
interface print{
	void doprint();            //how to call 
}
class A implements print{
	public void doprint(){
		System.out.println("Hello");
	}
}


/*
 
 					Multiple inheritance in Java by interface
 					
 					
	If a class implements multiple interfaces, or an interface extends multiple interfaces, 
	it is known as multiple inheritance.


 
 */

interface Printable{  
	void print();  
}  
interface Showable{  
	void show();  
}  
class A1 implements Printable,Showable{  
	public void print(){
		System.out.println("Hello");
		}  

	public void show(){
		System.out.println("Welcome");
		}  
	}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();  
		obj.doprint();
		
		System.out.println();
		
		A1 obj1 = new A1();  
		obj1.print();  
		obj1.show();  


	}

}
