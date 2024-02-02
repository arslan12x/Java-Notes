package statickeyword;

/*  
 	
 	The static keyword in Java is used for memory management mainly. We can apply static keyword with 
 	variables, methods, blocks and nested classes.
 	
 	A static method can be accessed without creating an object of the class
 	
 	The static can be:

		1.Variable (also known as a class variable) :
		
		The static variable can be used to refer to the common property of all objects (which is not unique 
		for each object), for example, the company name of employees, college name of students, etc.
		
		2.Method (also known as a class method) :
		
		A static method belongs to the class rather than the object of a class.
		A static method can be invoked without the need for creating an instance of a class.
		
		3.Block :
		
		Is used to initialize the static data member.
        It is executed before the main method at the time of classloading.
		
		4.Nested class :
		
		Nested static class doesn’t need a reference of Outer class.
 
 */

public class StaticKeyword {
	
    // static variable
	static int var=34;
	
    // static method
    static void m1()
    {
        System.out.println("Static method initialized.");
    }
    // static block
    static {
        System.out.println("Static block initialized.");

    }
    static class MyNestedClass {
        
        // non-static method
        public static void disp(){ 
          System.out.println("Non-static class"); 
        }
    }
	public static void main(String[] args) {
		 
		// calling m1 without creating
        // any object of class Test
		StaticKeyword obj= new StaticKeyword();
		int x=var;
		System.out.println(x);
		m1();
		MyNestedClass.disp();

	}

}
