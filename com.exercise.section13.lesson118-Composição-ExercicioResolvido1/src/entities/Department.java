package entities;

public class Department {

	private String departmentName;

	public Department() {
		
	}

	public Department(String name) {
		this.departmentName = name;
	}

	public String getName() {
		return departmentName;
	}

	public void setName(String name) {
		this.departmentName = name;
	}
	
}
