package reflection;

public class Parent2 implements Comparable<Parent2> {
	int var;
	//String name;
	String firstName;
	String lastName;
	
	public Parent2(int var, String firstName, String lastName) {
		super();
		this.var = var;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int compareTo(Parent2 p1) {
		//return lastName.compareTo(p1.lastName);
		if(var==p1.var) {
			return 0;
		}
		else if(var<p1.var) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	void showmsg() {
		System.out.println("Hello there");
	}

	

	
	
}
