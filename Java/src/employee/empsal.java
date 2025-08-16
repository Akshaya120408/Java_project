package employee;

public class empsal {
	private String name;
	private float salary;
	private float bonus;
	private float salary1;
	public void setName(String name ) {
		this.name = name;
	}
	public String getName() {
		return name ;
	}
	public void setSalary(float salary ) {
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public void getBonus() {
		salary1 = salary;
		if(salary>5000) {
			bonus=500;
			salary1+=bonus;
		}
		else {
			bonus=200;
			salary+=bonus;
		}
		
	}
	@Override
	public String toString() {
		return "Employee Name : "+ name+"\nEmployee Salary : "+salary+"\nBonus amount : "+bonus+"\nEmployee Salary with Bonus : "+salary1;
	}
}
