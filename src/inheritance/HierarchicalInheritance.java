package inheritance;

class Animals1{  
	void eat(){
		System.out.println("eating...");
		}  
	}  
class Dogs extends Animals1{  
	void bark(){
		System.out.println("barking...");
		}  
	}  
class Cat extends Animal{  
	void meow(){
		System.out.println("meowing...");
		}  
	}  
 

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Cat c=new Cat();  
			c.meow();  
			c.eat();  
			//c.bark();//C.T.Error  
			
	}

}
