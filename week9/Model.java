import java.util.ArrayList;

public class Model {

	ArrayList<House> houses = new ArrayList<House>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
		
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
		
		Masonry masonry = new Masonry(2, 4, 3, masonryRooms, 2);
		
		houses.add(masonry);
		
		ArrayList<Room> timberRooms = new ArrayList<Room>();
		timberRooms.add(kitchen);
		timberRooms.add(bathRoom);
		
		Timber timber = new Timber(2, 4, 3, timberRooms, "Spruce");
		
		houses.add(timber);
	}
	
	public void populateCustomers(){
		
		SubContractor subContractor1 = new SubContractor("Bob The Builder", true, true);
		SubContractor subContractor2 = new SubContractor("Jeff The Builder", true, true);
		
		Quote quote1 = new Quote(houses.get(0), subContractor1, 200000);
		Quote quote2 = new Quote(houses.get(1), subContractor2, 400000);
		
		Customer customer1 = new Customer("Smith", "password", quote1);
		Customer customer2 = new Customer("Jones", "password", quote2);
		
		customers.add(customer1);
		customers.add(customer2);
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
}
