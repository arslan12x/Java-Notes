package calculator;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {

		double num1, num2;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");


		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");

		char operator = sc.next().charAt(0);
			
		double res = 0;

		switch (operator) {
			
			case '+':
				res = num1 + num2;
				break;
		
			case '-':
				res = num1 - num2;
				break;

			case '*':
				res = num1 * num2;
				break;
	
			case '/':
				res = num1 / num2;
				break;

			default:
				System.out.println("You enter wrong input");
			
		}

		System.out.println("The final result:");
		System.out.println();

		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + res);


			}
	}
