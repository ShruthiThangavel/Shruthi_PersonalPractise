package ObjectOriemtedConcepts;

public class Child2 extends AbstractClass {
	void son() {
		// TODO Auto-generated method stub
		System.out.println("My name is Harish");
		
	}

	void daughter() {
		// TODO Auto-generated method stub
		System.out.println("My name is Shruthika");
		
	}
	public static void main(String[] args) {
		Child2 obj1 = new Child2();
		obj1.son();
		Child1 obj2= new Child1();
		obj2.daughter();
		
		
		
	}

}
