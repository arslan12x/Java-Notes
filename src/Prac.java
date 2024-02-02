import java.util.InputMismatchException;
import java.util.Scanner;

class Simple extends Thread{
	public void run() {
		System.out.println("Up and Run");
	}
}
class Simple1 implements Runnable{
	public void run() {
		System.out.println("Up and Run");
	}
}

class Prac{    
  public static void main(String args[]){    
	 Thread th = new Thread(new Simple1());
	 th.start();
	  
	  
 }    
}  
