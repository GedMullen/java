import java.util.Scanner;

public class Controller {
	
	private Scanner scan = new Scanner(System.in);

	private void menuStart(){
		boolean isCorrectLogin = false;
		//keep looping until they enter in a correct username and password
		while (!isCorrectLogin) {
			System.out.println("Please enter your user name.");
			String username = scan.next();
			System.out.println("Please enter your password.");
			String password = scan.next();
		}
		scan.close();		
	}
	
	public static void main(String[] args) {

		Controller controller = new Controller();
		controller.menuStart();		
	}
}
