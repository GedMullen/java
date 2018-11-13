import java.util.ArrayList;

public class House {
	protected int materialCost = 0;
	protected int numberOfRooms = 0;
	protected int squareFootage = 0;
	protected ArrayList<Room> rooms;
	
	public House(int materialCost, int numberOfRooms, int squareFootage, ArrayList<Room> rooms) {
		super();
		this.materialCost = materialCost;
		this.numberOfRooms = numberOfRooms;
		this.squareFootage = squareFootage;
		this.rooms = rooms;
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public int getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getSquareFootage() {
		return squareFootage;	
	}
	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}

	@Override
	public String toString() {
		return "House [materialCost=" + materialCost + ", numberOfRooms=" + numberOfRooms + ", squareFootage="
				+ squareFootage + ", rooms=" + rooms + "]";
	}
	
	
}
