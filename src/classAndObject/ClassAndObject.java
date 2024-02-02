package classAndObject;

/*
CLASS-
 
1. Class is a set of object which shares common characteristics/ behavior and common properties/ attributes.
2. Class is not a real world entity.It is just a template or blueprint or prototype from which objects are 
created.

OBJECT-

Object is an instance of a Java class, meaning it is a copy of a specific class.
*/


class newClass {
	 
   	  int x;
   	  public void doPrint() {
   		  System.out.println(x);
   	  }
   	}
   
//   Creation of object for class .

public class ClassAndObject {

	public static void main(String[] args) {
	    
	    newClass obj=new newClass();
	    obj.doPrint();
	    Class1 obj1=new Class1();
		 Cat obj2 = new X();  
		 obj2.meow(); 
		 System.out.println(obj.x);

	}

}

//Type of class-

//1.Final class- A final class is a class that can't be extended.

final class Class1 {
	 
   void Display()
   {
       System.out.print("Method of final class.");
   }
   
}

//2. Abstract Class- 

//A class that has zero or more abstract methods and is specified with the abstract keyword is called an 
//abstract class.

abstract class Cat{  
	  abstract void meow();  
	}  
	class X extends Cat{  
	void meow(){
		System.out.println("meow");
		}  
	public static void main(String args[]){  

	}  
	} 
	
//3. Concrete Class
	
//	  A normal class with an implementation for all of its methods and no abstract methods is called a 
//   concrete class. 