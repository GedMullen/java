import java.util.ArrayList;

public class Model {

	ArrayList<House> houses = new ArrayList<House>();
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	House houseToEdit = null;
		
	public void populateHouses(){
		Component tap = new Component("tap");
		Component shower = new Component("shower");
		Component hob = new Component("hob");
		
		ArrayList<Component> kitchenComponents = new ArrayList<Component>();
		kitchenComponents.add(tap);
		kitchenComponents.add(hob);
		
		Room kitchen = new Room("Kitchen", kitchenComponents);

		ArrayList<Component> bathRoomComponents = new ArrayList<Component>();
		bathRoomComponents.add(tap);
		bathRoomComponents.add(shower);		
		
		Room bathRoom = new Room("BathRoom", bathRoomComponents);

		ArrayList<Component> showerRoomComponents = new ArrayList<Component>();
		showerRoomComponents.add(shower);		
				
		Room showerRoom = new Room("ShowerRoom", showerRoomComponents);
				
		ArrayList<Room> masonryRooms = new ArrayList<Room>();
		masonryRooms.add(kitchen);
		masonryRooms.add(showerRoom);
		
		Masonry masonry = new Masonry("Red", 2, 4, masonryRooms, 2);
		
		houses.add(masonry);
		
		ArrayList<Room> timberRooms = new ArrayList<Room>();
		timberRooms.add(kitchen);
		timberRooms.add(bathRoom);
		
		Timber timber = new Timber("Blue", 2, 4, timberRooms, "Spruce");
		
		houses.add(timber);
		rooms.add(kitchen);
		rooms.add(bathRoom);
		rooms.add(showerRoom);
	}
	
	public void populateCustomers(){
		
		SubContractor subContractor1 = new SubContractor("Bob The Builder", true, true);
		SubContractor subContractor2 = new SubContractor("Jeff The Builder", true, true);
		
		Quote quote1 = new Quote(houses.get(0), subContractor1, 200000);
		Quote quote2 = new Quote(houses.get(1), subContractor2, 400000);
		
		Customer customer1 = new Customer("smith", "password", quote1);
		Customer customer2 = new Customer("jones", "password", quote2);
		
		customers.add(customer1);
		customers.add(customer2);
	}

	public void listCustomers(){
		System.out.println("Customers:");
		System.out.println("Username \tQuote Price \tHouse \tSubcontractor");
		for (Customer customer : customers) {
			System.out.print(customer);
		}
		System.out.println("\n\n");
	}
	
	public boolean checkLogin(String username, String password) {
		
		for (Customer customer : customers) {
			if(customer.getUsername().equals(username) && customer.getPassword().equals(password))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Model [houses=" + houses + ", customers=" + customers + "]";
	}

	public void addCustomer(String username, String password) {
		Customer customer = new Customer(username, password);
		customers.add(customer);
	}

	private Room getRoomByName(String name){ 
		Room matchedRoom = null;
		Logger.log("Looking for room: " + name);
		for (Room room : rooms) { 
			if(room.getType().equals(name)){
				matchedRoom = room;
				Logger.log(matchedRoom.getType());
			}
		}			
		return matchedRoom;
	}
	
	//match the room objects with the list provided
	private ArrayList<Room> getRoomsFromList(ArrayList<String> roomList){
	
		ArrayList<Room> matchingRooms = new ArrayList<Room>();
		Room matchedRoom;
		for (String roomName : roomList) {
			matchedRoom = getRoomByName(roomName);
			matchingRooms.add(matchedRoom);
		}	
		return matchingRooms;
	}
	
	public void addTimberHouse(String name, String squareFootage, String cost, ArrayList<String> roomList,
			String timberType) {
		
		ArrayList<Room> rooms = getRoomsFromList(roomList);
		Timber timber = new Timber(name, Integer.parseInt(squareFootage), 
				Integer.parseInt(cost), rooms, timberType);
		houses.add(timber);
	}

	public void addMasonryHouse(String name, String squareFootage, String cost, ArrayList<String> roomList,
			String maxFloors) {
		
		ArrayList<Room> rooms = getRoomsFromList(roomList);
		Masonry masonry = new Masonry(name, Integer.parseInt(squareFootage), 
				Integer.parseInt(cost), rooms, Integer.parseInt(maxFloors));
		houses.add(masonry);
	}

	public String getHouse(String name) {
		
		String type = "";
		for (House house : houses) {
			if(house.getName().equals(name)){
				houseToEdit = house;
				if(house instanceof Timber){
					type = "t";
				}else{
					type = "m";
				}
			}
		}	
		return type;
	}

	public void editTimberHouse(String squareFootage, String cost, ArrayList<String> roomList, String timberType) {
		
		Timber timber = (Timber)houseToEdit;
		timber.setSquareFootage(Integer.parseInt(squareFootage));
		timber.setMaterialCost(Integer.parseInt(cost));
		timber.setType(timberType);
		ArrayList<Room> rooms = getRoomsFromList(roomList);
		timber.setRooms(rooms);
	}

	public void editMasonryHouse(String squareFootage, String cost, ArrayList<String> roomList, String maxFloors) {

		Masonry masonry = (Masonry)houseToEdit;
		masonry.setSquareFootage(Integer.parseInt(squareFootage));
		masonry.setMaterialCost(Integer.parseInt(cost));
		masonry.setMaxFloors(Integer.parseInt(maxFloors));
		ArrayList<Room> rooms = getRoomsFromList(roomList);
		masonry.setRooms(rooms);		
	}
}
