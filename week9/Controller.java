import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		Model model = new Model();
		model.populateHouses();
		model.populateCustomers();
		System.out.println(model);	
		
		boolean isCorrectLogin = false;
		Scanner scan = new Scanner(System.in);
		//keep looping until they enter in a correct username and password
		while (!isCorrectLogin) {
			System.out.println("Please enter your user name.");
			String username = scan.next();
			System.out.println("Please enter your password.");
			String password = scan.next();
			
			//is the login a customer login? 
			if(model.checkLogin(username, password)){
				isCorrectLogin = true;
				System.out.println("a) Edit Profile"); 
				System.out.println("b) Search For A House"); 

			}else{ //check if admin login
				if(username.equals("admin") && password.equals("password")){
					isCorrectLogin = true;
					System.out.println("a) Add Customer");
					System.out.println("b) List All Customers"); 
					System.out.println("c) Add House Details");
					System.out.println("d) Edit House Details");
					System.out.println("e) List All Houses");
					System.out.println("f) Record A Sale");
					System.out.println("g) Edit A Sale");
					System.out.println("h) List Sales");			
				}
			}
		}
		scan.close();
	}
}
