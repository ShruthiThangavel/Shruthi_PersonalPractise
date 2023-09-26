package ObjectOriemtedConcepts;

public class Polymorphism_static {
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void multiply(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	public void multiply(String a) {
		System.out.println(a);
	}
	public void multiply(double a,double b) {
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		Polymorphism_static obj = new Polymorphism_static();
		obj.multiply(5,6);
		obj.multiply(5,6,2);
		obj.multiply("shruthi");
		obj.multiply(5.2,6.2);
		
		
	}

}
