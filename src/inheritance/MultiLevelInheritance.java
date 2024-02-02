package inheritance;


class Animal{  
	void eat(){
		System.out.println("eating...");
		}  
}  
class Dog extends Animal{  
	void bark(){
		System.out.println("barking...");
		}  
}  
class FemaleDog extends Dog{  
	void weep(){
		System.out.println("weeping...");
	}  
}  

public class MultiLevelInheritance {
	
public static void main(String[] args) {
	
	FemaleDog d=new FemaleDog();  
	d.weep();  
	d.bark();  
	d.eat(); 
	
}
}
