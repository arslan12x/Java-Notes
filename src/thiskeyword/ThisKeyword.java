package thiskeyword;

class Exp1{
	int a;
	Exp1(int a){
		this.a=a;
		System.out.println(a);
	}
}

class Exp2{
	Exp2(){
		System.out.println("constructor call");
	}
	Exp2(int a){
		this();
		System.out.println("para constructor get call");
	}
}

class Exp3{
	int m() {
		int a=10;
		System.out.println(a);
		return a;
	}
	int n() {
		this.m();
		int b=20;
		System.out.println(b);
		return b;
	}
}


public class ThisKeyword {

	public static void main(String[] args) {

		Exp1 obj = new Exp1(5);
		Exp2 obj1 = new Exp2(5);
		Exp3 obj2 = new Exp3();
		obj2.n();
		

	}

}
