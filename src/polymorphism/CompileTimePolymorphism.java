package polymorphism;

/*
     ---------------------- Compile Time Polymorphism  ------------------------
     
     
     1. It is also known as static polymorphism. 
     2. This type of polymorphism is achieved by method overloading.
 
 
 */

class ComP{

	int doPrint(int a,int b) {
		System.out.println("Hey This is Compile Time Poly");
		return a*b;
	}
	int doPrint(int a) {
		System.out.println("hey");
		return a;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ComP obj=new ComP();
		System.out.println(obj.doPrint(467,1));
		System.out.println(obj.doPrint(45));		
		
		

	}

}
