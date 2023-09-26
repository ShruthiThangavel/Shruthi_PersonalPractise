package ObjectOriemtedConcepts;

public class Inheritance1_box {
	 int side;
	 String colour;
	
	public Inheritance1_box(int length,String nature) {
		this.side=length;
		this.colour=nature;
		
	}
		public void print() {
		System.out.println("The lenght of the box is: "+ this.side+" "+"The colour of the box is: "+this.colour);
	}

}
