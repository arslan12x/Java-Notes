package inheritance;

class Animals{
 void carnivore() {  //static scenario
		System.out.println("Yes, I am Carnivorous animal");
	}
	void herbivore() {
		System.out.println("Yes, I am Herbivorous animal");		
	}
	
}
class Lion extends Animals{
	void carnivore() {  //static scenario
		System.out.println("Yes, I am Carnivorous animal");
	}
	void roar() {
		System.out.println("Roaring...");
	}
	
}

class Cow extends Animals{
	void carnivore() {
		System.out.println("Yes, I am animal (cow)");
	}
	void moo() {
		System.out.println("Mooing...");
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		Lion obj=new Lion();
		obj.roar();
		obj.carnivore();
		
		Animals obj1=new Cow();
		obj1.carnivore();        //explore
	//     obj1.moo();
		
		Cow obj2=new Cow();
		obj2.carnivore();


	}

}
