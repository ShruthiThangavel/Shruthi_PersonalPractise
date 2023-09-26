package ObjectOriemtedConcepts;

public class Inheritance1_boxObj extends Inheritance1_box {
	public int area;

	public Inheritance1_boxObj(int length, String nature,int area) {
		super(length,nature);
		// TODO Auto-generated constructor stub
		this.area=area;
	}
	public void printArea() {
		System.out.println("Area of the box is: "+this.area);
	}
	public static void main(String[] args) {
		Inheritance1_boxObj box1 = new Inheritance1_boxObj(5,"pink", 25);
		Inheritance1_boxObj box2 = new Inheritance1_boxObj(6,"red",36);
		box1.print();
		box1.printArea();
		box2.print();
		box2.printArea();
		
		
		
		
	}

}
