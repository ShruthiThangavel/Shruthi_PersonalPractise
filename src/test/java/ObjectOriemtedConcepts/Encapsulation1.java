package ObjectOriemtedConcepts;

public class Encapsulation1 {
	private String name;
	private int age;
	private int number;

	public static void main(String[] args) {
		Encapsulation1 obj = new Encapsulation1();
		obj.setname("Shruthi");
		obj.setage(24);
		obj.setnumber(49);

		System.out.println("The name is: " + obj.getname());
		System.out.println("The age is: " + obj.getage());
		System.out.println("The number is: " + obj.getnumber());

	}

	public int getnumber() {
		// TODO Auto-generated method stub
		return number;
	}

	public int getage() {
		// TODO Auto-generated method stub
		return age;
	}

	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setnumber(int i) {
		// TODO Auto-generated method stub
		number = i;

	}

	public void setage(int i) {
		// TODO Auto-generated method stub
		age = i;

	}

	public void setname(String string) {
		// TODO Auto-generated method stub
		name = string;

	}

}
