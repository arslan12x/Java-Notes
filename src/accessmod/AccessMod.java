package accessmod;
/*
  
  Access Modifiers in Java -
  
  The Access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, 
  methods, constructors, data members, and the setter methods.
  
  There are four types of Java access modifiers:

	1.Private: The access level of a private modifier is only within the class. It cannot be accessed 
	from outside the class.
	
	2.Default: If we do not explicitly specify any access modifier for classes, methods, 
	variables, etc, then by default the default access modifier is considered.
	
	The access level of a default modifier is only within the package. It cannot be accessed from outside 
	the package. 
	
	3.Protected: The access level of a protected modifier is within the package and outside the package 
	through child class. If you do not make the child class, it cannot be accessed from outside the package.
	
	4.Public: The access level of a public modifier is everywhere. It can be accessed from within the class, 
	outside the class, within the package and outside the package.
 */

//                  -------------- Default Access Modifier-----------------------

//Here we are not assign any access specifier then by default the default access modifier is considered.

class DefaultMod {
    void message(){
        System.out.println("This is a message");
    }
}

//                  --------------- Private Access Modifier -----------------------

//When variables and methods are declared private, they cannot be accessed outside of the class.

class PrivateMod {
	
    private String name;
}

//                  --------------- Protected Access Modifier -----------------------

/*
   When methods and data members are declared protected, we can access them within the same package as well
   as from subclasses.
   
*/

class ProtectedMod {

    protected void display() {
        System.out.println("I am Aman");
    }
}
//                    --------------- Public Access Modifier -----------------------

/*

When methods, variables, classes, and so on are declared public, then we can access them from anywhere. 
The public access modifier has no scope restriction.

*/

 class PublicMod {         //doubt that while declaring class method then it show error !
	public int x;
    public void display() {
        System.out.println("Hello");
        System.out.println("Arslan");
    }

}

public class AccessMod extends ProtectedMod{

	public static void main(String[] args) {

		DefaultMod obj=new DefaultMod();
		obj.message();
		
		PrivateMod obj1 = new PrivateMod();
//      obj1.name = "Aman";
        
		AccessMod obj2 = new AccessMod();
		obj2.display();
		
		PublicMod obj3 = new PublicMod();
		obj3.x=34;
		obj3.display();       

	}

}
