package finalkeyword;

final class Final1{

	}
//class Final2 extends Final1{                    Final Class
	
//}
class Final3{
final int a=10;								   // Final Variable

final int myNum() {							   // Final Method
	return a;
}}
class Final4 extends Final3{
//	int myNum(){
		
//	}
}


public class FinalKeyword {

	public static void main(String[] args) {
		Final3 obj=new Final3();
		
		System.out.println(obj.a);
		//obj.a=20;
		
	}

}
