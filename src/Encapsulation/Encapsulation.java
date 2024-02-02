package Encapsulation;

/*
 			---------------------- Encapsulation -----------------------
 			
 	Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, 
 	a capsule which is mixed of several medicines.
 	
 	We can create a fully encapsulated class in Java by making all the data members of the class private. 
 	
 	Now we can use setter and getter methods to set and get the data in it.
 	
 	Advantages of Encapsulation-
 	
 	1.It provides you the control over the data.
 	2.It is a way to achieve data hiding in Java
*/

class Implementation{
	private int value;        			//Data Hiding
	
	public void setValue(int x) {       // Data Abstraction
		value=x;
	}
	public int getValue() {
		return value;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		Implementation obj= new Implementation();
		obj.setValue(50);
		System.out.println(obj.getValue());

	}

}
