package ObjectOriemtedConcepts;

public class ClassesObjectsConstructors2 {
	private String hobby;
	private String personality;
	private String nature;

	public static void main(String[] args) {
		
		ClassesObjectsConstructors2 Shruthi=new ClassesObjectsConstructors2();
		Shruthi.hobby="dance";
		Shruthi.nature="good";
		Shruthi.personality="genuine";
		Shruthi.printValue(Shruthi.hobby,Shruthi.nature,Shruthi.personality);
		
		
	}
	void printValue(String hobby,String nature,String personality) {
		System.out.println(hobby+" "+nature+" "+personality);
	}

}
