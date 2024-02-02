package wrapperclass;


 
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Autoboxing----");
		int a=20;  
		Integer i=Integer.valueOf(a);		//converting int into Integer explicitly  
		Integer j=a;						//autoboxing,now compiler will write Integer.valueOf(a) internally  
		System.out.println();		  
		System.out.println(a+" "+i+" "+j);
		
		System.out.println();
		
		System.out.println("----Unboxing----");
		Integer b=98;
		int x=b.intValue();					//converting Integer to int explicitly  
		int y=b;							//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println();
		System.out.println(b+" "+x+" "+y);    

	}

}
