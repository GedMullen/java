package inheritance;

public class Staff extends Person {
	
	private String staffId = "";
	private String officeNumber = "";
	
	public Staff(String name, String dateOfBirth, String staffId, String officeNumber) {
		super(name, dateOfBirth);
		this.staffId = staffId;
		this.officeNumber = officeNumber;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", officeNumber=" + officeNumber + ", toString()=" + super.toString()
				+ "]";
	}


}
