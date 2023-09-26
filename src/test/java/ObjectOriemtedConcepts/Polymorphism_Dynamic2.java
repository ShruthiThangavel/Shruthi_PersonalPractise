package ObjectOriemtedConcepts;

public class Polymorphism_Dynamic2 extends Polymorphism_Dynamic{
	public void eyes() {
		System.out.println("He had 2 eyes");
	}
	public static void main(String[] args) {
		Polymorphism_Dynamic obj = new Polymorphism_Dynamic();
		obj.eyes();
		Polymorphism_Dynamic2 obj1 = new Polymorphism_Dynamic2();
		obj1.eyes();
		Polymorphism_Dynamic obj2 = new Polymorphism_Dynamic2();
		obj2.eyes();
		
		
	}

}
