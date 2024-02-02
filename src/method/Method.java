package method;

/*

Method -

A method is a block of code or collection of statements or a set of code grouped together to perform a 
certain task or operation.


*/
import java.util.Scanner; 
	
class EvenOdd {
	 void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	} 
}
	
public class Method {

	 
	public static void main (String args[])  
	{  

	Scanner sc=new Scanner(System.in);  

	int num=sc.nextInt();
	EvenOdd obj=new EvenOdd();
	//method calling  
	obj.findEvenOdd(num);  
	} }
