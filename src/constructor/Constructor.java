package constructor;

/*
    -----------------      Constructor    --------------
 
 
 		1.Constructor is a block of codes similar to the method. 
 		2.It is called when an instance of the class is created.
 		3.At the time of calling the constructor, memory for the object is allocated in the memory.
  		4.It is a special type of method that is used to initialize the object. 
 		5.Every time an object is created using the new() keyword, at least one constructor is called.
 
 		Purpose of Constructor-----
 		
 			1.The main purpose of Constructor is to initialize object. 
*/


/*

  How Java Constructors are Different From Java Methods?
 
	1.Constructors must have the same name as the class within which it is defined it is not necessary for the 
	method in Java.
	
	2.Constructors do not return any type while method(s) have the return type or void if does not return any 
	value.

	3.Constructors are called only once at the time of Object creation while method(s)can be called any number
	of times.

*/


//       ------------------ Types of Constructors in Java--------------------------

/*

		1.Default Constructor :
		
			1.A constructor that has no parameters is known as default the constructor. 
			2.A default constructor is invisible.
		
		2.Parameterized Constructor :
		
			1.A constructor that has parameters is known as parameterized constructor. 
	    	2.If we want to initialize fields of the class with our own values, then use a parameterized 
			constructor.
		
		3.Copy Constructor :
		
			A copy constructor in a Java class is a constructor that creates an object using another 
			object of the same Java class.

*/

class Employee {
    Employee(){
    }
    Employee(Employee employewefgdfe) {

    }
}

class DefConst{

	DefConst(){                   //Default Constructor

	        System.out.println("Constructor Called");
	    }
	DefConst(int y){                   //Default Constructor

        System.out.println("Constructor1 Called");
    }
	}
class ParaConst{
	ParaConst(int a){             // Parametric Constructor
		System.out.println(a);
	}
}

public class Constructor {
	public static void main(String[] args) {
		DefConst obj=new DefConst();
		DefConst obj2=new DefConst(5);
		ParaConst obj1 =new ParaConst(3);
		
	}

}