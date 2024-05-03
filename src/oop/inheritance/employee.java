package oop.inheritance;

public class Employee extends UserInput{
    public Employee() {}
    public Employee(String greet) {
		super(greet);
	}

	public void inputData() {
		
		System.out.println("Enter employee data: ");
		
	}
}