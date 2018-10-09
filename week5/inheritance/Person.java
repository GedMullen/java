package inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name = "";
	private Date dateOfBirth = new Date();
	
	public Person(String name, String dateOfBirth) {
		super();
		this.name = name;
		SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			this.dateOfBirth = dateFormatter.parse(dateOfBirth);
		}catch(ParseException e) {
			System.out.println("Unaprseable date:" + dateOfBirth);
			e.printStackTrace();
		}		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}
