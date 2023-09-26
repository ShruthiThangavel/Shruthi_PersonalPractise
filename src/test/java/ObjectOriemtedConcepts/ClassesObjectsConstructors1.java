package ObjectOriemtedConcepts;

public class ClassesObjectsConstructors1 {
	private int rNo;
	private String name1;
	private double score;

	public ClassesObjectsConstructors1(int rollNo, String name, double marks) {
		// TODO Auto-generated constructor stub
		
		this.rNo=rollNo;
		this.name1=name;
		this.score=marks;
		System.out.println("Roll no: "+rollNo+"Name: "+name+"Marks: "+marks);
		
	}

	public static void main(String[]args) {

	ClassesObjectsConstructors1 Shruthi = new ClassesObjectsConstructors1(49,"shruthi",98.9);
	ClassesObjectsConstructors1 Gayathri = new ClassesObjectsConstructors1(15,"gayu",97.9);
	
	
	}
	
}
