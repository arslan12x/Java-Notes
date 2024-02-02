package controlstatment;


	
		/*

		CONTROL STATEMENT - Java provides three types of control flow statements.

			1.Decision Making statements-
				a.if statements
				b.switch statement
				
			2.Loop statements-
				a.do while loop
				b.while loop
				c.for loop

			3.Jump statements-
				a.break statement
				b.continue statement
		 */

		/*
		 
		 If statements ---
		 
		 */
		class DecisionS{
			void doPrint() { 
			int a=10;    
		    
			if( a>7) {        			// 1.if condition
				if(a<8) {   			// 2.nested if condition
					System.out.println("A is not greater than 8");    
			}
				else if(a>8) {    		// 3.else if condition	
					System.out.println("A is greater than 7 & 8");
			}
				else 					//  4.else condition		
				{    
					System.out.println("A is not greater than 7 & 8");    
			}    
			}else {    
			System.out.println("A is less than 7");    
			}    
			}    
			}  

		/*
		 
		 Switch Statements-----
		 */


		class Switchs{

			int num = 2; 
			void doPrint() {
				switch (num){  
				case 0:  
					System.out.println("number is 0");  
					break;  
				case 1:  
					System.out.println("number is 1");  
					break;  
				default:  
					System.out.println(num);
		}}}

		/*
			Loop Statements - Loop statements are used to execute the set of instructions in a repeated order. 

			There are three type of loop statement in java.

				1.For loop    ---    for(initialization, condition, increment/decrement) {    
							     		//block of statements 
									 }   
		 
				2.While loop  ---     while(condition){    
										//looping statements    
									 } 
									 
				3.Do-While loop ---    do     
										{    
											//statements    
										} 
										while (condition); 

		*/

		class LoopS{
			int i= 0; 
			int sum=0;

			void doFor() {

				for(int j = 1; j<=10; j++) {  
				sum = sum + j;  
				}  
				System.out.println("The sum of first 10 natural numbers is " + sum);  
				} 
			void doWhile() {
				while(i<=10) {    
					System.out.println(i);    
					i = i + 2;    
					}  
			}
			void doDoWhile() {
				do {    
					System.out.println(i);    
					i = i + 2;    
					}while(i<=10);    
					}    
			
					
			}
		/*
			Jump statements-
				
				Break statement - The break statement in java is used to terminate from the loop immediately.
				
				Continue statement - The continue statement in Java is used to skip the current iteration of a loop.

		*/

		class JumpS{
			void doPrint() {
			    for(int i=1;i<=10;i++){  
			        if(i==3){  
			            //breaking the loop  
			            continue;  
			        }  
			        else if (i==8) {
			        	break;
			        }
			        System.out.println(i); 
			    } 
			}
		}
		public class ControlStatement {

			public static void main(String[] args) {

				System.out.println("IF Statement --");		
				DecisionS obj=new DecisionS();
				obj.doPrint();
				
				System.out.println("Switch Statement -- ");
				Switchs obj1=new Switchs();
				obj1.doPrint();
				
				LoopS obj2=new LoopS();
				
				System.out.println("For Loop -- ");
				obj2.doFor();
				
				System.out.println("While Loop -- ");
				obj2.doWhile();
				
				System.out.println("DoWhile Loop -- ");
				obj2.doDoWhile();
				
				System.out.println("Jump Statement -- ");
				JumpS obj3= new JumpS();
				obj3.doPrint();
	
	
	}
	

}
