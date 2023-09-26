package ObjectOriemtedConcepts;

public class InheritanceWithoutConstructor1  extends InheritanceWithoutConstructor{
	int age;
	public void printAge(int age) {
		this.age = age;
		System.out.println("Age of Employee: "+ age);
	}
	public static void main(String[] args) {
		InheritanceWithoutConstructor1 Emp1=new InheritanceWithoutConstructor1();
		InheritanceWithoutConstructor1 Emp2=new InheritanceWithoutConstructor1();
		Emp1.printEmpDetail1(25,"Shruthi");
		Emp1.printAge(24);
		Emp2.printEmpDetail1(26,"Shrishti");
		Emp2.printAge(27);
		
	}

}
