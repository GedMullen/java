package inheritance;

public class Student extends Person{
	
	private String studentId = "";
	private String courseCode = "";
	
	public Student(String name, String dateOfBirth, String studentId, String courseCode) {
		super(name, dateOfBirth);
		this.studentId = studentId;
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseCode=" + courseCode + ", toString()=" + super.toString()
				+ "]";
	}

	
}
