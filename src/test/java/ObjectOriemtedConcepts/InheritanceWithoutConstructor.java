package ObjectOriemtedConcepts;

public class InheritanceWithoutConstructor {
	int Emp_number;
	String Emp_name;
	
	public void printEmpDetail1( int E_n,String E_name) {
		this.Emp_number=E_n;
		this.Emp_name=E_name;
		System.out.println("Emp no. is : "+this.Emp_number+"Emp name is "+ this.Emp_name);
		
	}

}
