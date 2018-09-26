import java.util.Objects;
import java.util.Scanner;

public class Controller 
{
	
	private Scanner scan = new Scanner(System.in);
	private Exercise warmups = new Exercise();
	

	private void menuStart()
	{
		boolean isCorrectUsername = false;
		boolean isCorrectPassword = false;
		String correctUsername = "andrewb10";
		String correctPassword = "notReal";
		
		//keep looping until they enter in a correct username and password
		while (!isCorrectUsername || !isCorrectPassword) {
			System.out.println("Please enter your user name.");
			String username = scan.next();
			System.out.println("Please enter your password.");
			String password = scan.next();
		
			isCorrectUsername = correctUsername.equals(username);
			isCorrectPassword = correctPassword.equals(password);

			if (!isCorrectUsername || !isCorrectPassword)
				System.out.println("Incorrect login please try again");
		}
		System.out.println("Please enter your name.");
		String name = scan.next();
		System.out.println("Please enter your age.");
		int age = scan.nextInt();
		
		System.out.println("Correct Login Details. Welcome " + name);
		System.out.println("Your age is " + age);
	}
	
	public void menu()
	{
		boolean programExit = false;
		String excerciseChoice = "";
		while (programExit == false)
		{
			System.out.print("Please enter which excercise you want to execute: ");
			excerciseChoice = scan.next();
			
			switch(excerciseChoice) 
			{
			   case "1" :
			      warmups.count();
			     break;
			     	
			   case "2" :
				   warmups.sumEvenOdd(1,30);
			      break; 
			   
			   case "3" :
				   warmups.sumAndAverageEx3(1,30);
			      break;
			      
			   case "4" :
				   warmups.sumAndAverageEx4(30);
			      break;
			      
			   case "5" :
				   warmups.sumAndAverageEx5(111,8899);
			      break;
			      
			   case "6" :
				   warmups.totalOdd(111,8899);
			      break;
			      
			   case "7" :
				   warmups.divide7Average(111,8899);
			      break;
			      
			   case "8" :
				   warmups.squares(1,100);
			      break;
			      
			   case "9" :
				   warmups.moonWeight(1.00,100.00);
			      break;
			      
			   case "10" :
				   warmups.pattern();
			      break;
			      
			   case "11" :
				   warmups.multiplesOfnine();
			      break;
			      
			   case "quit" :
				   System.out.println("");
				   System.out.println("You have exited the program, goodbye");
				   programExit = true;
			      break;
			   
			   default : 
				   System.out.println("Please enter between 1 - 9 or enter quit to exit the program");
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) 
	{
		Controller controller = new Controller();
		controller.menuStart();	
		controller.menu();
	}
}
