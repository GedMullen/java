import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	protected Model model = new Model();
	Scanner scan = new Scanner(System.in);

	private void populateModel(){
		if(isFirstTime()){
			model.populateHouses();
			model.populateCustomers();
		}else{
			getSerializedModel();
		}
	}
	
	private void printModel(){
		System.out.println(model);
	}
	
	private void startCustomerMenu(){
		while(true){
			System.out.println("a) Edit Profile"); 
			System.out.println("b) Search For A House"); 
			System.out.println("c) Login"); 
			System.out.println("d) Exit"); 
			String option = scan.next();
	        char i = option.charAt(0); 
	        switch(i){
	        	case 'a': editCustomer(); break;
	        	case 'b': findHouse(); break;
	            case 'c': menuStart(); break;
	            case 'd': exit(); break;
	        }
        }
	}
	
	private void startAdminMenu(){
		while(true){
			System.out.println("a) Add Customer");
			System.out.println("b) List All Customers"); 
			System.out.println("c) Add House Details");
			System.out.println("d) Edit House Details");
			System.out.println("e) List All Houses");
			System.out.println("f) Record A Quote");
			System.out.println("g) Edit A Quote");
			System.out.println("h) List Quotes");					
			System.out.println("i) Login");					
			System.out.println("j) Exit");					
			String option = scan.next();
	        char i = option.charAt(0); 
	        switch(i){
	            case 'a': addCustomer(); break;
	            case 'b': model.listCustomers(); break;
	            case 'c': addHouse(); break;
	            case 'd': editHouse(); break;
	            case 'e': model.listHouses(); break;
	            case 'f': addQuote(); break;
	            case 'g': addQuote(); break;
	            case 'h': model.listCustomers(); break;
	            case 'i': menuStart(); break;
	            case 'j': exit(); break;
	        }
		}
	}

	private void exit(){
		storeSerializedModel();
		System.exit(0);
	}

	private void addQuote(){
		System.out.println("Please enter customer user name.");
		String username = scan.next();
		System.out.println("Please enter house name.");
		String house = scan.next();
		System.out.println("Please enter Subcontractor name");
		String subCon = scan.next();
		System.out.println("Please enter price.");
		String price = scan.next();
		model.addQuote(username, house, subCon, price);
	}

	private void addCustomer(){
		System.out.println("Please enter customer user name.");
		String username = scan.next();
		System.out.println("Please enter customer password.");
		String password = scan.next();
		model.addCustomer(username, password);
		//startAdminMenu();
	}
	
	private void addHouse(){
		System.out.println("Please enter t for timber house and m for masonry house.");
		String type = scan.next();
		System.out.println("Please enter house name.");
		String name = scan.next();
		System.out.println("Please enter square footage.");
		String squareFootage = scan.next();
		System.out.println("Please enter cost.");
		String cost = scan.next();
		String room = "";
		ArrayList<String> roomList = new ArrayList<String>();
		while(!room.equals("finished")){
			System.out.println("Please enter a room name to add or 'finished' when done.");
			room = scan.next();
			if(!room.equals("finished")) roomList.add(room);
		}
		if(type.equals("t")){
			System.out.println("Please enter timber type.");
			String timberType = scan.next();
			model.addTimberHouse(name, squareFootage, cost, roomList, timberType);
		}else{
			System.out.println("Please enter the maximum number of floors.");
			String maxFloors = scan.next();
			model.addMasonryHouse(name, squareFootage, cost, roomList, maxFloors);			
		}
	}

	private void editHouse(){
		
		System.out.println("Please enter house name.");
		String name = scan.next();
		String type = model.getHouse(name);
		if(type.contentEquals("t")){
			editTimberHouse();
		}else{
			editMasonryHouse();
		}
	}
	
	private void editTimberHouse(){
		
		System.out.println("Please enter square footage.");
		String squareFootage = scan.next();
		System.out.println("Please enter cost.");
		String cost = scan.next();
		String room = "";
		ArrayList<String> roomList = new ArrayList<String>();
		while(!room.equals("finished")){
			System.out.println("Please enter a room name to add or 'finished' when done.");
			room = scan.next();
			if(!room.equals("finished")) roomList.add(room);
		}
		System.out.println("Please enter timber type.");
		String timberType = scan.next();
		model.editTimberHouse(squareFootage, cost, roomList, timberType);
	}
	
	private void editMasonryHouse(){
		
		System.out.println("Please enter square footage.");
		String squareFootage = scan.next();
		System.out.println("Please enter cost.");
		String cost = scan.next();
		String room = "";
		ArrayList<String> roomList = new ArrayList<String>();
		while(!room.equals("finished")){
			System.out.println("Please enter a room name to add or 'finished' when done.");
			room = scan.next();
			if(!room.equals("finished")) roomList.add(room);
		}
		System.out.println("Please enter the maximum number of floors.");
		String maxFloors = scan.next();
		model.editMasonryHouse(squareFootage, cost, roomList, maxFloors);
	}
	
	private void editCustomer(){
		
		System.out.println("Please enter new user name.");
		String newUsername = scan.next();
		System.out.println("Please enter new password.");
		String password = scan.next();
		model.editCustomer(newUsername, password);
	}
	
	private void findHouse(){
		
		System.out.println("Please enter house name.");
		String name = scan.next();
		model.findHouse(name);
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
	}
	
	public boolean isFirstTime() {

		//if the model.ser file exists then this isn't the first time
		File model = new File("model.ser");
		if (model.exists()) {
			return false;
		} else {
			return true;
		}
	}
	
	public void storeSerializedModel() {
		try {
			FileOutputStream fileOut = new FileOutputStream("model.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(model);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getSerializedModel() {
		
		try {
			FileInputStream fileIn = new FileInputStream("model.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			model = (Model) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Model class not found");
			c.printStackTrace();
			return;
		}
	}
	
	public static void main(String[] args) {

		try{
			Controller controller = new Controller();
			controller.populateModel();
			//controller.printModel();
			controller.menuStart();
		}catch(NumberFormatException e){
			System.out.println("Error - You entered a String when I was expecting a number!");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Error - Please enter valid data.");
			e.printStackTrace();
		}
	}
}
