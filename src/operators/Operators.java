package operators;

/*
Operators in Java -

Operator in Java is a symbol that is used to perform operations.

1.Java Unary Operator -

It is use for incrementing/decrementing a value by one.




*/
//1.Unary------
class Unary{
	int x=10; 
	public void doPrint() {

		System.out.println(x++);
		System.out.println(++x); 
		System.out.println(x--);  
		System.out.println(--x); 
	}
}

/*2.Arithmetic -

	It is used for performing basic arithmetic operations. Like -

1. Multiplicative -- * / %
2. Additive  ------  + -

*/

class Arithmetic{
	int a=10;  
	int b=5; 
	void doPrint() {
	System.out.println();
	System.out.println(a+b);//15  
	System.out.println(a-b);//5  
	System.out.println(a*b);//50  
	System.out.println(a/b);//2  
	System.out.println(a%b);//0
}}

/* 
	Bitwise Operators ------
		
	1.Bitwise AND	& -  The  & operator always checks both conditions whether first condition is true or false.
	2.Bitwise exclusive OR	^ -  Compares each bit of its first operand to the corresponding bit of its second operand.
	3.Bitwise inclusive OR	| - The bitwise | operator always checks both conditions whether first condition is
	 true or false.

*/

class Bitwise   
{   
 public void method() {
int x = 9, y = 8;   

System.out.println("x & y = " + (x & y));   
System.out.println("x | y = " + (x | y)); 
}  }

/*
 	Relational Operators-Relational Operators in Java are used to comparing two variables for equality,
 	non-equality, greater than, less than, etc. 
	
	Comparison ----	 < > <= >=
	
	Equality ------  == !=
*/

class Relational{

	 void doprint(int a,int b) {

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);



	}

}
/*
 
Logical Operators- 

1.Logical AND	&& - The logical && operator doesn't check the second condition if the first condition is 
false. It checks the second condition only if the first one is true.

2.Logical OR	|| - The logical || operator doesn't check the second condition if the first condition is 
true. It checks the second condition only if the first one is false.
*/

class Logical{

	 void doPrint(int a,int b,int c) {

		 System.out.println(a<b&&a++<c);
	 }
}
/*

Assignment	assignment ----- 	= += -= *= /= %= 

*/

 class Assignment{  
	 int a=10;  
	 void doPrint() {

	 a+=3;//10+3  
	 System.out.println(a);  
	 a-=4;//13-4  
	 System.out.println(a);  
	 a*=2;//9*2  
	 System.out.println(a);  
	 a/=2;//18/2  
	 System.out.println(a);
	 
}}

public class Operators {
	

	public static void main(String[] args) {

	 System.out.println("This show Unary Operator");
	 Unary obj1=new Unary();
	 obj1.doPrint();
	 
	 System.out.println();
	 
	 System.out.println("This show Arithmetic Operator");	 
	 Arithmetic obj2=new Arithmetic();
	 obj2.doPrint();
	 
	 System.out.println();	
	 
	 System.out.println("This show Bitwise Operator");	 
	 Bitwise obj3=new Bitwise();
	 obj3.method();
	 
	 System.out.println();	
	 
	 System.out.println("This show Relational Operator");	 
	 Relational obj4=new Relational();
	 obj4.doprint(5, 8);
	 
	 System.out.println();	

	 System.out.println("This show Logical Operator");
	 Logical obj5=new Logical();
	 obj5.doPrint(5,6,7);
	 
	 System.out.println();	
	 
	 System.out.println("This show Assignment Operator");
	 Assignment obj6=new Assignment();
	 obj6.doPrint();
	}

}
