package inheritance;

public class Lecturer extends Staff{
	
	private String subjectSpeciality = "";

	public Lecturer(String name, String dateOfBirth, String staffId, String officeNumber, String subjectSpeciality, Address address) {
		super(name, dateOfBirth, staffId, officeNumber, address);
		this.subjectSpeciality = subjectSpeciality;
	}

	@Override
	public String toString() {
		return "Lecturer [subjectSpeciality=" + subjectSpeciality + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
