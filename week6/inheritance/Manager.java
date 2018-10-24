package inheritance;

public class Manager extends Staff{

	private String department = "";

	public Manager(String name, String dateOfBirth, String staffId, String officeNumber, String department, Address address) {
		super(name, dateOfBirth, staffId, officeNumber, address);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", toString()=" + super.toString() + "]";
	}
	
	

}
