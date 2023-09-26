package JavaPrograms;

public class MethodOverriding1 extends MethodOverRiding{
	void method1() {
		System.out.println("Bad");
	}
	void method2() {
		System.out.println("Shruthi");
	}
public static void main(String[] args) {
	MethodOverriding1 obj =  new MethodOverriding1();
	obj.method1();
	
	// note while inheriting parent to child. we can't create obj for parent cls.
	// parent obj = new parent(); -> not possible
	// parent obj = new child(); -> possible ( here methods and variables common to both parent and child can be accessed, only child methods can't be accessed )
	// child obj = new child(); -> best ( it can access both inherited methods and child methods )
	}
}
