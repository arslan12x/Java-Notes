/*
 		PACKAGE - 
 		
 			A java package is a group of similar types of classes, interfaces and sub-packages.
 			
 			There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
 
 			Advantage of Java Package
			
			1) Java package is used to categorize the classes and interfaces so that they can be 
			easily maintained.

			2) Java package provides access protection.
			
			The package keyword is used to create a package in java.
 */



/*
  Scanner Class - 
  
	The Scanner class is used to get user input, and it is found in the java.util package.
	
		nextBoolean()	Reads a boolean value from the user
		nextByte()	Reads a byte value from the user
		nextDouble()	Reads a double value from the user
		nextFloat()	Reads a float value from the user
		nextInt()	Reads a int value from the user
		nextLine()	Reads a String value from the user
		nextLong()	Reads a long value from the user
		nextShort()	Reads a short value from the user

 */
package mypack;

import java.util.Scanner;


class Package{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Given input is :" + n);
}
}


