import java.util.Scanner;

public class Controller {
	
	private Model model = new Model();
	Scanner scan = new Scanner(System.in);

	private void populateModel(){		
		model.populateHouses();
		model.populateCustomers();
	}
	
	private void printModel(){
		System.out.println(model);
	}
	
	private void startAdminMenu(){
		System.out.println("a) Add Customer");
		System.out.println("b) List All Customers"); 
		System.out.println("c) Add House Details");
		System.out.println("d) Edit House Details");
		System.out.println("e) List All Houses");
		System.out.println("f) Record A Sale");
		System.out.println("g) Edit A Sale");
		System.out.println("h) List Sales");					
		String option = scan.next();
		if(option.equals("a")) addCustomer();
		menuStart();
	}
	
	private void addCustomer(){
		System.out.println("Please enter customer user name.");
		String username = scan.next();
		System.out.println("Please enter customer password.");
		String password = scan.next();
		model.addCustomer(username, password);
	}
	
	private void startCustomerMenu(){		
		System.out.println("a) Edit Profile"); 
		System.out.println("b) Search For A House"); 
	}
	
	private void menuStart(){
		boolean isCorrectLogin = false;
		//keep looping until they enter in a correct username and password
		while (!isCorrectLogin) {
			System.out.println("Please enter your user name.");
			String username = scan.next();
			System.out.println("Please enter your password.");
			String password = scan.next();
			//is the login a customer login? 
			if(model.checkLogin(username, password)){
				isCorrectLogin = true;
				startCustomerMenu();
			}else{ //check if admin login
				if(username.equals("admin") && password.equals("password")){
					isCorrectLogin = true;
					startAdminMenu();
				}
			}
		}
		scan.close();		
	}
	
	public static void main(String[] args) {

		Controller controller = new Controller();
		controller.populateModel();
		controller.printModel();
		controller.menuStart();		
	}
}
