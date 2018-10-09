package inheritance;

public class Manager extends Staff{

	private String department = "";

	public Manager(String name, String dateOfBirth, String staffId, String officeNumber, String department) {
		super(name, dateOfBirth, staffId, officeNumber);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", toString()=" + super.toString() + "]";
	}
	
	

}
