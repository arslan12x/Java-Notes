package variable;

/*
 * Variable-
 * 
 * Variable is a name of memory location. There are three types of variables in java: local, instance and 
  static.
  
1.Local Variable-
A variable declared inside the body of the method is called local variable.

2.Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable.

3. Static variable
A variable that is declared as static is called a static variable. It cannot be local.
  
  */

class Num{
	  static int m=100;//static variable  
	   
	    void method()  
	    {    
	        int x=90;//local variable
	        System.out.println(x);    
	    } 
}

public class VariableName {

	public static void main(String[] args) {

		        int data=50;//instance variable 
		        Num obj=new Num();

		        System.out.println(m);
		        System.out.println(data);
		        obj.method();
	}

}
