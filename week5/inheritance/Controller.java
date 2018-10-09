package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	
	ArrayList<Person> people = new ArrayList<Person>();
	
	public void populate() {

		Lecturer lecturer = new Lecturer("Susan", "1/1/1990", "7766", "6543", "Java");
		people.add(lecturer);
		Manager manager = new Manager("Robert", "1/1/1991", "7766", "6543", "IT");
		people.add(manager); 
		manager =  new Manager("Willie", "1/1/1992", "7766", "6543", "Maths");
		people.add(manager);
		Student student = new Student("Caitlin", "1/1/1999", "1234", "BSC");
		people.add(student);
		student = new Student("Connor", "1/1/1998", "1234", "BSC");
		people.add(student);
		student = new Student("Harry", "1/1/1997", "1234", "BSC");
		people.add(student);
	}
	
	public void search() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name to search:");
		String name = scan.next();
		
		boolean found = false;
		for(Person person:people) {
			if(person.getName().equals(name)) {
				found = true;
				System.out.println("Name Found:" + person);
				break;
			}
		}
		if(!found) {
			System.out.println("Not Found");
		}
		scan.close();
		
	}
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		controller.populate();
		controller.search();
		
	}
}
