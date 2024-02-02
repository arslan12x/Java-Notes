package question;

class PrintTask{
	public int doPrint(int i,int n) {
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		return 0;
		
	}
}
class PrintTask1{
	public int doPrint(int i,int n) {
		do{
			System.out.println(i);
			i++;
		}
			while(i<=n);
			
		
		return 0;
		
	}
}

public class Loops_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTask obj=new PrintTask();
		obj.doPrint(1, 50);
		PrintTask1 obj1=new PrintTask1();
		obj1.doPrint(1, 50);

		
	}

}
