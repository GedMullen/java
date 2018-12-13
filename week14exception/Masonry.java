import java.util.ArrayList;

public class Masonry extends House {
	
	private int maxFloors = 0;

	public Masonry(String name, int materialCost, int squareFootage, ArrayList<Room> rooms, int maxFloors) {
		super(name, materialCost, squareFootage, rooms);
		this.maxFloors = maxFloors;
	}

	public int getMaxFloors() {
		return maxFloors;
	}

	public void setMaxFloors(int maxFloors) {
		this.maxFloors = maxFloors;
	}

	@Override
	public String toString() {
		
		String s = "\n" + name + "\tMas" + "\t" + materialCost;
		s += "\t" + squareFootage + "\tMax Floors=" + maxFloors;
		s += "\nRooms";
		for (Room room : rooms) {
			s+=room.toString();
		}
		return s;
	}


}
