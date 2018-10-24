package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public ArrayList<Person> people = new ArrayList<Person>();
	public Scanner scan = new Scanner(System.in);

	public void populate() {

		Address address = new Address("12", "Downing Street", "London", "SW1");
		Lecturer lecturer = new Lecturer("Susan", "1/1/1990", "7766", "6543", "Java", address);
		people.add(lecturer);
		address = new Address("12", "Princess Street", "London", "SW2");
		Manager manager = new Manager("Robert", "1/1/1991", "7766", "6543", "IT", address);
		people.add(manager);
		address = new Address("15", "Princess Street", "London", "SW2");
		manager = new Manager("Willie", "1/1/1992", "7766", "6543", "Maths", address);
		people.add(manager);
		address = new Address("17", "Princess Street", "London", "SW2");
		Student student = new Student("Caitlin", "1/1/1999", "1234", "BSC", address);
		people.add(student);
		student = new Student("Connor", "1/1/1998", "1234", "BSC");
		people.add(student);
		address = new Address("22", "Princess Street", "London", "SW2");
		student = new Student("Harry", "1/1/1997", "1234", "BSC", address);
		people.add(student);
	}

	public void search() {

		System.out.println("Enter a name to search:");
		String name = scan.nextLine();

		boolean found = false;
		for (Person person : people) {
			if (person.getName().equals(name)) {
				found = true;
				System.out.println("Name Found:" + person);
				break;
			}
		}
		if (!found) {
			System.out.println("Not Found");
		}

	}

	public void addStudent() {
		System.out.println("Enter Name:");
		String name = scan.nextLine();
		System.out.println("Enter DOB DD/MM/YY:");
		String dob = scan.nextLine();
		System.out.println("Enter Student ID:");
		String id = scan.nextLine();
		System.out.println("Course ID:");
		String course = scan.nextLine();
		Student student = new Student(name, dob, id, course);
		people.add(student);
		
	}
	
	public Student findStudent(String name) {
		for(Person person:people) {
			if(person.getName().equals(name)) {
				return (Student)person;
			}
		}
		return null;
	}
	
	public void updateStudent() {
		System.out.println("Enter name to update");
		String name = scan.nextLine();
		Student student = findStudent(name);
		people.remove(student);
		addStudent();
	}
	
	public void menu() {

		scan.useDelimiter("\n");
		while (true) {
			System.out.println("Please choose from the following options:");
			System.out.println("(a) Search for Person");
			System.out.println("(b) Add a Student");
			System.out.println("(c) Update Student");			
			System.out.println("(x) Exit");
			String option = scan.nextLine();

			switch (option) {
			case "a":
				search();
				break;
			case "b":
				addStudent();
				break;
			case "c":
				updateStudent();
				break;
			case "x":
				scan.close();
				System.out.println("Bye..");
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {

		Controller controller = new Controller();
		controller.populate();
		controller.menu();

	}
}
