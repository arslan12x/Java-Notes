package question;

class Patt{
	void doDePrint(int n) {
		for (int i =0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("x");
			}
			System.out.println();
	}
}
	void doInPrint(int n) {
		for (int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("x");
			}
			System.out.println();
	}
}	
}

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Decresing Pattern --" );	
		System.out.println();
		Patt obj=new Patt();
		obj.doDePrint(5);
		
		System.out.println();

		System.out.println("Incresing Pattern --" );
		System.out.println();
		obj.doInPrint(5);

	}

}
