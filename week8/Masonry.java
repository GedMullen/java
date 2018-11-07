import java.util.ArrayList;

public class Masonry extends House {
	
	private int maxFloors = 0;

	public Masonry(int materialCost, int numberOfRooms, int squareFootage, ArrayList<Room> rooms, int maxFloors) {
		super(materialCost, numberOfRooms, squareFootage, rooms);
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
		return "Masonry [maxFloors=" + maxFloors + ", materialCost=" + materialCost + ", numberOfRooms=" + numberOfRooms
				+ ", squareFootage=" + squareFootage + ", rooms=" + rooms + "]";
	}
	
	

}
